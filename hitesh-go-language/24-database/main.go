package main

import (
	"database/router"
	"fmt"
	"log"
	"net/http"
)

func main() {
	fmt.Println("mongodb api")
	fmt.Println("server is getting started ...")
	r := router.Router()
	log.Fatal(http.ListenAndServe(":4000", r))
	fmt.Println("listening at port 4000 ...")
}
