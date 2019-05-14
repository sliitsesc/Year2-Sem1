#include <stdio.h>
#include <sys/types.h>
#include <unistd.h>

int main()
{
    int ret;
    printf("I'm Parent\n");
    ret = fork();
    printf("Return Value : %d\n", ret);
}