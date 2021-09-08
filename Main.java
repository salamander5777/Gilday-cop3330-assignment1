/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Gilday
 */

import java.util.*;

//Exercise 1 - Saying Hello. (Prompts for your name and prints a greeting using your name.)
class Main {
  public static void main(String[] args) {
    Scanner start_scan = new Scanner(System.in);  //Creation of a scanner object to allow for user input.

    System.out.println("What is your name? ");
    String Name = start_scan.next();  //Used to read in the name.
    System.out.println("Hello, " + Name +", nice to meet you!");  //Prints out statement and the input name.
    start_scan.close();
  }
}