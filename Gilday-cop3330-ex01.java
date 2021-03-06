/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Gilday
 */

import java.util.*;

//Exercise 1 - Saying Hello. (Prompts for a name and then prints a greeting using input name.)
class Main {
    public static void main(String[] args) {
        Scanner start_scan = new Scanner(System.in);  //Creation of a scanner object to allow for user input.

        System.out.print("What is your name? ");
        String Name = start_scan.next();  //Reads in the name.

        System.out.print("Hello, " + Name + ", nice to meet you!");  //Prints out statement using the input name.
        start_scan.close();
    }
}