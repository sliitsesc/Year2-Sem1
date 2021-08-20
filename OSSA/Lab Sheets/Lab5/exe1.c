// type: gcc -pthread -o term term.c
#include <stdio.h>
#include <pthread.h>
#define NUM_THREADS 25    //define the number of thread
int thread_routine(int x) //routine funtion pass x
{
        printf("I am thread %2d my TID is %lu\n", x, pthread_self()); //return the id for the calling thread
        pthread_exit(0);                                              //terminate the calling thread
}
int main()
{
        pthread_attr_t thread_attr;
        pthread_t //type accosiated with thread
            tids[NUM_THREADS];
        int x;                           //number of threads -> tid
        pthread_attr_init(&thread_attr); //inti -> to initialize the default value
        for (x = 0; x < NUM_THREADS; x++)
        {
                //pthread create function
                pthread_create(&tids[x], &thread_attr,
                               (void *)thread_routine, (void *)x); //we are calling the routine function
        }
        printf("Waiting for threads to finish\n");
        for (x = 0; x < NUM_THREADS; x++) //this will pthread create function will call 25 times
        {
                pthread_join(tids[x], NULL); //pthread_join functio() -> passing two parameters/ wait for a thread to terminate
        }
        printf("All threads are now finished\n");
}
