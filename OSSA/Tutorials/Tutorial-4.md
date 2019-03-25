# Tutorial 4

### 1. Describe the actions taken by a kernel to context switch between threads.
When a clock interrupt happen in response of that " the OS saves the PC and also the user stack pointer of the currently executing process .after this happen
Then OS Transfer all the control to interrupt handler of kernel clock.

Then the clock interrupt handler saves the rest such as register and other machine state.
After this, the OS call on the scheduler and order to determine the next process.
 Then OS in a way retrieve the process from its PCB and immadiately restore it.

### 2. Compare and contrast the processes and threads.
