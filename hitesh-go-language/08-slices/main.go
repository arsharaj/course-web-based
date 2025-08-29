package main

import (
	"fmt"
	"sort"
)

func main() {
	fmt.Println("welcome to slices")

	var fruits = []string{"apple", "tomato", "peach"}
	fmt.Printf("type of fruits is %T \n", fruits)

	fruits = append(fruits, "mango", "banana")
	fmt.Println(fruits)

	fruits = append(fruits[:3])
	fmt.Println(fruits)

	highScores := make([]int, 4)
	highScores[0] = 234
	highScores[1] = 945
	highScores[2] = 867
	highScores[3] = 465
	// highScores[4] = 777
	highScores = append(highScores, 555, 666, 321)
	fmt.Println(highScores)

	fmt.Println(sort.IntsAreSorted(highScores))
	sort.Ints(highScores)
	fmt.Println(highScores)
	fmt.Println(sort.IntsAreSorted(highScores))

	// remove a value from slices based on index
	var courses = []string{"reactjs", "javascript", "swift", "python", "ruby"}
	fmt.Println(courses)

	var index int = 2
	courses = append(courses[:index], courses[index+1:]...)
	fmt.Println(courses)
}
