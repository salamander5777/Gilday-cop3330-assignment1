/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Gilday
 */

import java.util.*;
import java.time.*;

//Exercise 6 - Retirement Calculator. (Program that determines how many years you have left until retirement and the year you can retire. Prompts for your current age and the age you want to retire. Then displays)
class Main {
  public static void main(String[] args) {
    Scanner start_scan = new Scanner(System.in); //Creation of a scanner object to allow for user input.

    System.out.print("What is your current age? ");
    String age_input = start_scan.nextLine(); //Reads in age.
    System.out.print("At what age would you like to retire? ");
    String retire_input = start_scan.nextLine(); //Reads in desired age of retirement.

    int A = Integer.parseInt(age_input);
    int R = Integer.parseInt(retire_input);
    int Y = Year.now().getValue(); //Gets current year.

    System.out.print("You have " + (R-A) + " years left until you can retire.\nIt's " + Y + ", so you can retire in " + (R-A+Y) + ".");  //Prints out how many years till you can retire and what year that would be.
    start_scan.close();
  }
}