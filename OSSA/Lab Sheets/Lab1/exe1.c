//lab_1 -> Exercise_01
//Write a C program to print the process ID of the process and it’s parent process ID.

//process ID -> each any every process in unix has its own identifier
//to get process ID -> getpid()
//to get parent process ID -> getppid()

#include<stdio.h>
int main()
{
        printf("pid : %d\n",getpid());
        printf("ppid : %d\n",getppid());
}
