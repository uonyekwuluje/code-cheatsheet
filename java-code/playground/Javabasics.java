package com.tutorial;

import java.util.Scanner;
import java.util.Date;

public class Javabasics {
    public static void main(String[] args) {
        System.out.println("Welcome People");
        Date date = new Date();
        System.out.println("Todays Date => "+date);
        inputs();   
    }

    private static void inputs() {
        Scanner inputs = new Scanner(System.in);
        System.out.println("Testing Inputs");
        System.out.println("-----------------");
        int num1,num2;
        System.out.print("Enter First Number > ");
        num1 = inputs.nextInt();
        System.out.print("Enter Second Number > ");
        num2 = inputs.nextInt();
        System.out.println("The Sum = "+(num1 + num2));
    }
}
