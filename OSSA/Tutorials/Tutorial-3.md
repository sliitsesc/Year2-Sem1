# Tutorial 3

### 1. Describe the actions taken by a kernel to context switch between processes?

### 2. A process is a program in execution, and therefore a process is more than just the program. Explain why a processis different from a program?

### 3.Consider the following program. What will be the output in Line A?
```
#include <stdio.h> 
#include <sys/types.h> 
#include <unistd.h> 
#include <sys/wait.h>

int value = 60;
int main()
{
    pid_t pid;
    pid = fork();
    if(pid == 0) {
        value += 20;
    } else if(pid > 0) {
        value -=20;
        printf("PARENT: value= %d \n", value); //Line A
        wait(NULL);
    }
}
```
Output :  
~$ PARENT: value= 40