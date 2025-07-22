package main

import (
	"fmt"
	"unicode/utf8"
)

var println = fmt.Println
var printf = fmt.Printf

func main() {
	// Runes are unicodes that represent characters
	runeStr1 := "abcdefg"
	println("Rune Count :", utf8.RuneCountInString(runeStr1))
	for i, runeVal := range runeStr1 {
		printf("%d : %#U : %c\n", i, runeVal, runeVal)
	}
}
