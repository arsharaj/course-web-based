package main

import "fmt"

func main() {
	fmt.Println("welcome to functions in go language")
	greeterFirst()
	greeterTwo()

	result := adder(3, 5)
	fmt.Println("result is :", result)

	proResult, status := proAdder(1, 2, 3, 4, 5)
	fmt.Println("result is :", proResult, status)
}

func adder(first, second int) int {
	return first + second
}

func greeterFirst() {
	fmt.Println("namastey from golang")
}

func greeterTwo() {
	fmt.Println("another method")
}

func proAdder(values ...int) (int, string) {
	total := 0
	for _, val := range values {
		total += val
	}
	return total, "Successful"
}
