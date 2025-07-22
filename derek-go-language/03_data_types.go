package main

import (
	"fmt"
	"reflect"
)

var println = fmt.Println

func main() {
	// Basic data types - int, float64, bool, string, rune
	// Default values - 0, 0.0, false, ""
	println(reflect.TypeOf(25))
	println(reflect.TypeOf(3.14))
	println(reflect.TypeOf(true))
	println(reflect.TypeOf("Hello"))
	println(reflect.TypeOf('😼'))
}
