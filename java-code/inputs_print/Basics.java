package BasicsClass;

import java.util.Scanner;

public class Basics {
  public static void main(String[] args){
    System.out.println("Inputs & Print Tutorial");
    System.out.println("-----------------------");
    //testInput();
    //testLoops();
    //parlTest();
    partDisplay();
  }

  // Basic Inputs
  private static void testInput(){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Number: ");
    int num1 = input.nextInt();
    System.out.print("Enter Another Number: ");
    int num2 = input.nextInt();
    System.out.println("The Sum of "+num1+" + "+num2+" = "+(num1 + num2));
  }

  // Basic Loops
  private static void testLoops(){
    int l1 = 0;
    while (l1 <=8) {
      System.out.println(l1);
      l1++; 
    }
  }

  // Parlindrome
  private static void parlTest(){
     Scanner input = new Scanner(System.in);
     System.out.print("Enter String > ");
     String str1 = input.nextLine();
     System.out.println("You Entered String => "+str1);
     int position = 3;
     System.out.println("String in Position "+position+" => ["+str1.charAt(position)+"]");
  }

  // Partern Display
  private static void partDisplay() {
    for(int x = 10; x>=1; x--) {
      for(int y = 0; y<=x; y++) {
         System.out.print("*");
      }
      System.out.println("");
    }
  }

}
