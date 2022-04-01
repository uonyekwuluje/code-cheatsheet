package main

import (
  "fmt"
  "strings"
)

func main() {
  fmt.Println("Hello World")
  name := [5]string{"Tony","Paul","Rosemary","Dupui","Ratsinger"}
  fmt.Println(name)
  fmt.Println(name[2])
  stringToArray()
  dictionary()
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

// Test Dictiionary
func dictionary() {
   house := make(map[string]int)
   house["Doris"] = 1
   fmt.Println(house)
   house["Doris"] = 2
   fmt.Println(house)
}
