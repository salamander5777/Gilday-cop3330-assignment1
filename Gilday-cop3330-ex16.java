/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Gilday
 */

import java.util.*;

//Exercise 16 - Legal Driving Age. (Program that prompts the user for their age and compares it to the legal driving age of 16. Will output whether you are legally allowed to drive according to this.)
class Main {
    public static void main(String[] args) {
        Scanner start_scan = new Scanner(System.in); //Creation of a scanner object to allow for user input.

        System.out.print("What is your age? ");
        String input_age = start_scan.next(); //Reads in the age.
        int age = Integer.parseInt(input_age);

        System.out.print( (age >= 16) ? "You are old enough to legally drive." : "You are not old enough to legally drive."); //Prints out whether you are legally allowed to drive in FL or not based solely on age.

        start_scan.close();
    }
}