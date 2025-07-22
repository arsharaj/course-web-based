package main

import (
	"fmt"
)

var println = fmt.Println

func main() {
	// Maps are collection of key value pairs
	// Syntax : var myMap map [keyType]valueType
	var heroes map[string]string
	heroes = make(map[string]string)
	heroes["Batman"] = "Bruce Wayne"
	heroes["Superman"] = "Clark Kent"
	heroes["The Flash"] = "Barry Allen"

	villians := make(map[string]string)
	villians["Lex Luther"] = "Lex Luther"

	superPets := map[int]string{
		1: "Krypto",
		2: "Bat Hound",
	}
	fmt.Printf("Batman is %v\n", heroes["Batman"])
	fmt.Printf("Chip is %v\n", superPets[3])
	_, ok := superPets[3]
	println("Is there a 3rd pet :", ok)
	for key, val := range heroes {
		fmt.Printf("%s is %s\n", key, val)
	}
	delete(heroes, "The Flash")
	for key, val := range heroes {
		fmt.Printf("%s is %s\n", key, val)
	}
}
