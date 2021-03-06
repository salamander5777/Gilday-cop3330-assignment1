/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Gilday
 */

import java.util.*;

//Exercise 5 - Simple Math. (Program that prompts for two numbers. Then prints the sum, difference, product, and quotient of those numbers.)
class Main {
    public static void main(String[] args) {
        Scanner start_scan = new Scanner(System.in); //Creation of a scanner object to allow for user input.

        System.out.print("What is the first number? ");
        String Input1 = start_scan.next(); //Reads in first string number.
        System.out.print("What is the second number? ");
        String Input2 = start_scan.next(); //Reads in the second string number.

        //Below is the block of code used to convert input strings into integers.
        double n1 = Double.parseDouble(Input1);
        double n2 = Double.parseDouble(Input2);

        //Below is the block of code that does the math.
        double a = (n1+n2);
        double s = (n1-n2);
        double m = (n1*n2);
        double d = (n1/n2);

        System.out.print(n1 + " + " + n2 + " = "  + a + "\n" + n1 + " - " + n2 + " = "  + s + "\n" + n1 + " * " + n2 + " = "  + m + "\n" + n1 + " / " + n2 + " = "  + d);  //Prints out the sum, difference, product and quotient of the input numbers.
        start_scan.close();
    }
}