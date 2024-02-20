import java.util.Scanner;

/**
 * The Multiple7 Class takes inputs from the user and then will print the sum of every multiple of
 * 7 within the range of numbers.
 * Author: Ken Kohlhof
 * Assignment 4: Question 2
 */
public class Multiple7 {


    public static void main(String[] args){

        //Instantiates the scnr variable
        Scanner scnr = new Scanner(System.in);

        //Prompts the user to input the first number
        System.out.println("Please enter your first number.");

        //Initializes the first variable and sets it to the next integer the user inputs
        int first = scnr.nextInt();

        //Prompts the user to input the second number
        System.out.println("Please enter your second number.");

        //Initializes the second variable and sets it to the next integer the user inputs.
        int second = scnr.nextInt();

        //Passes the variables first and second along with 0 for the initial sum to the multipleOf method.
        System.out.println(multipleOf(first, second, 0));

    }

    public static int multipleOf(int first, int second, int sum){

        //if condition that checks if first is bigger than second it will return -1
        if(first > second){
            return -1;
        }

        //if condition that checks if the first variable + 1 modulo 7 is equal to 0 and variable first + 1 is
        // less than variable second than it adds 1 to int sum and returns the call to method multipleOf passing
        // first + 1, second, and sum variables.
        if((first + 1) % 7 == 0 && (first + 1) < second){
            sum++;
            return multipleOf(first + 1, second,sum);
        }
        //if condition that checks if first + 1 is less than the value of second, it returns a call to method
        // multipleOf passing first + 1, second, and sum variables.
        else if((first + 1) < second){
            return  multipleOf(first + 1, second,sum);
        }

        //Returns the variable sum
        return sum;

    }
}
