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

### 4. Consider the following C program.
// Assume variables i and pid,have been properly defined, and/or initialized and there is no syntax error.

```
int main ( ) {
    for(i =0; i <3; i++) { 
        pid = fork (); 
    }
}
```
How many child processes are created when the program is executed?

### 5. Describe the difference among short-term, medium-term and long-term scheduling.

*Short-term scheduling* involves selecting one of the processes from the ready queue and scheduling them for execution. ... The short-term scheduler executes much more frequently than the long-term scheduler as a process may execute only for a few milliseconds. The choices of the short term scheduler are very important.

### 6. Describe the actions a kernel takes to context switch between processes.

### 7. Draw the diagram showing all possible process states and describe them.

### 8. Give two reasons for the system to select a new process to run.

### 9. What is the process control block? List at least four pieces of information that are included in the PCB

Process Control Block (PCB, also called Task Controlling Block, Entry of the Process Table, Task Struct, or Switchframe) is a data structure in the operating system kernel containing the information needed to manage the scheduling of a particular process.
![](https://1.bp.blogspot.com/-DoCFzIcQGDs/VlnGRLw69mI/AAAAAAAAAz0/xxrtrqK39FU/s1600/process%2Blooks%2Bin%2Bmemory.jpg)

