/**
 * Hieu Duong
 * CSC 201
 * Assignment 11
 * Problem 11.12:
 *
 * (Sum ArrayList) Write the following method that returns the sum of all numbers
 * in an ArrayList:
 * public static double sum(ArrayList<Double> list)
 * Write a test program that prompts the user to enter 5 numbers, stores them in an
 * array list, and displays their sum.
 *
 * 10/21/2017
 */

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        ArrayList<Double> list = new ArrayList<Double>();
        Scanner keyboard = new Scanner(System.in);
        for(int i=1; i<6;i++){
            System.out.println("Enter value "+i+": ");
            double value = keyboard.nextDouble();
            list.add(value);
        }

        System.out.println("Total value: "+sum(list));
    }

    /**
     * Calculate sum of array list
     * @param list
     * @return
     */
    public static double sum(ArrayList<Double> list){
        double sum = 0.0;
        for (double i:list) {
            sum+=i;
        }
        return sum;
    }
}
