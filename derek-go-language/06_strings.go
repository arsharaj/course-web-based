package main

import (
	"fmt"
	"strings"
)

var println = fmt.Println

func main() {
	// Strings are basically array bytes
	str1 := "this is a simple sentence"
	replacer := strings.NewReplacer("a", "another")
	str2 := replacer.Replace(str1)
	println(str2)
	println("Length :", len(str2))
	println("Contains another :", strings.Contains(str2, "another"))
	println("s index :", strings.Index(str2, "s"))
	println("Replace :", strings.Replace(str2, "l", "1", -1))
	str3 := "\nSome words\n\t"
	str3 = strings.TrimSpace(str3)
	println("Split :", strings.Split(str1, " "))
	println("Lower :", strings.ToLower(str3))
	println("Upper :", strings.ToUpper(str3))
	println("Prefix :", strings.HasPrefix(str1, "this"))
	println("Suffix :", strings.HasSuffix(str1, "sentence"))
}
