#include <stdio.h>
#include <unistd.h>
int value = 60;
int main()
{
    pid_t pid;
    pid = fork();
    if (pid == 0)
    {
        value = value + 20;
    }
    else if (pid > 0)
    {
        value = value - 20;
        printf("PARENT: value= %d \n", value); //Line A
        wait(NULL);
    }
}
//Consider the following program. What will be the output in Line A?
//answer ->PARENT: value= 40