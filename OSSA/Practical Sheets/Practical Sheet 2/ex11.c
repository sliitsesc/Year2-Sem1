#include <stdio.h>
#include <sys/types.h>
#include <unistd.h>

int main()
{
    int id;
    if((id = fork()) == 0)
    {
        printf("I'm child process\n");
        sleep(10);
    }
    else
    {
        printf("I'm parent process \n");
    }
}