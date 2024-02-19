package org.example;

/**
 * The BinarySearch class implements the Binary Search method to find a number in an array.
 * Author: Ken Kohlhof
 * Assignment 4: Question 3
 */
public class BinarySearch {


    public static void main(String[] args){

        //Initializes an array of integers
        int[] array = {9, 17, 28, 36, 44, 52, 69, 71, 88, 91};

        //Initializes the Key variable and sets it to 44
        int key = 44;

        //Initializes the low and high variables
        int low = 0;
        int high = array.length - 1;

        //Passes the array, key, low, and high variables to the binarySearch method
        binarySearch(array, key, low, high);
    }

    public static void binarySearch(int[] array, int key, int low, int high){

        //Calculates the middle of the array and assigns it to int middle
        int middle = low + ((high - low) / 2);

        //If condition that if the key is found print the number and what index it is at.
        if (key == array[middle]){
            System.out.println("The number " + key + " is present at index " +
                    middle + ".");
        }
        //If condition that if the key is smaller than the number in the middle of the array it
        // passes variables array, key, low, and middle - 1 as new high value to binarySearch method.
        else if (key < array[middle]){
            binarySearch(array, key, low, (middle - 1));
        }
        //If condition that if the key is larger than the number in the middle of the array it
        // passes variables array, key, middle - 1 as new low value, and high to binarySearch method.
        else if (key > array[middle]){
            binarySearch(array, key, (middle +1), high);
        }
        //Else condition that prints the number is not found in the array if all other cases fail.
        else{
            System.out.println("The number is not present in the array.");
        }
    }


}
