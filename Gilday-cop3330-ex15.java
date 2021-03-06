/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Gilday
 */

import java.util.*;

//Exercise 15 - Password Validation. (Program that prompts for a username and password. Then will output 'Welcome!' if you input the correct pass, which is currently abc$123.)
class Main {
    public static void main(String[] args) {
        Scanner start_scan = new Scanner(System.in); //Creation of a scanner object to allow for user input.

        System.out.print("What is your username? ");
        String user = start_scan.next();  //Reads in username.
        System.out.print("What is the password? ");
        String input_pass = start_scan.next(); //Reads in password attempt.

        if(input_pass.equals("abc$123")){ //This will welcome you when you input the right password.
            System.out.print("Welcome! " + user);
        }
        else{
            System.out.print("I don't know you."); //Wrong password, we only have one password.
        }

        start_scan.close();
    }
}