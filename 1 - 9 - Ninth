/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Gilday
 */

import java.util.*;

//Exercise 9 - Paint Calculator. (Program that calculates gallons of paint needed to paint the ceiling of a room. Prompts for the length and width. Then displays the number of gallons needed to paint the ceiling.)
class Main {
  public static void main(String[] args) {
    Scanner start_scan = new Scanner(System.in); //Creation of a scanner object to allow for user input.

    System.out.print("What is the length of the room in feet? ");
    String length = start_scan.nextLine(); //Reads room length in feet.
    System.out.print("What is the width of the room in feet? ");
    String width = start_scan.nextLine(); //Reads room width in feet.

    //Below is the block of code that turns strings into ints and does the math.
    int l = Integer.parseInt(length);
    int w = Integer.parseInt(width);
    double conv = 350; //1 gallon is equal to 350ft^2.
    int a = (l*w);
    int g = (int) Math.ceil(a/conv); //Function used to round up potential decimal value of Area/Gallons.
    
    System.out.print("You will need to purchase " + g + " gallons of paint to cover " + a +" square feet.");  //Prints out the # of gallons required for the input area.
    start_scan.close();
  }
}