package main

import "fmt"

func main() {
	fmt.Println("maps in golang")

	languages := make(map[string]string)
	languages["js"] = "javascript"
	languages["rb"] = "ruby"
	languages["py"] = "python"

	fmt.Println("list of all languages :", languages)
	fmt.Println("js stands for", languages["js"])

	delete(languages, "rb")
	fmt.Println("list of all languages :", languages)

	for key, value := range languages {
		fmt.Printf("for key %v, value is %v \n", key, value)
	}
}
