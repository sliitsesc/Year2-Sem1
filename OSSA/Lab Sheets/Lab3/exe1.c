//fork is a system call -> use to create new process
//new process means-> child process/ by duplicating existing process
//fork can return three values -> negative values(then there is errror),zero(return child process),positive value(return parent process == child process id)
//existing process is a parent process
//calculate all the number of processes -> 2^n <-n == times of iterate
//calculate only new processes -> 2^n(-1)
//why we are using wait() -> we are telling parent process to wait until the all child process finish thier execution
#include <stdio.h>
#include <unistd.h>
void function_A()
{
    printf("Hello World\n");
}
int main()
{
    int i;
    int pid;
    for (i = 0; i < 10; i++)
    {
        if (pid = fork() < 0)
        {
            // error
        }
        else if (pid == 0)
        {
            function_A();
            return 0;
        }
        printf("process ID: %d \n", pid); // Line A
    }
    for (i = 0; i < 10; i++) //Line B
    {
        wait();
    }
}

//(i) How many new processes are created in the program? Why?
// answer -> 2^10-1 (we have to remove the parent process)
//(ii) Which process, the parent or the child, executes function_A()? Why?
//answer -> child process will execute function_A(), beacuse fork return value == zero
//(iii) Whose PID, the parent or the child, is printed in Line A? Why?
//answer -> child and parent both process id , beacuse printf statement belongs to both
//(iv) What is the purpose of the loop (with its wait()) in Line B?
//answer -> we are asking parent process to wait until all child process finish thier execution
