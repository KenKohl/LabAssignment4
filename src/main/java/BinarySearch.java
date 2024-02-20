import java.util.Scanner;

/**
 * The BinarySearch class implements the Binary Search method to find a number inputted by the user in an array.
 * Author: Ken Kohlhof
 * Assignment 4: Question 3
 */
public class BinarySearch {


    public static void main(String[] args){

        //Instantiates the scnr object
        Scanner scnr = new Scanner(System.in);

        //Initializes an array of integers
        int[] array = {9, 17, 28, 36, 44, 52, 69, 71, 88, 91};

        //Prompts user to input a number for the key
        System.out.println("Which number would you like to find in the array?");

        //Initializes the Key variable and sets it to 44
        int key = scnr.nextInt();

        //Initializes the low and high variables
        int low = 0;
        int high = array.length - 1;

        //Passes the array, key, low, and high variables to the binarySearch method and prints results
        System.out.println(binarySearch(array, key, low, high));

    }

    public static int binarySearch(int[] array, int key, int low, int high){

        //Calculates the middle of the array and assigns it to int middle
        int middle = low + ((high - low) / 2);

        //If condition that checks if high is less than low, return -1.
        if (high < low){
            return -1;
        }
        //If condition that checks if the key value is less than the value stored in the array at index value middle
        //it will return a call to binarySearch passing array, key, low and middle - 1 as the new high.
        if (key < array[middle]){
            return binarySearch(array, key, low, (middle - 1));
        }
        //If condition that checks if the key value is more than the value stored in the array at index value middle
        //it will return a call to binarySearch passing array, key, middle - 1 as the new low and high.
        if (key > array[middle]){
            return binarySearch(array, key, (middle +1), high);
        }
        //If condition that checks if the key value is equal to the value stored in the array at index value middle
        //it will return the value middle.
        if (key == array[middle]){
            return middle;
        }

        //Returns -1 if the key value is not found in the array.
        return -1;
    }


}
