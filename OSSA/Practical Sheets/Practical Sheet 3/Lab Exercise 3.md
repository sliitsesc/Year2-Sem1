## Lab Exercise 3

### Step 1 

```c
#include <stdio.h>
#include <unistd.h>

int main(){
    int i;

    for(i = 0;i < 10; i++){
        if(pid = fork() < 0){
            //error
        } else if (pid == 0){
            function_A();
            return 0;
        }
        printf("Process ID : %d \n", pid);// Line A
    }

    for(i = 0;i < 10; i++) //Line B
        wait();
}
```
1. How many new processes are created in the program? Why?

        10