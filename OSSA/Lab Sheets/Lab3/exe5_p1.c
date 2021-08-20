#include <stdio.h>
#include <unistd.h>
int main()
{
        pid_t pid;
        int i;
        for (i = 0; i < 4; i++)
        {
                pid = fork();
                printf("hello world\n");
        }
        return 0;
}
//(i) How many times will the fork () function be called in Program A? (i.e., how
//many processes are created?) Justify your answer.
//answer ->in this one loop will run 2^4 -> 16 processes will create
