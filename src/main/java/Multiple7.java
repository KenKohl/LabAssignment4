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
        multipleOf(first, second, 0);

    }

    public static void multipleOf(int first, int second, int sum){
        //if condition that if the first variable + 1 modulo 7 is equal to 0 and variable first is less than
        //variable second than add 1 to int sum and pass first + 1, second, and sum to multipleOf method.
        if((first + 1) % 7 == 0 && first < second){
            sum++;
            multipleOf(first + 1, second,sum);
        }
        //if condition that if first is greater than or equal to second, print the sum of numbers that were
        //divisible by 7 within the range given
        else if(first >= second){
            System.out.println("The sum of all numbers divisible by 7 in the range of " +
                    "numbers entered is " + sum);
        }
        //Else condition that when other conditions fail passes first+1, second, and sum variables to multipleOf method.
        else{
            multipleOf(first + 1, second,sum);
        }

    }
}
