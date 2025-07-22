package main

import (
	"fmt"
)

var println = fmt.Println

func main() {
	str1 := "abcde"
	rArr := []rune(str1)
	for _, v := range rArr {
		fmt.Printf("Rune array : %d\n", v)
	}

	byteArr := []byte{'a', 'b', 'c'}
	byteStr := string(byteArr[:])
	println(byteStr)

	// Syntax : var name []datatype
	slice1 := make([]string, 6)
	slice1[0] = "Go"
	slice1[1] = "Programming"
	slice1[2] = "Language"
	println("Slice size : ", len(slice1))

	for i := 0; i < len(slice1); i++ {
		println(slice1[i])
	}
	for _, v := range slice1 {
		println(v)
	}

	// Changing slice will update array and vice verse
	sampleArr := [5]int{1, 2, 3, 4, 5}
	sliceArr := sampleArr[0:2]
	println("1st 2 :", sliceArr)
	println("1st 3 :", sampleArr[:3])
	println("Last 3 :", sampleArr[2:])
	sliceArr[0] = 10
	println(sampleArr, sliceArr)

	sliceArr = append(sliceArr, 12)
	println(sliceArr, sampleArr)

	emptySlice := make([]string, 6)
	println("Empty slice :", emptySlice, emptySlice[0])
}
