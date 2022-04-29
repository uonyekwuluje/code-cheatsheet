public class Removeelement {
    public static void main(String[] args){
        System.out.println("Remove Element Excercise");
        int[] numArray = new int[4];
        numArray[0] = 45;
        numArray[1] = 65;
        numArray[2] = 15;
        numArray[3] = 25;
        Solution newSoln = new Solution();
        newSoln.removeElement(numArray, 2);
    }
}

class Solution {
    public void removeElement(int[] nums, int val) {
       System.out.println(nums[val]);
    }
}