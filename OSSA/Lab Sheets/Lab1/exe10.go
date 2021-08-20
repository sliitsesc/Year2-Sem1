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
	}()
	for {
		time.Sleep(time.Microsecond * 20)
	}
}
