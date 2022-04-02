package dictionary

import (
  "fmt"
)

func MapOps() {
  var heading string = "Dictionary Operations"
  fmt.Println(heading)
  for x:=0; x <=len(heading); x++ {
   fmt.Print("-")
  }

  // Add To Maps
  fmt.Println("")
  house := make(map[string]int)
  house["Doris"] = 2
  house["McKinzy"] = 3
  house["Paul"] = 4
  fmt.Println(house)

  // Delete from Maps
  delete(house,"McKinzy")
  fmt.Println(house)

  // Test Map Presence
  if name, ok := house["Doris"]; ok {
    fmt.Println(name,ok)
  } else {
    fmt.Println("Does not Exist")
  }

}
