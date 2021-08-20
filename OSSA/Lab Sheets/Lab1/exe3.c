//fork does not take any arguments
//if an error occurs fork function will return negative int value that mean your child process not be created properly.
//if fork executed properly return two values -> id of child process and it will return zero.
//zero is return to child process id then child process id is return to the parent process.

#include <stdio.h>
int main()
{
        int ret;

        printf("I am parent\n");
        ret = fork();
        printf("Return value : %d\n", ret);
}
