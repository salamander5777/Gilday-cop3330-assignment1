/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Gilday
 */

import java.util.*;

//Exercise 22 - Comparing Numbers. (Program that asks for three numbers. It will check first to see that all numbers are different. If they’re not different, then the program will exit. If they are then the largest number will be displayed.)
class Main {
    public static void main(String[] args) {
        Scanner start_scan = new Scanner(System.in); //Creation of a scanner object to allow for user input.

        System.out.print("You will be asked to input 3 different numbers, please do so.\n");
        System.out.print("Enter the first number: ");
        int n1 = start_scan.nextInt(); //Reads in the first number.
        int Ln = n1;
        System.out.print("Enter the second number: ");
        int n2 = start_scan.nextInt(); //Reads in the first number.
        if(n2 > n1){
            Ln = n2;
        }

        System.out.print("Enter the third number: ");
        int n3 = start_scan.nextInt(); //Reads in the first number.
        if(n3 > Ln){
            Ln = n3;
        }

        System.out.print((n1 == n2) || (n1 == n3) || (n2 == n3)? "Error: Input must involve three different numbers, current two or more are the same." : "The largest number is " + Ln + ".");  //Prints out the largest number.
        start_scan.close();
    }
}