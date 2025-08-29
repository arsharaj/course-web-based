package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	welcome := "welcome to user input"
	fmt.Println(welcome)

	reader := bufio.NewReader(os.Stdin)
	fmt.Printf("enter the rating for our pizza: ")

	// comma ok || err ok
	input, err := reader.ReadString('\n')
	fmt.Printf("thanks for rating, %s", input)
	fmt.Printf("type of this rating is %T \n", input)
}
