package main

import (
	"fmt"
)

var printf = fmt.Printf
var println = fmt.Println

func main() {
	// Array is a collection of values with same data type
	// The size of the array is fixed
	var arr1 [5]int
	arr1[0] = 1

	arr2 := [5]int{1, 2, 3, 4, 5}
	println("Index 0 :", arr2[0])
	println("Arr length :", len(arr2))
	for i := 0; i < len(arr2); i++ {
		println(arr2[i])
	}
	for i, v := range arr2 {
		printf("%d : %d\n", i, v)
	}

	// Multidimensional arrays
	arr3 := [2][2]int{
		{1, 2},
		{3, 4},
	}

	for i := 0; i < 2; i++ {
		for j := 0; j < 2; j++ {
			println(arr3[i][j])
		}
	}
}
