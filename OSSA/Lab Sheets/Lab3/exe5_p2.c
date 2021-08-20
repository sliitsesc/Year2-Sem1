#include <stdio.h>
#include <unistd.h>
int value = 30;
int main()
{
        pid_t pid; //pid_t is a type
        pid = fork();
        if (pid == 0)
                value = value + 15;
        else if (pid > 0)
        {
                value = value - 15;
                wait(NULL);
        }
        printf("Value= %d \n", value); //Line A
}
//What is the output of Line A in Program B? Justify your answer.
//answer -> both values will print because it is outside of the if else if statement