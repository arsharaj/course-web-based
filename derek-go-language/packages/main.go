package main

import (
	"fmt"
	firstpackage "learn/packages/firstpackage"
	"log"
	"reflect"
)

func main() {
	fmt.Println("Hello", firstpackage.Name)
	intArr := []int{2, 3, 5, 7, 11}
	strArr := firstpackage.IntArrToStrArr(intArr)
	fmt.Println(strArr)
	fmt.Println(reflect.TypeOf(strArr))
	date := firstpackage.Date{}
	err := date.SetDay(21)
	if err != nil {
		log.Fatal(err)
	}
	err = date.SetMonth(12)
	if err != nil {
		log.Fatal(err)
	}
	err = date.SetYear(1974)
	if err != nil {
		log.Fatal(err)
	}
	fmt.Printf("1st Day : %d/%d/%d\n", date.Day(), date.Month(), date.Year())
}
