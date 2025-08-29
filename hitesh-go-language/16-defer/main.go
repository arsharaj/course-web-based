package main

import "fmt"

func main() {
	defer fmt.Println("Arsh")
	defer fmt.Println("World")
	fmt.Println("Hello")
	deferredFunction()
}

func deferredFunction() {
	for i := 0; i < 5; i++ {
		defer fmt.Print(i, " ")
	}
}
