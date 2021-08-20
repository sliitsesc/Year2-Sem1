#include <stdio.h>
int main()
{
        int ret;

        printf("Hello World\n");
        ret = fork();
        if (ret == 0)
        {
                printf("I am Child and Return Value=%d\n", ret);
                printf("Child PID: %d\n", getpid());
                printf("Child's Parent PID: %d\n", getppid());
        }
        else
        {
                printf("I am Parent and Return Value=%d\n", ret);
                printf("Parent PID: %d\n", getpid());
        }
        sleep(20);
}
