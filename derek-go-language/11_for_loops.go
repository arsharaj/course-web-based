package main

import (
	"bufio"
	"fmt"
	"log"
	"math/rand"
	"os"
	"strconv"
	"strings"
	"time"
)

var print = fmt.Print
var println = fmt.Println

func main() {
	// Syntax : for initialization; condition; poststatement { body }
	for x := 1; x <= 5; x++ {
		println(x)
	}
	for x := 5; x >= 1; x-- {
		println(x)
	}

	x := 0
	for x < 5 {
		println(x)
		x++
	}

	seedSecs := time.Now().Unix()
	rand.NewSource(seedSecs)
	randNum := rand.Intn(50) + 1
	for true {
		println("Random number is :", randNum)
		print("Guess a number between 0 and 50 : ")
		reader := bufio.NewReader(os.Stdin)
		guess, err := reader.ReadString('\n')
		if err != nil {
			log.Fatal(err)
		}
		guess = strings.TrimSpace(guess)
		intGuess, err := strconv.Atoi(guess)
		if err != nil {
			log.Fatal(err)
		}
		if intGuess > randNum {
			println("Pick a lower value.")
		} else if intGuess < randNum {
			println("Pick a higher value.")
		} else {
			println("You guessed it.")
			break
		}
	}

	// Array with range
	arrNums := []int{1, 2, 3}
	for _, num := range arrNums {
		println(num)
	}
}
