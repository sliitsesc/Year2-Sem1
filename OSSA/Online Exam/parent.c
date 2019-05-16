#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>

int main()
{
    int ret = fork();
    int childID = getpid();
    int parentID = getppid();

    if(ret == 0 )
    {
        printf("Child \n");
        exit(0);
    }
    else
    {
        wait();
        printf("Child ID : %d \n", childID);
    }
}