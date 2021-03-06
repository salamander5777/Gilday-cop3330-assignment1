/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Gilday
 */

import java.util.*;

//Exercise 2 - Counting the Number of Characters. (Prompts for an input string and displays output that shows the input string and the number of characters the string contains.)
class Main {
    public static void main(String[] args) {
        Scanner start_scan = new Scanner(System.in); //Creation of a scanner object to allow for user input.

        System.out.print("What is the input string? ");
        String input_string = start_scan.nextLine(); //Reads in an input string.

        System.out.print(input_string + " has " + input_string.length() + " characters in it.");  //Prints out the string and it's length.
        start_scan.close();
    }
}
