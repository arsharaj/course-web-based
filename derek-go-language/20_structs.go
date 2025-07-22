package main

import (
	"fmt"
)

var println = fmt.Println

type rectange struct {
	length, height float64
}

// Function is a part of the struct
func (r rectange) Area() float64 {
	return r.length * r.height
}

func main() {
	rectangle1 := rectange{10.0, 15.0}
	println("Rectange Area :", rectangle1.Area())
}
