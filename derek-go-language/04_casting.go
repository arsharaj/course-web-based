package main

import (
	"fmt"
	"reflect"
	"strconv"
)

var println = fmt.Println

func main() {
	first := 1.5
	second := int(first)
	println(second)

	third := "5000000"
	fourth, err := strconv.Atoi(third)
	println(fourth, err, reflect.TypeOf(fourth))

	fifth := strconv.Itoa(fourth)
	println(fifth)

	sixth := "3.17"
	if seventh, err := strconv.ParseFloat(sixth, 64); err == nil {
		println(seventh)
	}

	eighth := fmt.Sprintf("%f", 3.14)
	println(eighth)
}
