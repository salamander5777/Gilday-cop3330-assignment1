/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Gilday
 */

import java.util.*;

//Exercise 21 - Numbers to Names. (Program that converts a number from 1 to 12 to the corresponding month. Prompts for a number and displays the corresponding calendar month. Will display an error if outside the range of 1-12)
class Main {
  public static void main(String[] args) {
    Scanner start_scan = new Scanner(System.in); //Creation of a scanner object to allow for user input.

    System.out.print("Please enter the number of the month: ");
    int input_month = start_scan.nextInt(); //Reads in the month number.
    String Month;

    if (input_month == 1){
      Month = "January.";
    }
    else if(input_month == 2){
      Month = "February.";
    }
    else if(input_month == 3){
      Month = "March.";
    }
    else if(input_month == 4){
      Month = "April.";
    }
    else if(input_month == 5){
      Month = "May.";
    }
    else if(input_month == 6){
      Month =  "June.";
    }
    else if(input_month == 7){
      Month = "July.";
    }
    else if(input_month == 8){
      Month = "August.";
    }
    else if(input_month == 9){
      Month = "September.";
    }
    else if(input_month == 10){
      Month = "October.";
    }
    else if(input_month == 11){
      Month = "November.";
    }
    else if(input_month == 12){
      Month = "December.";
    }
    else{
      Month = "Error: Invalid month, valid months are: 1<=x<=12.";
    }
    
    System.out.print((input_month > 12) || (input_month < 1) ? Month : "The name of the month is " + Month);  //Prints out the name of the month.
    start_scan.close();
  }
}