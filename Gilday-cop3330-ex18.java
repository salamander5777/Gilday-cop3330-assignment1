/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Gilday
 */

import java.util.*;

//Exercise 18 - Temperature Converter. (Program that converts temperatures from Fahrenheit to Celsius or from Celsius to Fahrenheit. Prompts for the starting temperature. Then prompts for what type of conversion you want.)
class Main {
    public static void main(String[] args) {
        Scanner start_scan = new Scanner(System.in); //Creation of a scanner object to allow for user input.

        System.out.print("Input C to convert from Fahrenheit to Celsius.\nInput F to convert from Celsius to Fahrenheit.\nYour choice: ");
        String input_foc = start_scan.next(); //Reads in 'C' or 'F'.
        double input_temp = 0.00;
        double temp = 0.00;

        if (input_foc.matches("C") || input_foc.matches("c")){ //F to C. Formula for which is: Celsius = (Fahrenheit-32)*5/9.
            System.out.print("Please enter the temperature in Fahrenheit: ");
            input_temp = Double.parseDouble(start_scan.next());
            temp = (input_temp-32.0)*5.0/9.0;
            temp = Math.round(temp*100.0)/100.0;
        }
        else if (input_foc.matches("F") || input_foc.matches("f")){ //C to F. Formula for which is: Fahrenheit = (Celsius*9/5)+32.
            System.out.print("Please enter the temperature in Celsius: ");
            input_temp = Double.parseDouble(start_scan.next());
            temp = ((input_temp*9.0/5.0)+32.0);
            temp = Math.round(temp*100.0)/100.0;
        }
        else{
            System.out.print("Acceptable inputs are: 'C', 'c', 'F', and 'f'");
            System.exit(0);
        }

        System.out.print( (input_foc.matches("C") || input_foc.matches("c")) ? "The temperature in degrees Celsius is " + temp + ".": "The temperature in degrees Fahrenheit is " + temp + ".");  //Prints out the converted temperature in F or C (Based on initial input).

        start_scan.close();
    }
}