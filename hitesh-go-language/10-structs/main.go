package main

import "fmt"

func main() {
	fmt.Println("structs in go lang")
	// no inheritance in go lang or super or parent

	arsh := User{
		"Arsh",
		"arsh@go.dev",
		true,
		16,
	}
	fmt.Println(arsh)
	fmt.Printf("name is %v and email is %v\n", arsh.Name, arsh.Email)
	fmt.Printf("arsh details are: %+v\n", arsh)
}

type User struct {
	Name   string
	Email  string
	Status bool
	Age    int
}
