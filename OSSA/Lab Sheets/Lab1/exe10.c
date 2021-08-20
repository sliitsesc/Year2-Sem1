//ps -al -> to view the all processes process table
//Zombi Process
#include <stdio.h>
int main()
{
        int id;
        if ((id = fork()) == 0)
        {
                printf("I am child process \n");
                printf("pid : %d\n", getpid()); //child process have to exit so it has to go to parent process but parent process is in sleep
                //then execution suspened(parent) because child cannot exit
        }
        else
        {
                while (1)
                        sleep(100);
        }
}
