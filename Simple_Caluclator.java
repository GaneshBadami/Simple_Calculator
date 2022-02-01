package com.example.java;
import java.util.Scanner;

public class Simple_Calculator{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first Number: ");
        String input1 = sc.nextLine();
        double d1 = Double.parseDouble(input1);

        System.out.println("Enter the Second Number: ");
        String input2 = sc.nextLine();
        double d2 = Double.parseDouble(input2);
        double d3 = d1 + d2;
        System.out.println("Addition of two numbers is: "+ d3);
        double d4 = d1 - d2;
        System.out.println("Subtraction of two numbers is: "+ d4);
        double d5 = d1 * d2;
        System.out.println("Multiplication of two numbers is: "+ d5);
        double d6 = d1 / d2;
        System.out.println("Division of two numbers is: "+ d6);
    }
}
