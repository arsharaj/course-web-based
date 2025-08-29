package main

import "fmt"

func main() {
	fmt.Println("welcome to loops in go lang")

	days := []string{"sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"}
	fmt.Println(days)

	for i := 0; i < len(days); i++ {
		fmt.Println(days[i])
	}

	for i := range days {
		fmt.Println(days[i])
	}

	for i, day := range days {
		fmt.Printf("index is %v and value is %v\n", i, day)
	}

	oddValue := 1
	for oddValue < 10 {
		if oddValue == 5 {
			oddValue++
			continue
		}
		fmt.Println("value is :", oddValue)
		oddValue++
		if oddValue == 2 {
			goto label
		}
	}

label:
	fmt.Println("jumping to label")
}
