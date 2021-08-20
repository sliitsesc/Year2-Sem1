//Orphan Process
#include <stdio.h>
int main()
{
        int id;
        if ((id = fork()) == 0)
        {
                printf("I am child process \n");
                printf("pid : %d\n", getpid());
                sleep(10);
        }
        //while the child process sleeping parent process execute.but it there is wait function parent process will not execute until child process done
        //process id of init is one.
        else
        {
                printf("I am parent process \n");
        }
}
