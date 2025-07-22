package main

import "fmt"

func useFunc(f func(int, int) int, x, y int) {
	fmt.Println("Answer :", f(x, y))
}

func sumValues(x, y int) int {
	return x + y
}

func main() {
	// Closures are functions that are not associated with identifier but a variable
	intSum := func(x, y int) int { return x + y }
	fmt.Println("5 + 4 =", intSum(5, 4))

	// Changes variable outside of a function
	sample1 := 1
	changeVar := func() { sample1++ }
	changeVar()
	fmt.Println("sample1 :", sample1)

	// Can pass function as a parameter
	useFunc(sumValues, 5, 8)
}
