package main

import (
	"fmt"
)

var println = fmt.Println

type contact struct {
	fname string
	lname string
	phone string
}

type business struct {
	name    string
	address string
	contact
}

func (b business) info() {
	fmt.Printf("Contact at %s is %s %s", b.name, b.contact.fname, b.contact.lname)
}

func main() {
	contact1 := contact{
		"James",
		"Wang",
		"555-1212",
	}
	business1 := business{
		"ABC Consulting",
		"234 north street",
		contact1,
	}

	business1.info()
}
