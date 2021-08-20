package main

import (
	"fmt"
	"os"
)

func main() {
	fmt.Printf("pid : %d\n", os.Getpid())
	fmt.Printf("ppid : %d\n", os.Getppid())
}
