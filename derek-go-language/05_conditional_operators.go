package main

import (
	"fmt"
)

var println = fmt.Println

func main() {
	// Conditional operators are > < >= <= == !=
	// Logical operators are && || !
	age := 8
	if age >= 1 && age <= 18 {
		println("Important Birthday")
	} else if age == 21 || age == 50 {
		println("Important Birthday")
	} else if age >= 65 {
		println("Important Birthday")
	} else {
		println("Not an Important Birthday")
	}

	println("!true", !true)
}
