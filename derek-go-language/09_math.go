package main

import (
	"fmt"
	"math"
	"math/rand"
	"time"
)

var println = fmt.Println

func main() {
	println("5 + 4 =", 5+4)
	println("5 - 4 =", 5-4)
	println("5 * 4 =", 5*4)
	println("5 / 4 =", 5/4)
	println("5 % 4 =", 5%4)
	var1 := 1
	var1 += 1
	var1++
	println(var1)
	// Holds the precision
	println("Float precision =", 0.1111111111111111+0.11111111111111)
	seedSec := time.Now().Unix()
	rand.NewSource(seedSec)
	randNum := rand.Intn(50) + 1
	println("Random :", randNum)
	// Common math functions
	println("Abs(-10) =", math.Abs(-10))
	println("Pow(4, 2) =", math.Pow(4, 2))
	println("Sqrt(16) =", math.Sqrt(16))
	println("Cbrt(8) =", math.Cbrt(8))
	println("Ceil(4.4) =", math.Ceil(4.4))
	println("Floor(4.4) =", math.Floor(4.4))
	println("Round(4.4) =", math.Round(4.4))
	println("Log2(8) =", math.Log2(8))
	println("Log10(100) =", math.Log10(100))
	println("Log(7.389) =", math.Log(math.Exp(2)))
	println("Max(5, 4) =", math.Max(5, 4))
	println("Min(5, 4) =", math.Min(5, 4))
	radianVal := 90 * math.Pi / 180
	println(radianVal)
	degreeVal := radianVal * (180 / math.Pi)
	println(degreeVal)
	// There are functions for Sin, Cos, Tan, Acos, Asin, Atan
	// Asinh, Acosh, Atanh, Atan2, Cosh, Sinh, Sincos, Htpot
	println("Sin(90) =", math.Sin(radianVal))
}
