package main

import "fmt"

type Animal interface {
	AngrySound()
	HappySound()
}

type Cat string

func (c Cat) Attack() {
	fmt.Println("Cat attacks its prey")
}

func (c Cat) Name() string {
	return string(c)
}

func (c Cat) AngrySound() {
	fmt.Println("Cat says Hisss")
}

func (c Cat) HappySound() {
	fmt.Println("Cat says Meow")
}

func main() {
	// Interfaces allow us to define contracts
	var kitty Animal
	kitty = Cat("Kitty")
	kitty.AngrySound()
	var kittu Cat = kitty.(Cat)
	kittu.Attack()
	fmt.Println("Cats Name :", kittu.Name())
}
