package main

import (
	"fmt"
	"regexp"
)

func main() {
	str1 := "The ape was at the apex"
	match, _ := regexp.MatchString("(ape[^ ]?", str1)
	fmt.Println(match)

	str2 := "Cat rat mat fat pat"
	r, _ := regexp.Compile("([crmfp]at)")
	fmt.Println("Match String :", r.MatchString(str2))
	fmt.Println("Find String :", r.FindString(str2))
	fmt.Println("Index :", r.FindStringIndex(str2))
	fmt.Println("All String :", r.FindAllString(str2, -1))
	fmt.Println("1st 2 Strings :", r.FindAllString(str2, 2))
	fmt.Println("All submatch index :", r.FindAllStringSubmatchIndex(str2, -1))
	fmt.Println(r.ReplaceAllString(str2, "Dog"))
}
