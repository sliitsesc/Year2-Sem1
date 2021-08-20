//execute commands within our script/code
#include <unistd.h>
#include <stdio.h>
int main()
{
        printf("Here comes the date. \n");
        //in execl arguments first -> path,second -> command name, third -> options, fourth -> end of the argument
        //execl("/bin/date", "date", 0); /*0 means end-of-arguments */
        execl("/bin/ls", "ls", "-a", "-l", 0);
        printf("That was the date. \n"); //the nature of execl is, after execute it.it will exit from the code so that this line will not print
}
