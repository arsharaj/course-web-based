package main

import (
	"fmt"
	"net/url"
)

const myurl string = "https://lco.dev:3000/learn?coursename=reactjs&paymentid=qwerty123456"

func main() {
	fmt.Println("welcome to handling urls in go language")
	fmt.Println(myurl)

	// parsing
	result, _ := url.Parse(myurl)
	fmt.Println(result.Scheme)
	fmt.Println(result.Host)
	fmt.Println(result.Path)
	fmt.Println(result.Port())
	fmt.Println(result.RawQuery)

	params := result.Query()
	fmt.Printf("the type of params is : %T\n", params)
	fmt.Println(params)
	fmt.Println(params["coursename"])

	for _, val := range params {
		fmt.Printf("param is %v\n", val)
	}

	partsOfUrl := &url.URL{
		Scheme:  "https",
		Host:    "lco.dev",
		Path:    "/tutcss",
		RawPath: "user=hitesh",
	}

	anotherUrl := partsOfUrl.String()
	fmt.Println(anotherUrl)
}
