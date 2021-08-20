//fork ( ) System call
//fork() -> to create a child process from current process
//kernal -> core of os
//system calls -> communicate with kernal

#include <stdio.h>
int main()
{
        printf("I am parent\n");
        fork(); //after executed created child process also. so there will be two hello world from parent and child processes
        printf("Hello world...!\n");
}
