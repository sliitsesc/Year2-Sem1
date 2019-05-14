#include <stdio.h>
#include <sys/types.h>
#include <unistd.h>

int main()
{
    printf("Here comes the date. \n");
    execl("/bin/date", "date", 0); // 0 means end-of-the args
    printf("That was the date. \n");
}