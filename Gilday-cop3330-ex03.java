/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Gilday
 */

import java.util.*;

//Exercise 3 - Printing Quotes. (Program that prompts for a quote and an author. Then displays the quotation and author as shown in the example output.)
class Main {
  public static void main(String[] args) {
    Scanner start_scan = new Scanner(System.in); //Creation of a scanner object to allow for user input.

    System.out.print("What is the quote? ");
    String Quote = start_scan.nextLine(); //Reads in the quote.
    System.out.print("Who said it? ");
    String Author = start_scan.nextLine(); //Reads in 'who said the quote'.
    
    System.out.print(Author + " says, " + "\"" + Quote + "\"");  //Prints out who said the quote along with the quote itself.
    start_scan.close();
  }
}