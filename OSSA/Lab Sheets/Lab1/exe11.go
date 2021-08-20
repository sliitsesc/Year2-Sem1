package main

import (
	"fmt"
	"os"
	"time"
)

func main() {
	go func() {
		fmt.Printf("I am child process \n")
		fmt.Printf("pid : %d\n", os.Getpid())
		time.Sleep(time.Second * 10)
	}()
	fmt.Printf("I am parent process \n")
}
