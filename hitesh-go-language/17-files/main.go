package main

import (
	"fmt"
	"io"
	"os"
)

func main() {
	fmt.Println("welcome to files in go language")
	content := "this needs to go in a file - google.com"

	file, err := os.Create("./sample.txt")
	checkNilErr(err)
	defer file.Close()

	length, err := io.WriteString(file, content)
	checkNilErr(err)
	fmt.Println("length is:", length)
	readFile("./sample.txt")
}

func readFile(filename string) {
	data, err := os.ReadFile(filename)
	checkNilErr(err)

	fmt.Println("text data inside the file is :\n", string(data))
}

func checkNilErr(err error) {
	if err != nil {
		panic(err)
	}
}
