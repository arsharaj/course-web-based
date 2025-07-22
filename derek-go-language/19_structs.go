package main

import (
	"fmt"
)

var println = fmt.Println

type customer struct {
	name    string
	address string
	balance float64
}

func getCustomerInfo(c customer) {
	fmt.Printf("%s owes us %.2f\n", c.name, c.balance)
}

func addCustomerAddress(c *customer, address string) {
	c.address = address
}

func main() {
	// Structs store values with many different data types
	var customer1 customer
	customer1.name = "Tom Smith"
	customer1.address = "5 main street"
	customer1.balance = 134.56

	getCustomerInfo(customer1)
	addCustomerAddress(&customer1, "123 south street")
	println("Address :", customer1.address)

	customer2 := customer{"Sally Smith", "123 main", 0.0}
	println("Name :", customer2.name)
}
