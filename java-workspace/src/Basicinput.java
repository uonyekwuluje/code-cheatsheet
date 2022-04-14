import java.util.Scanner;

public class Basicinput {

	public static void heading() {
	    System.out.println("Testing Java Inputs");
        System.out.println("=====================");
        
        Scanner cinput = new Scanner(System.in);
        System.out.print("Enter Number ");
        int num1 = cinput.nextInt();
        System.out.print("Enter Anote Number ");
        int num2 = cinput.nextInt();
        System.out.println(num1+" + "+num2+" = "+(num1+num2));
	}

}
