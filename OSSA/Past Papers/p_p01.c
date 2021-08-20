#include <stdio.h>
int main()
{
    int a, ret;

    scanf("%d", &a);
    ret = fork();
    if (ret == 0)
    {
        if (a % 2 == 0)
        {
            printf("It is an even number\n");
        }
        else
        {
            printf("It is an odd number\n");
        }
    }
    else
    {
        wait();
    }

    return 0;
}
