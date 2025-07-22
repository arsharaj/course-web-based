package main

import (
	"bufio"
	"errors"
	"fmt"
	"log"
	"os"
	"strconv"
)

var println = fmt.Println

func main() {
	newFile, err := os.Create("sample.txt")
	if err != nil {
		log.Fatal(err)
	}
	// Calls at the end of the function
	defer newFile.Close()
	arrPrime := []int{2, 3, 5, 7, 11}
	var strPrime []string
	for _, val := range arrPrime {
		strPrime = append(strPrime, strconv.Itoa(val))
	}
	for _, num := range strPrime {
		_, err := newFile.WriteString(num + "\n")
		if err != nil {
			log.Fatal(err)
		}
	}
	newFile, err = os.Open("sample.txt")
	if err != nil {
		log.Fatal(err)
	}
	defer newFile.Close()

	scanner := bufio.NewScanner(newFile)
	for scanner.Scan() {
		println("Prime :", scanner.Text())
	}
	if err := scanner.Err(); err != nil {
		log.Fatal(err)
	}

	/*
		- Exactly one of O_RDONLY, OWRONLY or ORDWR must be specified :
		O_RDONLY : open the file read only
		O_WRONLY : open the file write only
		O_RDWR   : open the file read write

		- These can be used with or :
		O_APPEND : append data to the file when writing
		O_CREATE : create a new file if none exists
		O_EXCL   : used with O_CREATE, file must not exist
		O_SYNC   : open for synchronous I/O
		O_TRUNC  : truncate regular writeable file when opened
	*/
	_, err = os.Stat("sample.txt")
	if errors.Is(err, os.ErrNotExist) {
		println("File doesn't exist")
	} else {
		sampleFile, err := os.OpenFile("sample.txt", os.O_APPEND|os.O_CREATE|os.O_WRONLY, 644)
		if err != nil {
			log.Fatal(err)
		}
		defer sampleFile.Close()

		if _, err := sampleFile.WriteString("13\n"); err != nil {
			log.Fatal(err)
		}
	}
}
