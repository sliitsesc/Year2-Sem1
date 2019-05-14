#include <stdio.h>
#include <sys/types.h>
#include <unistd.h>

int main()
{
    int id;
    if((id = fork()) == 0)
    {
        printf("I'm child process\n");
    }
    else
    {
        while(1)
        sleep(100);
    }
}