package main

import "fmt"

func main() {
	fmt.Println("welcome to array in golang")

	var fruits [4]string

	fruits[0] = "apple"
	fruits[1] = "tomato"
	fruits[3] = "peach"

	fmt.Println("fruits :", fruits)
	fmt.Println("length of fruits :", len(fruits))

	var vegetables = [3]string{"potato", "beans", "mushroom"}
	fmt.Println("vegetable list is :", vegetables)
	fmt.Println("length of vegetable list is :", len(vegetables))
}
