/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Gilday
 */

import java.util.*;

//Exercise 20 - Multi-state Sales Tax Calculator. (Program that prompts for the order amount and the state. If the state is “WI,” then the order must be charged 5% tax, with an extra .5% for Eau Claire county residents and .4% for Dunn county residents. Then displays the state, county, tax, and total for Wisconsin/Illinois residents, or it will display just the state, county, and total for non-residents.)
class Main {
    public static void main(String[] args) {
        Scanner start_scan = new Scanner(System.in); //Creation of a scanner object to allow for user input.

        System.out.print("What is the order amount? ");
        String input_O = start_scan.next(); //Reads in the order amount.
        System.out.print("What state do you live in? ");
        String input_st = start_scan.next(); //Reads in the order state.
        System.out.print("What county do you live in? ");
        String input_c = start_scan.nextLine(); //Used to remove trailing \n from scan.next.
        input_c = start_scan.nextLine(); //Reads in the county.

        double O = Double.parseDouble(input_O);//Converts input string into double.
        double to = O; //New variable carrying order amount data.
        double tax = 1;
        //(O*.055)
        if(input_st.equals("Wisconsin")){ //If statement adds tax to total if the state input is 'Wisconsin'.
            if(input_c.equals("Eau Claire")){
                tax = (.055*O);
                to = Math.round((tax+O)*100.00)/100.00;
            }
            else if(input_c.equals("Dunn")){
                tax = (.054*O);
                to = Math.round((tax+O)*100.00)/100.00;
            }
            else{
                tax = (.05*O);
                to = Math.round((tax+O)*100.00)/100.00;
            }
        }

        if((input_st.equals("Illinois"))){ //If statement adds tax to total if the state input is 'Illinois'.
            tax = (.08*O);
            to = Math.round((tax+O)*100.00)/100.00;
        }

        System.out.print((input_st.equals("Wisconsin")) || (input_st.equals("Illinois"))? "The tax is $" + tax + ".\nThe total is $" + to + "." : "The total is $" + to + "."); //Will print the tax amount for Wisconsin and Illinois along with the total; Will only print total w/out tax if state is not Wisconsin or Illinois.
        start_scan.close();
    }
}