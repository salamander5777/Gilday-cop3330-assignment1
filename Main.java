/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Gilday
 */

import java.util.*;

//Exercise 19 - BMI Calculator. (Program that calculates the body mass index (BMI) for a person using the person’s height in inches and weight in pounds, which is prompted by the program.)
class Main {
  public static void main(String[] args) {
    Scanner start_scan = new Scanner(System.in);  //Creation of a scanner object to allow for user input.

    System.out.print("What is your height in inches? ");
    String input_H = start_scan.next();  //Reads in height.
    if (!input_H.matches("[0.0-9.0]+")) {
      System.out.println("Error: Input a valid positive number.");
      System.exit(0);
    }

    System.out.print("What is your weight in pounds? ");
    String input_W = start_scan.next();  //Reads in pounds.
    if (!input_W.matches("[0.0-9.0]+")) {
      System.out.println("Error: Input a valid positive number.");
      System.exit(0);
    }

    //Below is the block of code used to convert input strings into doubles and do the math. BMI is calculated as: (Weight/(Height*Height))*703.
    double H = Double.parseDouble(input_H);
    double W = Double.parseDouble(input_W);
    double BMI = (W/(H*H))*703.0;
    BMI = Math.round(BMI*10.00)/10.00;

    System.out.print( (BMI >= 18.5 && BMI < 25.0) ? "Your BMI is " + BMI + ".\n" + "You are within the ideal weight range." : (BMI > 25.0) ? "Your BMI is " + BMI + ".\n" + "You are overweight. You should see your doctor." : "Your BMI is " + BMI + ".\n" + "You are underweight. You should see your doctor.");  //Prints out your current BMI and whether or not you are within ideal weight range.

    start_scan.close();
  }
}