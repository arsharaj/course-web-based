package main

import (
	"fmt"
)

var println = fmt.Println

type Tsp float64
type Tbs float64
type Ml float64

func tspToML(tsp Tsp) Ml {
	return Ml(tsp * 4.92)
}

func tbsToML(tbs Tbs) Ml {
	return Ml(tbs * 14.79)
}

// Associate method
func (tsp Tsp) ToMls() Ml {
	return Ml(tsp * 4.92)
}

func (tbs Tbs) ToMls() Ml {
	return Ml(tbs * 14.79)
}

func main() {
	ml1 := Ml(Tsp(3) * 4.92)
	fmt.Printf("3 tsps = %.2f ml\n", ml1)

	ml2 := Ml(Tbs(3) * 14.79)
	fmt.Printf("4 tbsl = %.2f ml\n", ml2)

	println("2 tsp + 4 tsp =", Tsp(2)+Tsp(4))
	println("2 tsp > 4 tsp =", Tsp(2) > Tsp(4))
	fmt.Printf("3 tsp = %.2f ml\n", tspToML(3))
	fmt.Printf("3 tbs = %.2f ml\n", tbsToML(3))

	tsp1 := Tsp(3)
	fmt.Printf("%.2f tsp = %.2f ml\n", tsp1, tsp1.ToMls())

}
