#include <stdio.h>
#include <sys/types.h>
#include <unistd.h>

int main()
{
    printf("Here comes the date. \n");
    system("date");
    printf("That was the date");
}