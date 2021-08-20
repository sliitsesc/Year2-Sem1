#include <stdio.h>
#include <pthread.h>
#define NUM_THREADS 25 //number of threads
int thread_routine(int x)
{
        printf("I'm Thread %2d my TID is %u\n", x, pthread_self());
        pthread_exit(0); //function
}
int main()
{ //thread attributes are in main
        pthread_attr_t thread_attr;
        pthread_t tids[NUM_THREADS];
        int x;
        pthread_attr_init(&thread_attr); //default value
        for (x = 0; x < NUM_THREADS; x++)
        {
                pthread_create(&tids[x], &thread_attr, (void *)thread_routine, (void *)x);
        }
        printf("Waiting for threads to finish\n");
        for (x = 0; x < NUM_THREADS; x++)
        {
                pthread_join(tids[x], NULL); //its simmilar to wait() -> tell wait all the threads until done
        }
        printf("All treads are now finished\n");
}
