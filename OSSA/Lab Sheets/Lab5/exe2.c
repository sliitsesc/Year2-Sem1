// type: gcc -pthread -o exe2 exe2.c
#include <pthread.h>
#include <stdio.h>
#include <stdlib.h>
#define BSIZE 4
#define NUMITEMS 30
typedef struct //begining of structure
{
  char buf[BSIZE];
  int occupied;
  int nextin, nextout;
  pthread_mutex_t mutex; //mutex is a kind of a lock
  pthread_cond_t more;   //two conditions more and less
  pthread_cond_t less;
} buffer_t;

buffer_t buffer; //name of the object

void *producer(void *); //function prototypes
void *consumer(void *);

#define NUM_THREADS 2
pthread_t tid[NUM_THREADS]; //array of thread ids

int main(int argc, char *argv[])
{
  int i;

  pthread_cond_init(&(buffer.more), NULL); //initialize the two conditional varialbles
  pthread_cond_init(&(buffer.less), NULL);

  pthread_create(&tid[1], NULL, consumer, NULL); //third parameter is function
  pthread_create(&tid[0], NULL, producer, NULL);

  for (i = 0; i < NUM_THREADS; i++)
    pthread_join(tid[i], NULL);

  printf("\nmain() reporting that all %d threads have terminated\n", i);
}

void *producer(void *parm)
{
  char item[NUMITEMS] = "it is a small world, after all";
  int i;
  printf("producer started.\n");
  for (i = 0; i < NUMITEMS; i++)
  { //produce an item, one character from item[]
    if (item[i] == '\0')
      break; //quit if at end of string
    pthread_mutex_lock(&(buffer.mutex));

    if (buffer.occupied >= BSIZE)
      printf("Producer waiting\n");
    while (buffer.occupied >= BSIZE)
      pthread_cond_wait(&(buffer.less), &(buffer.mutex)); //at the same time release the mutex
    printf("Producer executing\n");

    buffer.buf[buffer.nextin++] = item[i];
    buffer.nextin %= BSIZE;
    buffer.occupied++;
    /*now: either buffer.occupied < BSIZE and buffer.nextin is the index of the index of the next empty slot in the buffer, or next(occupied) slot that will be emptied by a consumer(such as buffer.nextin == buffer.nextout) */
    pthread_cond_signal(&(buffer.more));
    pthread_mutex_unlock(&(buffer.mutex));
  }
  printf("producer exiting\n");
  pthread_exit(0);
}

void *consumer(void *parm)
{
  char item;
  int i;

  printf("consumer started\n");
  for (i = 0; i < NUMITEMS; i++)
  {
    pthread_mutex_lock(&(buffer.mutex));
    if (buffer.occupied <= 0)
      printf("consumer waiting\n");
    while (buffer.occupied <= 0)
      pthread_cond_wait(&(buffer.more), &(buffer.mutex));
    printf("consumer executing\n");

    item = buffer.buf[buffer.nextout++];
    printf("%c\n", item);
    buffer.nextout %= BSIZE;
    buffer.occupied--;
    /*now: either buffer.occupied > 0 and buffer.nextout is the index of the next occupied slot in the buffer, or the next occupied slot in the buffer or buffer.occupied == 0 and buffer.nextout is the index of the next (empty) slot that will be filled by a producer (such as buffer.nextout == buffer.nextin)  */
    pthread_cond_signal(&(buffer.less));
    pthread_mutex_unlock(&(buffer.mutex));
  }
  printf("consumer exiting\n");
  pthread_exit(0);
}
