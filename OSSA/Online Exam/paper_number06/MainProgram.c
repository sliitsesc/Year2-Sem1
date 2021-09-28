#include <stdio.h>
#include <unistd.h>
#include <pthread.h>
#include <sys/types.h>
#include <sys/wait.h>

void *thread_func(){
   
    int i = 1;
    for(int j = i ; j < 10 ; j++){
      i += 1;
      int trNum = i*(i+1)/2;
      if (trNum <= 10){     //check traingular number less than equal to 10.
        printf("%d\n", trNum);
      }
    }
   

};


int main(){

    pthread_t tid;
    int number;

    printf("Input a Number :");
    scanf("%d", &number);//get integer number from user

    pthread_create(&tid, NULL, thread_func, NULL);//create a thread

    pthread_join(tid, NULL);
    
    int cNum;
    for(int i = 1 ; i <= 10 ; i++){
        cNum = i * i * i;
        if (cNum > number){//cubic numbers less than number
                break;
        }else{
                printf("%d * %d * %d = %d\n" ,i,i,i,cNum) ;
        }
    }

  return 0;
}