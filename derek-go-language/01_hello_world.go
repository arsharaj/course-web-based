package main

import (
	"bufio"
	"log"
	"os"
)

// Single line comment

/*
Multiline comment
*/

func main() {
	println("Hello World")
	println("What is your name?")
	scanner := bufio.NewReader(os.Stdin)
	name, err := scanner.ReadString('\n')
	if err == nil {
		println("Hello", name)
	} else {
		log.Fatalln(err)
	}
}
