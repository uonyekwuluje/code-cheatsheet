package slices

import (
  "fmt"
)

func SliceOps() {
   fmt.Println("Slice/Array Operations")
   fmt.Println("--------------------------")
   var nm []string

   printSlices(nm)
   nm = append(nm, "Revere")
   printSlices(nm)
   nm = append(nm, "Lynn","Boston","Sommerville")
   printSlices(nm)
   nm = RemoveIndex(nm, 2)
   printSlices(nm)
}

// Print Slices
func printSlices(s []string) {
  fmt.Printf("len=%d cap=%d %v\n", len(s), cap(s), s)
}

// Remove Items from slices
func RemoveIndex(s []string, index int) []string {
  return append(s[:index], s[index+1:]...)
}
