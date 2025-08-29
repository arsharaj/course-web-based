package main

import (
	"fmt"
	"io"
	"net/http"
)

const url = "https://example.com"

func main() {
	fmt.Println("web requests")

	res, err := http.Get(url)
	if err != nil {
		panic(err)
	}
	defer res.Body.Close()
	fmt.Printf("response is of type: %T\n", res)

	data, err := io.ReadAll(res.Body)
	if err != nil {
		panic(err)
	}

	content := string(data)
	fmt.Println(content)
}
