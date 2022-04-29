package inputs;

import java.util.Scanner;

public class Inputs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Testing Inputs");
		System.out.println("---------------");
		
		System.out.print("Enter Number: ");
		int nm1 = input.nextInt();
		System.out.println("You Just Entered "+nm1);
	}

}
