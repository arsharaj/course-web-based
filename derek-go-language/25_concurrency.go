package main

import (
	"fmt"
	"time"
)

func printTo15() {
	for i := 1; i <= 15; i++ {
		fmt.Println("Fun 1 :", i)
	}
}

func printTo10() {
	for i := 1; i <= 10; i++ {
		fmt.Println("Fun 2 :", i)
	}
}

func main() {
	// Concurrency allows us to execute blocks of code by sharing the execution time
	// Concurrent threads are called goroutines
	// You cannot trust as to which function will execute first
	// Goroutines communicate via channels
	go printTo10()
	go printTo15()
	time.Sleep(2 * time.Second)
}
