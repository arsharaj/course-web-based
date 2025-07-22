package main

import (
	"fmt"
)

var pringln = fmt.Println
var printf = fmt.Printf

func main() {
	// %d : Integer
	// %c : Character
	// %f : Float
	// %t : Boolean
	// %s : String
	// %o : Base 8
	// %x : Base 16
	// %v : Guesses based on data type
	// %T : Type of supplied value
	printf("%s, %d, %c, %f, %t, %o, %x\n", "Hi", 1, 'A', 3.14, true, 1, 1)
	printf("%9f\n", 3.14)
	printf("%.2f\n", 3.141592)
	printf("%9.f\n", 3.141592)
	str1 := fmt.Sprintf("%9.f\n", 3.141592)
	println(str1)
}
