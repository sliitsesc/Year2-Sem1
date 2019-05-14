#include <stdio.h>
#include <sys/types.h>
#include <unistd.h>

int main ()
{
    printf("Here comes the date. \n");
    fork();
    execl("/bin/date", "date", 0);
    printf("That was the date. \n");
}