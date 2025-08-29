package main

import (
	"fmt"
	"sync"
)

func main() {
	fmt.Println("channels in go language")

	mychan := make(chan int, 2)
	wg := &sync.WaitGroup{}
	wg.Add(2)

	// mychan <- 5
	// fmt.Println(<-mychan)

	// receive only
	go func(ch <-chan int, wg *sync.WaitGroup) {
		val, isChanOpen := <-mychan
		fmt.Println(isChanOpen)
		fmt.Println(val)
		wg.Done()
	}(mychan, wg)

	// send only
	go func(ch chan<- int, wg *sync.WaitGroup) {
		mychan <- 0
		close(mychan)
		// mychan <- 6
		wg.Done()
	}(mychan, wg)

	wg.Wait()
}
