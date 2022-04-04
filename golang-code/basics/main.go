package main

import (
  "fmt"
  "math"
  "basics/intro/loops"
  "basics/intro/dictionary"
  "basics/intro/slices"
)


type Circle struct {
  x float64
  y float64
  r float64
}


func main() {
  fmt.Println("Hello World")
  name := [5]string{"Tony","Paul","Rosemary","Dupui","Ratsinger"}
  fmt.Println(name)
  fmt.Println(name[2])
  // Slices and Arrays
  slices.StringToArray()
  slices.SliceOps()

  // Testing Package
  loops.ForLoops()
  dictionary.MapOps()

  // Test Mixed Ops
  fmt.Println(mixedOps("Peter",40))

  // Test Struct
  c := Circle{4,5,6}
  fmt.Println(circleArea(&c))
}


func circleArea(t *Circle) float64 {
  return math.Pi * t.r*t.r
}




// Take mixed arguments return string
func mixedOps(nm string, age int) string {
  if age > 20 {
    val := nm+" Over Qualified"
    return val
  } else {
     return nm+" Under Qualified"
  }
}
