#include <stdio.h>
#include <sys/types.h>
#include <unistd.h>

int main()
{
    int ret;
    printf("Hello World\n");
    ret = fork();

    if(ret == 0){
        printf("I'm Child and Return Value = %d\n", ret);
        printf("Child PID : %d\n", getpid());
        printf("Child's Parent PID : %d\n", getppid());
    }else{
        printf("I'm Parent and Return Value = %d\n", ret);
        printf("Parent PID : %d\n", getpid());
    }

    sleep(20);
}