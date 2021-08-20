//system ( ) library function

#include <stdio.h>
int main()
{
        printf("Here comes the date. \n");
        system("date"); //only need to pass command
        //after the system() library function it can execute next line also
        //in execl we cannot execute after execl but in system() library function we can do that
        printf("That was the date");
}
