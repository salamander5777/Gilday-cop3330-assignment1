/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Gilday
 */

import java.util.*;

//Exercise 4 - Mad Lib. (Mad-lib program that prompts for a noun, a verb, an adverb, and an adjective and injects those into a story that you create.)
class Main {
    public static void main(String[] args) {
        Scanner start_scan = new Scanner(System.in); //Creation of a scanner object to allow for user input.

        System.out.print("Enter a noun: ");
        String Noun = start_scan.next(); //Reads in a noun.
        System.out.print("Enter a verb: ");
        String Verb = start_scan.next(); //Reads in a verb.
        System.out.print("Enter an adjective: ");
        String Adjective = start_scan.next(); //Reads in an adjective.
        System.out.print("Enter an adverb: ");
        String Adverb = start_scan.next(); //Reads in an adverb.

        System.out.print("Do you " + Verb + " your " + Adjective + " " + Noun + " " + Adverb + "? That's Hilarious!");  //Prints out a statement using the provided noun, verb, adjective and adverb.
        start_scan.close();
    }
}