/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Gilday
 */

import java.util.*;

//Exercise 17 - Blood Alcohol Calculator. (Program that prompts for your weight, gender, total alcohol consumed (in ounces), and the amount of time since your last drink. It then outputs your blood alcohol content (BAC), and if you are allowed to legally drive with that BAC.)
class Main {
    public static void main(String[] args) {
        Scanner start_scan = new Scanner(System.in); //Creation of a scanner object to allow for user input.
        int x = 1; //Used as an exit for do-whiles.
        String input_gender, input_AlAm, input_W, input_H;

        do{
            System.out.print("Enter a 1 is you are male or a 2 if you are female: ");
            input_gender = start_scan.next(); //Reads in whether the individual is female or male.
            if (!input_gender.matches("[1-2]")) {
                System.out.println("Error: Input the integer value 1 or 2 for this step.\n");
                x = 2;
            }
            else{
                x = 1;
            }
        }while (x == 2);

        do{
            System.out.print("How many ounces of alcohol did you have? ");
            input_AlAm = start_scan.next(); //Reads in alcohol amount consumed.
            if (!input_AlAm.matches("[0.0-9.0]+")) {
                System.out.println("Error: Input a valid positive number.\n");
                x = 2;
            }
            else{
                x = 1;
            }
        }while (x == 2);

        do{
            System.out.print("What is your weight, in pounds? ");
            input_W = start_scan.next(); //Reads in weight in pounds.
            if (!input_W.matches("[0.0-9.0]+")) {
                System.out.println("Error: Input a valid positive number.\n");
                x = 2;
            }
            else{
                x = 1;
            }
        }while (x == 2);

        do{
            System.out.print("How many hours has it been since your last drink? ");
            input_H = start_scan.next(); //Reads in hours since last drink.
            if (!input_H.matches("[0.0-9.0]+")) {
                System.out.println("Error: Input a valid positive number.\n");
                x = 2;
            }
            else{
                x = 1;
            }
        }while (x == 2);

        //Below is the block of code used to convert input strings into doubles create an initial value for BAC.
        double AlAm = Double.parseDouble(input_AlAm);
        double W = Double.parseDouble(input_W);
        double H = Double.parseDouble(input_H);
        double BAC = 0;

        //Below if statements are used to calculate BAC based on the formula: (alcohol amount*5.4)/(weight*alcohol distribution ration) - (.015*number of hours since last drink).
        if (input_gender.matches("1")){ //Alcohol distribution ratio for men is: 0.73.
            BAC = ((AlAm*5.14)/W*0.73) - (.015*H);
            BAC = Math.round(BAC*1000000.00)/1000000.00;
        }
        else if(input_gender.matches("2")){ //Alcohol distribution ratio for women is 0.66.
            BAC = ((AlAm*5.14)/W*0.66) - (.015*H);
            BAC = Math.round(BAC*1000000.00)/1000000.00;
        }

        System.out.print((BAC >= 0.08) ? "Your BAC is " + BAC + "\nIt is not legal for you to drive.": "Your BAC is " + BAC + "\nIt is legal for you to drive.");  //Prints out your current estimated value of BAC and whether it is legal for you to drive based on this.

        start_scan.close();
    }
}