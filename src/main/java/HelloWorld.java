import java.util.Scanner;

/**
 * The HelloWorld class prints the string n number of times to the console using Recursion The number of times
 * depends on what the user inputs into the console when prompted.
 * Author: Ken Kohlhof
 * Assignment 4: Question 1
 */
public class HelloWorld
{


    public static void main(String[] args){

        //Instantiates the scanner object
        Scanner scnr = new Scanner(System.in);

        //Prompts user to enter a number of times they would like the message to print into the console
        System.out.println("How many times would you like to print \"Hello World\"?");

        //Initializes n variable and sets the value to the next input from the user using the scanner object.
        int n = scnr.nextInt();

        //Calls recursion method passing the values 1 for i and the n variable
        recursion(1,n);

    }

    public static void recursion(int i, int n){
        //If condition that states if i is more then n, return to main.
        if(i > n){
            return;
        }
        //Prints Hello World to console
        System.out.println("Hello World");

        //Calls recursion method passing i+1 and n
        recursion(i+1,n);
    }
}
