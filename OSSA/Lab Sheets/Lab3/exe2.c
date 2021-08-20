// Assume variables i and pid, and constant N have been properly defined,
// and/or initialized and there is no syntax error.
#include <stdio.h>
#include <unistd.h>
void CPU();
int main()
{
        int i, pid;
        for (i = 0; i < 2; i++)
        {
                pid = fork();
                if (pid == 0)
                {
                        CPU();
                }
                else
                {
                        wait();
                }
        }
}
void CPU()
{
        printf("Hello world\n");
}

//(i) For N=5, How many processes are created when the program is executed?
//answer -> 2^5 , in this one we have to get all
//(ii)Modify the program so that only the parent process creates 3 child processes, and each
//new created process calls a function CPU(). In addition, make the parent process wait for each child’s termination.
//answer -> above code is the answer
