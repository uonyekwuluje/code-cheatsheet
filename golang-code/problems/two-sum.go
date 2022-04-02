package main

import (
  "fmt"
)

func twoSum(nums []int, target int) []int {
  var x,y int
  for x=0; x<len(nums); x++ {
    for y=x+1; y<len(nums); y++ {
      //fmt.Println(nums[x],"+",nums[y],"=",(nums[x]+nums[y]),"| Subscripts => [",x,y,"]")
      if (nums[x] + nums[y] == target) {
        return []int{x,y}
      }
    }
  }
  return []int{x,y}
}


func main() {
  nmArray := []int{2,5,5,11}
  nmT := 10
  fmt.Println("The Array =>",nmArray)
  fmt.Println("Index of sum of two =>",twoSum(nmArray,nmT))
}
