package org.example;

/**
 * The HelloWorld class prints the string n number of times to the console using Recursion.
 * Author: Ken Kohlhof
 * Assignment 4: Question 1
 */
public class HelloWorld
{


    public static void main(String[] args){

        //Initializes n variable and sets it to 7
        int n = 7;

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
