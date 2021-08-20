//pipes -> oldest comunication mechanism in unix pipe() -> is a system call
//pipe is use to comunicate between two processes
//perror() -> also is a system call and it shows what is the error
#include <string.h>
#include <stdlib.h>
#include <stdio.h>
main()
{
    int pipefd[2];
    int i;
    char s[1000];
    char *s2;
    if (pipe(pipefd) < 0)
    {
        perror("pipe");
        exit(1);
    }
    s2 = "This is the message";
    write(pipefd[1], s2, strlen(s2));                    //strlen -> to get size of the array
    i = read(pipefd[0], s, 1000);                        //read system call read the content/file unique id for the readend,1000->size of array
    s[i] = '\0';                                         //'\0'->end of the line character
    printf("Read %d bytes from the pipe: '%s'\n", i, s); //s-> is array which is conatian the msg
}
