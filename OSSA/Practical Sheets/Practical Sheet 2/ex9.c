#include <stdio.h>
#include <sys/types.h>
#include <unistd.h>

int main()
{
    int i = 0; j = 0, pid;

    pid = fork();
    
    if(pid == 0)
    {
        for(i = 0; i < 500000 ; i++)
            printf("Child : %d\n", i++);
    }
    else
    {
        for(j = 0; j < 500000 ; j++)
            printf("Parent : %d\n", j++);
    }
}