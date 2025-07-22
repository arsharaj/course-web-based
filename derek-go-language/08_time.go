package main

import (
	"fmt"
	"time"
)

var println = fmt.Println

func main() {
	now := time.Now()
	println(now.Year(), now.Month(), now.Day())
	println(now.Hour(), now.Minute(), now.Second())
}
