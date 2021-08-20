package main

import (
	"fmt"
	"os"
	"sync"
)

func main() {
	var wg sync.WaitGroup

	for i := 0; i < 10; i++ {
		wg.Add(1)
		go a(&wg)
	}
	fmt.Printf("process ID: %d \n", os.Getpid())

	wg.Wait()
}

func a(wg *sync.WaitGroup) {
	defer wg.Done()
	fmt.Printf("Hello World\n")
}
