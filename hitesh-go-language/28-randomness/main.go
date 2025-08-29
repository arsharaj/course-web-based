package main

import (
	"crypto/rand"
	"fmt"
	"math/big"
)

func main() {
	fmt.Println("welcome to maths in go language")

	var first int = 2
	var second float64 = 4.5

	fmt.Println("the sum is :", first+int(second))

	// random number
	// rand.NewSource(time.Now().UnixNano())
	// fmt.Println(rand.Intn(5) + 1)

	// random from crypto
	num, _ := rand.Int(rand.Reader, big.NewInt(5))
	fmt.Println(num)
}
