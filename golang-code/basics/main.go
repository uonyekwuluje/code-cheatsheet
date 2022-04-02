package main

import (
  "fmt"
  "math"
  "strings"
  "basics/intro/loops"
  "basics/intro/dictionary"
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
  stringToArray()

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



// Change Strings to Array
func stringToArray() {
   states := [3]string{"Montanna","Massachusetts","Idaho"}
   fmt.Println(states)

   str_char := states[2]
   chars := []rune(str_char)
   fmt.Println(chars)
   for i:=0; i<len(chars); i++ {
     fmt.Print(string(chars[i]))
   }
   fmt.Println("")

   fmt.Println(strings.Fields(states[1]))
   fmt.Println(strings.Fields(states[1][1:3]))
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
