/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Gilday
 */

import java.util.*;

//Exercise 8 - Pizza Party. (Program that evenly divides pizzas. Prompt for the number of people, the number of pizzas, and the number of slices per pizza. Ensure that the number of pieces comes out even. Display the number of pieces of pizza each person should get. Any leftovers are shown)
class Main {
  public static void main(String[] args) {
    Scanner start_scan = new Scanner(System.in);  //Creation of a scanner object to allow for user input.

    System.out.println("How many people? ");
    String i_people = start_scan.nextLine();  //Reads in the amount of party people.
    System.out.println("How many pizzas do you have? ");
    String i_pizza_a = start_scan.nextLine(); //Reads in the amount of pizzas.
    System.out.println("How many slices per pizza? ");
    String i_slice_a = start_scan.nextLine(); //Reads in the amount of slices per pizza.

    //Below is the block of code that turns strings to ints and does the math.
    int pe = Integer.parseInt(i_people);
    int pi = Integer.parseInt(i_pizza_a);
    int sl = Integer.parseInt(i_slice_a);
    int sl_a = (pi*sl);
    int sl_p_pe = (sl_a/pe); //Calculates slices per person.
    int calc = (sl_p_pe*pe); //Calculates slices given out.
    int lf = (sl_a-calc); //Calculates slices left.

    System.out.println(pe + " people with " + pi + " pizzas (" + sl_a + " slices)\nEach person gets " + sl_p_pe + " pieces of pizza.\nThere are " + lf + " leftover pieces.");  //Prints put who said the quote along with the quote itself.
    start_scan.close();
  }
}