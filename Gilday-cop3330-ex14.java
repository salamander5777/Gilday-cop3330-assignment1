/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Gilday
 */

import java.util.*;

//Exercise 14 - Tax Calculator. (Program that prompts for the order amount and the state. If the state is “WI,” then the order must be charged 5.5% tax. Then displays the subtotal, tax, and total for Wisconsin residents but display just the total for non-residents.)
class Main {
    public static void main(String[] args) {
        Scanner start_scan = new Scanner(System.in); //Creation of a scanner object to allow for user input.

        System.out.print("What is the order amount? ");
        String input_o = start_scan.next(); //Reads in the order amount.
        System.out.print("What is the state? ");
        String input_s = start_scan.next(); //Reads in the order state.

        double o = Double.parseDouble(input_o);//Converts input string into double.
        double to = o; //New variable carrying order amount data.
        double tax = (o*.055);
        if(input_s.equals("WI")){ //If statement adds tax to total if input was 'WI'.
            to = Math.round((tax+o)*100.00)/100.00;
        }

        System.out.print((input_s.equals("WI")) ? "The subtotal is $" + o + ".\nThe tax is $" + tax + ".\nThe total is $" + to + "." : "The total is $" + to + ".");  //Will print out Subtotal & Taxes along with total if state is "WI"; Will only print total w/out tax if state is not "WI".
        start_scan.close();
    }
}