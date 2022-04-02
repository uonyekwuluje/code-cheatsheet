public class Playground {
  public static void main(String[] args) {
    System.out.println("This is fine");
    System.out.println(addNum(4,5)); 
    System.out.println(addNum(4.0,5.5)); 
    
  }

  private static int addNum(int a, int b) {
   return (a + b);
  }

  private static double addNum(double a, double b) {
   return (a + b);
  }

}
