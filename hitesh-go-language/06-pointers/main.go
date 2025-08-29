package main

import "fmt"

func main() {
	fmt.Println("welcome to the world of pointers")

	var ptr *int
	fmt.Println("value of ptr is", ptr)

	first := 23
	firstPtr := &first
	fmt.Println("value of first ptr is", firstPtr)
	fmt.Println("value of actual first ptr is", *firstPtr)

	*firstPtr = *firstPtr * 2
	fmt.Println("new value of actual first ptr is", first)
}
