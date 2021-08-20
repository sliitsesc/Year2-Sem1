package main

import (
	"fmt"
	"os"
	"time"
)

func main() {
	fmt.Printf("Parent PID: %d\n", os.Getpid())
	go func() {
		fmt.Printf("Child PID: %d\n", os.Getpid())
		fmt.Printf("Child's Parent PID: %d\n", os.Getppid())
	}()
	time.Sleep(time.Microsecond * 20)
}
