/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Gilday
 */

import java.util.*;

//Exercise 23 - Troubleshooting Car Issues. (Program that walks the user through troubleshooting issues with a car. )
class Main {
  public static void main(String[] args) {
    Scanner start_scan = new Scanner(System.in); //Creation of a scanner object to allow for user input.

    System.out.print("Is the car silent when you turn the key? ");
    String a_input = start_scan.next(); //The start of the grand if/else chain.

    if(a_input.equals("y") || a_input.equals("Y") || a_input.equals("yes") || a_input.equals("Yes")){
      System.out.print("Are the battery terminals corroded? ");
      a_input = start_scan.next();

      if(a_input.equals("y") || a_input.equals("Y") || a_input.equals("yes") || a_input.equals("Yes")){
        System.out.print("Clean terminals and try starting again.");
        System.exit(0);
      }
      else if(a_input.equals("n") || a_input.equals("N") || a_input.equals("no") || a_input.equals("No")){
        System.out.print("Replace cables and try again.");
        System.exit(0);
      }
      else{
        System.out.print("Error: Input must be 'y', 'Y', 'Yes', 'yes', 'n', 'N', 'No', 'no'.");
        System.exit(0);
      }

    }
    else if(a_input.equals("n") || a_input.equals("N") || a_input.equals("no") || a_input.equals("No")){
      System.out.print("Does the car make a slicking noise? ");
      a_input = start_scan.next();

      if(a_input.equals("y") || a_input.equals("Y") || a_input.equals("yes") || a_input.equals("Yes")){
        System.out.print("Replace the battery.");
        System.exit(0);
      }
      else if(a_input.equals("n") || a_input.equals("N") || a_input.equals("no") || a_input.equals("No")){
        System.out.print("Does the car crank up but fail to start? ");
        a_input = start_scan.next();

        if(a_input.equals("y") || a_input.equals("Y") || a_input.equals("yes") || a_input.equals("Yes")){
          System.out.print("Check spark plug connections.");
          System.exit(0);
        }
        else if(a_input.equals("n") || a_input.equals("N") || a_input.equals("no") || a_input.equals("No")){
          System.out.print("Does the engine start and then die? ");
          a_input = start_scan.next();

          if(a_input.equals("y") || a_input.equals("Y") || a_input.equals("yes") || a_input.equals("Yes")){
            System.out.print("Does you car have fuel injection? ");
            a_input = start_scan.next();

            if(a_input.equals("y") || a_input.equals("Y") || a_input.equals("yes") || a_input.equals("Yes")){
              System.out.print("Get it in for service.");
              System.exit(0);
            }
            else if(a_input.equals("n") || a_input.equals("N") || a_input.equals("no") || a_input.equals("No")){
              System.out.print("Check to ensure the choke is opening and closing.");
              System.exit(0);
            }
            else{
              System.out.print("Error: Input must be 'y', 'Y', 'Yes', 'yes', 'n', 'N', 'No', 'no'.");
              System.exit(0);
            }

          }
          else if(a_input.equals("n") || a_input.equals("N") || a_input.equals("no") || a_input.equals("No")){
            System.out.print("This should not be possible.");
            System.exit(0);
          }
          else{
            System.out.print("Error: Input must be 'y', 'Y', 'Yes', 'yes', 'n', 'N', 'No', 'no'.");
            System.exit(0);
          }
          
        }
        else{
          System.out.print("Error: Input must be 'y', 'Y', 'Yes', 'yes', 'n', 'N', 'No', 'no'.");
          System.exit(0);
        }

      }
      else{
        System.out.print("Error: Input must be 'y', 'Y', 'Yes', 'yes', 'n', 'N', 'No', 'no'.");
        System.exit(0);
      }

    }
    else{
      System.out.print("Error: Input must be 'y', 'Y', 'Yes', 'yes', 'n', 'N', 'No', 'no'.");
      System.exit(0);
    }

    start_scan.close();
  }
}