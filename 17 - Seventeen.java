/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Gilday
 */

import java.util.*;

//Exercise 17 - Blood Alcohol Calculator. (Program that prompts for your weight, gender, total alcohol consumed (in ounces), and the amount of time since your last drink. It then outputs your blood alcohol content (BAC), and if you are allowed to legally drive with that BAC.)
class Main {
  public static void main(String[] args) {
    Scanner start_scan = new Scanner(System.in);  //Creation of a scanner object to allow for user input.

    System.out.print("Enter a 1 is you are male or a 2 if you are female: ");
    String input_gender = start_scan.next();  //Reads in whether or not the individual is female or male.
    if (!input_gender.matches("[1-2]")) {
      System.out.println("Error: Input 1 or 2.");
      System.exit(0);
    }
    System.out.print("How many ounces of alcohol did you have? ");
    String input_AlAm = start_scan.next();  //Reads in alcohol amount consumed.
    if (!input_AlAm.matches("[0-9]+")) {
      System.out.println("Error: Input only numbers.");
      System.exit(0);
    }
    System.out.print("What is your weight, in pounds? ");
    String input_W = start_scan.next();  //Reads in weight in pounds.
    if (!input_W.matches("[0-9]+")) {
      System.out.println("Error: Input only numbers.");
      System.exit(0);
    }
    System.out.print("How many hours has it been since your last drink? ");
    String input_t = start_scan.next();  //Reads in hours since last drink.
    if (!input_t.matches("[0-9]+")) {
      System.out.println("Error: Input only numbers.");
      System.exit(0);
    }


    //System.out.print( (age >= 16) ? "You are old enough to legally drive." : "You are not old enough to legally drive.");  //Prints out whether you are legally allowed to drive in FL or not based solely on age.

    start_scan.close();
  }
}