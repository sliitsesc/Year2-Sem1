#include <stdio.h>
#include <sys/types.h>
#include <unistd.h>

int main()
{
    int ret;

    printf("Hello World\n");
    ret = fork();

    if(ret == 0)
        printf("I'm child and return value = %d\n", ret);
    else
        printf("I'm parent and return value = %d\n", ret);
}