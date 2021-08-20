package main

import (
	"context"
	"fmt"
	"math/rand"
	"sync"
)

var NUMITEMS = 10

func main() {
	var mutex = &sync.Mutex{}
	var wg sync.WaitGroup
	var state = make(map[int]int)
	channel := make(chan int)
	defer close(channel)
	ctx, _ := context.WithCancel(context.Background())

	wg.Add(4)

	go consumer(&wg, state, mutex)
	go producer(&wg, state, mutex)
	go reader(&wg, channel, ctx)
	go writer(&wg, channel, ctx)

	wg.Wait()
}

func producer(wg *sync.WaitGroup, buff map[int]int, mutex *sync.Mutex) {
	defer wg.Done()

	for w := 0; w < NUMITEMS; w++ {
		mutex.Lock()
		buff[w] = rand.Intn(1000)
		mutex.Unlock()
	}
}

func consumer(wg *sync.WaitGroup, buff map[int]int, mutex *sync.Mutex) {
	defer wg.Done()

	for w := 0; w < NUMITEMS; w++ {
		mutex.Lock()
		fmt.Println(buff[w], "-")
		mutex.Unlock()
	}

	//fmt.Println("Done mutex")
}

func writer(wg *sync.WaitGroup, ch chan<- int, ctx context.Context) {
	defer wg.Done()

	for w := 0; w < NUMITEMS; w++ {
		select {
		case <-ctx.Done():
			fmt.Println("Exiting from writing go routine")
			return
		case ch <- rand.Intn(1000):
			//time.Sleep(1 * time.Second)
			fmt.Print("|")
		}
	}
}

func reader(wg *sync.WaitGroup, ch <-chan int, ctx context.Context) {
	defer wg.Done()

	for w := 0; w < NUMITEMS; w++ {
		select {
		case <-ctx.Done():
			fmt.Println("Exiting from reading go routine")
			return
		case v, ok := <-ch:
			if !ok {
				fmt.Println("Channel has been closed")
				return
			}

			fmt.Println(v)
		}
	}

	//fmt.Println("Done context")
}
