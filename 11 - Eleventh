/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Gilday
 */

import java.util.*;

//Exercise 11 - Currency Conversion. (Program that converts euros to U.S. dollars. Prompts for the amount of money in euros you have, and prompts for the current exchange rate of the euro. Then prints out the new amount in U.S. dollars.)
class Main {
  public static void main(String[] args) {
    Scanner start_scan = new Scanner(System.in); //Creation of a scanner object to allow for user input.

    System.out.print("How many euros are you exchanging? ");
    String input_e = start_scan.next(); //Reads in the amount of euros.
    System.out.print("What is the exchange rate? ");
    String input_r = start_scan.next(); //Reads in the expected exchange rate.

    //Below is the block of code used to convert input strings into doubles and does the math.
    double e = Double.parseDouble(input_e);
    double r = Double.parseDouble(input_r);
    double us = Math.round((e*r)*100.00)/100.00; //Converts from euro to U.S. $.

    System.out.print(e + " euros at an exchange rate of " + r + " is\n" + us + " U.S. dollars.");  //Prints out the amount of euros put in, the exchange rate of said euros, and the amount of U.S. dollars gotten back.
    start_scan.close();
  }
}