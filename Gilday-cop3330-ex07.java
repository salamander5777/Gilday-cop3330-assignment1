/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Gilday
 */

import java.util.*;

//Exercise 7 - Area of a Rectangular Room. (Program that calculates the area of a room. Prompts the user for the length and width of the room in feet. Then displays the area in both square feet and square meters.)
class Main {
    public static void main(String[] args) {
        Scanner start_scan = new Scanner(System.in); //Creation of a scanner object to allow for user input.

        System.out.print("What is the length of the room in feet? ");
        String length = start_scan.nextLine();  //Reads room length in feet.
        System.out.print("What is the width of the room in feet? ");
        String width = start_scan.nextLine(); //Reads room width in feet.

        //Below is the block of code that turns strings into ints and does the math.
        int l = Integer.parseInt(length);
        int w = Integer.parseInt(width);
        int f2 = (l*w);
        double m2 = (f2*0.09290304);

        System.out.print("You entered the dimensions of " + length + " feet by " + width + " feet.\nThe area is \n" + f2 + " square feet\n" + m2 + " square meters");  //Prints out the input dimensions along with the area in square feet and square meters.
        start_scan.close();
    }
}