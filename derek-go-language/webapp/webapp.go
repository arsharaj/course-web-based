package main

import (
	"bufio"
	"fmt"
	"html/template"
	"log"
	"net/http"
	"os"
)

type ToDoList struct {
	ToDoCount int
	ToDos     []string
}

func errorCheck(err error) {
	if err != nil {
		log.Fatal(err)
	}
}

func write(writer http.ResponseWriter, msg string) {
	_, err := writer.Write([]byte(msg))
	errorCheck(err)
}

func getStrings(fileName string) []string {
	var lines []string
	file, err := os.Open(fileName)
	if os.IsNotExist(err) {
		return nil
	}
	errorCheck(err)
	defer file.Close()

	scanner := bufio.NewScanner(file)
	for scanner.Scan() {
		lines = append(lines, scanner.Text())
	}
	errorCheck(scanner.Err())

	return lines
}

func englishHandler(writer http.ResponseWriter, request *http.Request) {
	write(writer, "Hello Internet")
}

func spanishHandler(writer http.ResponseWriter, request *http.Request) {
	write(writer, "Hola Internet")
}

func interactHandler(writer http.ResponseWriter, request *http.Request) {
	todoItems := getStrings("todo.txt")
	fmt.Printf("%#v\n", todoItems)
	htmlTemplate, err := template.ParseFiles("view.html")
	errorCheck(err)
	toDoList := ToDoList{
		ToDoCount: len(todoItems),
		ToDos:     todoItems,
	}
	err = htmlTemplate.Execute(writer, toDoList)
}

func newHandler(writer http.ResponseWriter, request *http.Request) {
	htmlTemplate, err := template.ParseFiles("new.html")
	errorCheck(err)
	err = htmlTemplate.Execute(writer, nil)
}

func createHandler(writer http.ResponseWriter, request *http.Request) {
	toDo := request.FormValue("todo")
	options := os.O_WRONLY | os.O_APPEND | os.O_CREATE
	file, err := os.OpenFile("todo.txt", options, os.FileMode(0600))
	errorCheck(err)
	_, err = fmt.Fprintln(file, toDo)
	errorCheck(err)
	defer file.Close()
	http.Redirect(writer, request, "/interact", http.StatusFound)
}

func main() {
	http.HandleFunc("/hello", englishHandler)
	http.HandleFunc("/hola", spanishHandler)
	http.HandleFunc("/interact", interactHandler)
	http.HandleFunc("/new", newHandler)
	http.HandleFunc("/create", createHandler)

	err := http.ListenAndServe("localhost:8080", nil)
	log.Fatal(err)
}
