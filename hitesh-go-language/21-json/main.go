package main

import (
	"encoding/json"
	"fmt"
)

type course struct {
	Name     string   `json:"name"`
	Price    int      `json:"price"`
	Platform string   `json:"website"`
	Password string   `json:"-"`
	Tags     []string `json:"tags,omitempty"`
}

func main() {
	fmt.Println("welcome to json video")
	encodeJson()
	decodeJson()
}

func encodeJson() {
	courses := []course{
		{"angular", 300, "yahoo.com", "ghi789", []string{"google", "dev", "js"}},
		{"react", 100, "google.com", "abc123", []string{"web", "dev", "js"}},
		{"mern", 200, "google.com", "def456", nil},
	}

	// package this data as json data

	finalJson, err := json.MarshalIndent(courses, "", "  ")
	if err != nil {
		panic(err)
	}
	fmt.Printf("%s\n", finalJson)
}

func decodeJson() {
	jsonData := []byte(`
	{
		"name": "angular",
		"price": 300,
		"website": "yahoo.com",
		"tags": ["google","dev","js"]
	}
	`)

	var courses course

	isValidJson := json.Valid(jsonData)

	if isValidJson {
		fmt.Println("json was valid")
		json.Unmarshal(jsonData, &courses)
		fmt.Printf("%#v\n", courses)
	} else {
		fmt.Println("json was not valid")
	}

	// add data to key value pair
	var coursesMap map[string]interface{}
	json.Unmarshal(jsonData, &coursesMap)
	fmt.Printf("%#v\n", coursesMap)

	for k, v := range coursesMap {
		fmt.Printf("key is %v and value is %v and type is %T\n", k, v, v)
	}
}
