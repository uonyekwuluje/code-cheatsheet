package slices

import (
  "fmt"
  "strings"
)

func StringToArray() {
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
