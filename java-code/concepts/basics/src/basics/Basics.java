package basics;

import java.util.Scanner;

public class Basics {

	public static void main(String[] args) {
		System.out.println("Testing Printing");
		final int CTO = 45;
		System.out.println(CTO);
		System.out.println(5%2);
		//printFormat();
		//consoleTest();
	}

	private static void printFormat() {
		System.out.printf("a\ta^2\ta^3\ta^4\n");
		for(int x=1; x<=5; x++) {
			System.out.printf("%d\t%d\t%d\t%d\n",x,(int)Math.pow(x, 2),(int)Math.pow(x, 3),(int)Math.pow(x, 4));
		}
	}
	
	private static void consoleTest() {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int x = input.nextInt();
        System.out.println("You Just Entered => "+x);
	}
	
}
