/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Gilday
 */

import java.util.*;

//Exercise 10 - Self-Checkout. (Program that prompts for the prices and quantities of three items. The program then calculates the subtotal along with the sales tax of 5.5%. Then it prints out the line items with the quantity and total, along with the subtotal, tax amount, and total.)
class Main {
  public static void main(String[] args) {
    Scanner start_scan = new Scanner(System.in); //Creation of a scanner object to allow for user input.

    System.out.print("Enter the price of item 1: ");
    String input_i1 = start_scan.nextLine(); //Reads in the first item.
    System.out.print("Enter the quantity of item 1: ");
    String input_i1q = start_scan.nextLine(); //Reads in the quantity of item 1.
    System.out.print("Enter the price of item 2: ");
    String input_i2 = start_scan.nextLine(); //Reads in the second item.
    System.out.print("Enter the quantity of item 2: ");
    String input_i2q = start_scan.nextLine(); //Reads in the quantity of item 2.
    System.out.print("Enter the price of item 3: ");
    String input_i3 = start_scan.nextLine(); //Reads in the third item.
    System.out.print("Enter the quantity of item 3: ");
    String input_i3q = start_scan.nextLine(); //Reads in the quantity of item 3.

    //Below is the block of code that turns strings into doubles and does the math.
    double i1 = Double.parseDouble(input_i1);
    double i1q = Integer.parseInt(input_i1q);
    double i2 = Double.parseDouble(input_i2);
    double i2q = Integer.parseInt(input_i2q);
    double i3 = Double.parseDouble(input_i3);
    double i3q = Integer.parseInt(input_i3q);
    double i1m = (i1*i1q);
    double i2m = (i2*i2q);
    double i3m = (i3*i3q);
    double st = (i1m+i2m+i3m); //Subtotal.
    double tax = Math.ceil(((st/100.00)*5.5)*100.00)/100.00; //Calculates tax amount.
    double to = (st+tax); //Total.
    
    System.out.print("Subtotal: $" + st + "\nTax: $" + tax +"\nTotal: $" + to);  //Prints out the Subtotal, Tax value, and Total.
    start_scan.close();
  }
}