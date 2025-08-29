package main

import (
	"fmt"
	"io"
	"net/http"
	"net/url"
	"strings"
)

func main() {
	fmt.Println("welcome to web")
	performGetRequest()
	performPostJsonRequest()
	performPostFormRequest()
}

func performPostJsonRequest() {
	const postUrl = "http://localhost:8000/post"

	// fake json payload
	requestBody := strings.NewReader(`
		{
			"coursename": "go programming language",
			"price": 0
			"platform": "google.com"
		}
	`)

	response, err := http.Post(postUrl, "application/json", requestBody)
	if err != nil {
		panic(err)
	}
	defer response.Body.Close()

	content, _ := io.ReadAll(response.Body)
	fmt.Println(string(content))
}

func performPostFormRequest() {
	const postUrl = "http://localhost:8000/postform"

	// fake formdata
	data := url.Values{}
	data.Add("firstname", "arsharaj")
	data.Add("lastname", "chauhan")
	data.Add("email", "arsh@go.dev")

	response, err := http.PostForm(postUrl, data)
	if err != nil {
		panic(err)
	}
	defer response.Body.Close()

	content, _ := io.ReadAll(response.Body)
	fmt.Println(content)
}

func performGetRequest() {
	const getUrl = "http://localhost:8000/get"

	response, err := http.Get(getUrl)
	if err != nil {
		panic(err)
	}
	defer response.Body.Close()

	fmt.Println("status code:", response.StatusCode)
	fmt.Println("content length:", response.ContentLength)

	var responseString strings.Builder
	content, _ := io.ReadAll(response.Body)
	byteCount, _ := responseString.Write(content)
	fmt.Println("byte count is:", byteCount)
	fmt.Println(responseString.String())

	// fmt.Println(string(content))
}
