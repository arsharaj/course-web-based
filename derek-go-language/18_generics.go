package main

import (
	"fmt"
)

var println = fmt.Println

// Generic type parameter must be capitalized and in square brackets
type MyGenericType interface {
	int | float64
}

func getSumGen[T MyGenericType](x T, y T) T {
	return x + y
}

func main() {
	println("5 + 4 =", getSumGen(5, 4))
	println("5.6 + 4.7 =", getSumGen(5.6, 4.7))
	println("5 + 4.7 =", getSumGen(5, 4.7))
}
