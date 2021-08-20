#include <stdio.h>
int main()
{
    int ret;

    ret = fork();

    {
        if (ret == 0)
        {
            printf("Child ID: %d\n", getpid());
            printf("Child's Parent PID: %d\n", getppid());
        }
        else
        {
            printf("child process ID :%d\n", ret);
            printf("Parent ID: %d\n", getpid());
        }
        wait();
    }
}