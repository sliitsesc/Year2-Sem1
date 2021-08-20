#include <stdio.h>
int main()
{

    int ret;
    ret = fork();

    if (ret == 0)
    {
        printf("%d\n", getppid());
    }
    else
    {
        printf("parent\n");
    }
}