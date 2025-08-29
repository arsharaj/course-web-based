package main

import (
	"fmt"
	"net/http"
	"sync"
	"time"
)

var signals = []string{}
var wg sync.WaitGroup // usually pointer
var mut sync.Mutex    // usually pointer

func main() {
	// go greeter("hello")
	// greeter("world")
	websiteList := []string{
		"https://google.com",
		"https://go.dev",
		"https://fb.com",
		"https://github.com",
	}

	for _, web := range websiteList {
		go getStatusCode(web)
		wg.Add(1)
	}

	wg.Wait()
	fmt.Println(signals)
}

func greeter(s string) {
	for i := 0; i < 5; i++ {
		time.Sleep(3 * time.Millisecond)
		fmt.Println(s)
	}
}

func getStatusCode(endpoint string) {
	defer wg.Done()

	res, err := http.Get(endpoint)
	if err != nil {
		fmt.Println("oops in endpoint")
	}
	mut.Lock()
	signals = append(signals, endpoint)
	mut.Unlock()
	fmt.Printf("%d status code for %s\n", res.StatusCode, endpoint)
}
