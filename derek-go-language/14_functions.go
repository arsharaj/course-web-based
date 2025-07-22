package main

import (
	"fmt"
)

var println = fmt.Println

func sayHello() {
	println("Hello")
}

func getSum(x int, y int) int {
	return x + y
}

func getTwoReturnValues(x int) (int, int) {
	return x + 1, x + 2
}

func getQuotient(x float64, y float64) (ans float64, err error) {
	if y == 0 {
		return 0, fmt.Errorf("You can't divide by zero.")
	} else {
		return x / y, nil
	}
}

// Varadic function are functions that receive unknown number of values
func getSumAll(nums ...int) int {
	sum := 0
	for _, num := range nums {
		sum += num
	}
	return sum
}

func getArraySum(arr []int, flag bool) int {
	sum := 0
	if flag == true {
		arr[0] = 5
	}
	for _, val := range arr {
		sum += val
	}
	return sum
}

// Pass by value
func changeValue(val1 int) int {
	val1 = 4
	return val1
}

// Pass by reference
func changeReferenceValue(val1 *int) {
	*val1 = 6
}

func multiplyByTwo(arr *[4]int) {
	for i, val := range arr {
		arr[i] = val * 2
	}
}

func getAverage(nums ...float64) float64 {
	var sum float64 = 0.0
	var numSize float64 = float64(len(nums))
	for _, val := range nums {
		sum += val
	}
	return (sum / numSize)
}

func main() {
	// Syntax : func funcName(parameters) returnType { body }
	// Title case functions - exported out of packages
	// Camel case functions - not exported out of packages
	sayHello()
	println(getSum(2, 4))
	println(getTwoReturnValues(2))
	println(getQuotient(5, 0))
	println(getQuotient(5, 4))
	println(getSumAll(1, 2, 3, 4, 5, 6))

	arr1 := []int{1, 2, 3, 4, 5}
	println(getArraySum(arr1, true))
	println(getArraySum(arr1, false))

	val1 := 5
	println("Before call :", val1)
	changeValue(val1)
	println("After call :", val1)

	// Pointers
	println("Before call :", val1)
	changeReferenceValue(&val1)
	println("After call :", val1)

	var val1Ptr *int = &val1
	println("Address of val1 :", val1Ptr)
	println("Value of val1 :", *val1Ptr)
	*val1Ptr = 11
	println("Value of val1 :", *val1Ptr)

	// Pass array by pointers
	arr2 := [4]int{1, 2, 3, 4}
	multiplyByTwo(&arr2)
	println(arr2)

	// Pass slice to function
	arrSlice := []float64{11, 13, 17}
	fmt.Printf("Average : %.3f\n", getAverage(arrSlice...))
}
