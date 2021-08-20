#include <stdio.h>
int main()
{
        printf("Here comes the date. \n");
        fork(); //create child process by fork
        //process will create -> child process create | then we will get date two times
        // parent and child are executing in program
        execl("/bin/date", "date", 0);
        //what ever have execl will not execute
        printf("That was the date. \n");
}
