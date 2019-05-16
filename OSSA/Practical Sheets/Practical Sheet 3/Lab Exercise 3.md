
## Lab Exercise 3

  

### Step 1

  

```c

#include  <stdio.h>

#include  <unistd.h>

  

int  main(){

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

  

	* 10

  

2. Which process, the parent or the child, executes function_A()? Why?

	* Child process will execute it.Because fork() return value is zero in child process.

  

3. Whose PID, the parent or the child, is printed in Line A? Why?

  

	* Both pid will print as it is outside the scope of else if.

  

4. What is the purpose of the loop (with its wait()) in Line B?

  

	* To execute Child Process first.

  
  

### Step 2

  

Consider the following C program.
```c
// Assume variables i and pid, and constant N have been properly defined/or initialized and there is no syntax error.

int  main ()

{

	for(i =0; i < N; i++) {
		pid=fork ();
	}

}

```

  

1. For N=5, How many processes are created when the program is executed?

	* 31 processes created.

  

2. Modify the program so that only the parent process creates 3 child processes, and each

	new created process calls a function CPU(). In addition, make the parent process wait for

	each child’s termination.

  

```c

int  main ()

{

	for(i = 0; i < 2; i++) {

		pid=fork ();
		if(pid==0){
			CPU();
		}
		else{
			wait();
		}
	}
}

```

  

### Step 3

  

Consider the following program. What will be the output in Line A?

  

```c

int value = 60;

int  main()

{

	pid_t pid;
	pid = fork();
	if (pid == 0) {
		value = value + 20;
	}
	else if (pid > 0) {
		value = value -20;
		printf("PARENT: value= %d \n", value); //Line A
		wait (NULL);
	}

}

```

  

* The output is 40.

  
  

### Step 4

  

Consider the following program.

  

```c

#include  <sys/types.h>
#include  <stdio.h>
#include  <unistd.h>

int value = 100;
int  main()
{
	pid_t pid;
	pid = fork();
	if (pid == 0) {
		value = value + 15;
	}
	else if (pid > 0) {
		value = value -15;
		printf("PARENT: value= %d \n", value);//Line A
		wait (NULL);
	}

}

```

1. What will be the output in Line A? Justify your answer.

  

	* 85

  

2. Do you think there is synchronization problem in updating the variable value? Justify your answer.

  

	* No.When fork() system call executed a separate copy of memory segment is created for child process.

  

### Step 5

Consider the following programs A and B.

  

```c

// Program A

int  main()

{
	pid_t pid;
	int i;
	for (i=0; i<4; i++)
		pid = fork();
}

// Program B

int value = 30;
int  main()
{
	pid_t pid;
	pid = fork();
	if (pid == 0)
		value = value + 15;
	else if (pid > 0) {
		value = value -15;
		wait (NULL);
	}
	printf("Value= %d \n", value); //Line A
}

```

  

1. How many times will the fork () function be called in Program A? (i.e., how many processes are created?) Justify	 		your answer.

	  * Fork function will be called for 4 times.15 processes will be created.

  

2. What is the output of Line A in Program B? Justify your answer.

	* 45
15
	* Both values will be printed as printf statement is outside both selection scopes.