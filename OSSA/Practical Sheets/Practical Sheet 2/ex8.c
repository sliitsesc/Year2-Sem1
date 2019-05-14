#include <stdio.h>
#include <sys/types.h>
#include <unistd.h>
#include <stdlib.h> // required this header to call system function

int main()
{
    printf("Here comes the date. \n");
    system("date");
    printf("That was the date");
}