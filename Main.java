/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Gilday
 */

import java.util.*;

//Exercise 21 - Printing Quotes. (Program that converts a number from 1 to 12 to the corresponding month. Prompts for a number and displays the corresponding calendar month. Will display an error if outside the range of 1-12)
class Main {
  public static void main(String[] args) {
    Scanner start_scan = new Scanner(System.in);  //Creation of a scanner object to allow for user input.

    System.out.print("Please enter the number of the month: ");
    int input_month = start_scan.nextInt();  //Reads in the month number.
    String Month;

    switch (input_month){
      case 1:  Month = "January.";
               break;
      case 2:  Month = "February.";
               break;
      case 3:  Month = "March.";
               break;
      case 4:  Month = "April.";
               break;
      case 5:  Month = "May.";
               break;
      case 6:  Month = "June.";
               break;
      case 7:  Month = "July.";
               break;
      case 8:  Month = "August.";
               break;
      case 9:  Month = "September.";
               break;
      case 10: Month = "October.";
               break;
      case 11: Month = "November.";
               break;
      case 12: Month = "December.";
               break;
      default: Month = "Error: Invalid month (Valid months are: 1<=x<=12.";
               break;
    }
    
    System.out.print("The name of the month is " + Month);  //Prints out who said the quote along with the quote itself.
    start_scan.close();
  }
}