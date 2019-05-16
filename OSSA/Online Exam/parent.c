#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>

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
        wait(NULL);
        printf("Child ID : %d \n", childID);
    }
}