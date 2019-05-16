#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>

int main()
{
    int num, ret;

    printf("Enter num : %d", num);
    ret = fork();

    if(ret == 0){
        printf("Child Output : %d \n", (num * 10));
    }else {
        printf("Parent Ouput : %d \n", (num / 5));
    }
}