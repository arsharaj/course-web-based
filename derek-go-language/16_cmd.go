package main

import (
	"fmt"
	"os"
	"strconv"
)

func main() {
	fmt.Println(os.Args)
	args := os.Args[1:]
	var intArgs = []int{}
	for _, i := range args {
		val, err := strconv.Atoi(i)
		if err != nil {
			panic(err)
		}
		intArgs = append(intArgs, val)
	}

	max := 0
	for _, val := range intArgs {
		if val > max {
			max = val
		}
	}
	fmt.Println("Max value :", max)
}
