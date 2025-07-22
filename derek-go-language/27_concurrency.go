package main

import (
	"fmt"
	"sync"
	"time"
)

type Account struct {
	balance int
	lock    sync.Mutex
}

func (a *Account) GetBalance() int {
	a.lock.Lock()
	defer a.lock.Unlock()
	return a.balance
}

func (a *Account) Withdraw(v int) {
	a.lock.Lock()
	defer a.lock.Unlock()
	if v > a.balance {
		fmt.Println("Not enough money in account")
	} else {
		fmt.Printf("%d withdrawn : balance is %d\n", v, a.balance)
		a.balance -= v
	}
}

func main() {
	var account1 Account
	account1.balance = 100
	fmt.Println("Balance :", account1.GetBalance())
	for i := 0; i < 12; i++ {
		go account1.Withdraw(10)
	}
	time.Sleep(2 * time.Second)
}
