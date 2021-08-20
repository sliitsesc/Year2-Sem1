#include <stdio.h>
int main()
{
    int ret, i;

    ret = fork();

    if (ret == 0)
    {
        for (i = 0; i <= 100; i++)
        {
            if (i % 2 == 0)

            {

                printf("%d\n", i);
            }
        }
    }
    else
    {
        wait();
    }
}
