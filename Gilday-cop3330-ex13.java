/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Gilday
 */

import java.util.*;

//Exercise 13 - Determining Compound Interest. (Program that computes the value of an investment compounded over time. Then asks for starting amount, the number of years to invest, the interest rate, and the number of periods per year to compound.)
class Main {
    public static void main(String[] args) {
        Scanner start_scan = new Scanner(System.in); //Creation of a scanner object to allow for user input.

        System.out.print("What is the principal amount: ");
        String input_p = start_scan.next(); //Reads in the principal amount.
        System.out.print("What is the rate of interest: ");
        String input_roi = start_scan.next(); //Reads in the rate of interest.
        System.out.print("What is the number of years: ");
        String input_noy = start_scan.next(); //Reads in the number of years that the principal amount accrues.
        System.out.print("What is the number of times the interest is compounded per year? ");
        String input_cpy = start_scan.next(); //Reads in the amount of times the interest is compounded each year.

        //Below is the block of code used to convert input strings into doubles and does the math.
        double p = Double.parseDouble(input_p);
        double ir = Double.parseDouble(input_roi);
        double cpy = Double.parseDouble(input_cpy);
        double r = Double.parseDouble(input_roi)/100.00;
        double y = Double.parseDouble(input_noy);
        double accrued_trailing = p*Math.pow(((1.00+(r/cpy))), (cpy*y)); //Accrued amount = Principle*(1+rate/compound)^(rate*years).
        double a = Math.round(accrued_trailing*100.00)/100.00; //Basic math to get 2 decimal places.

        System.out.print("$" + p + " invested at " + ir + "% for " + cpy + " times per year is $" + a + ".");  //Prints out the principle investment, rate of interest, compounds per year, and the accrued amount.
        start_scan.close();
    }
}