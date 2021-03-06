/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Gilday
 */

import java.util.*;

//Exercise 12 - Computing Simple Interest. (Program that computes simple interest. Prompts for the principal amount, the rate as a percentage, and the time, and displays the amount accrued)
class Main {
    public static void main(String[] args) {
        Scanner start_scan = new Scanner(System.in); //Creation of a scanner object to allow for user input.

        System.out.print("Enter the principal: ");
        String input_p = start_scan.next(); //Reads in the principal amount.
        System.out.print("Enter the rate of interest: ");
        String input_roi = start_scan.next(); //Reads in the rate of interest.
        System.out.print("Enter the number of years: ");
        String input_noy = start_scan.next(); //Reads in the number of years that the principal amount accrues.

        //Below is the block of code used to convert input strings into doubles and does the math.
        double p = Double.parseDouble(input_p);
        double r = Double.parseDouble(input_roi);
        double rt = Double.parseDouble(input_roi)/100.00;
        double y = Double.parseDouble(input_noy);
        double a = Math.round(p*(1.00+(rt*y))*100.00)/100.00; //Accrued amount = Principle*(1+rate*years).

        System.out.print("After " + y + " years at " + r + "%, the investment will be worth $" + a + ".");  //Prints out the amount of years, rate of interest, and the accrued amount.
        start_scan.close();
    }
}