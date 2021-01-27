package com.tts;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;


public class Main {

    public static void main(String[] args) {
        System.out.println("Please choose five numbers: ");
        Scanner scan = new Scanner(System.in);
        int numOne = scan.nextInt();
        int numTwo = scan.nextInt();
        int numThree = scan.nextInt();
        int numFour = scan.nextInt();
        int numFive = scan.nextInt();


        ArrayList<Integer> numbers = new ArrayList<Integer>(5);
        numbers.add(numOne);
        numbers.add(numTwo);
        numbers.add(numThree);
        numbers.add(numFour);
        numbers.add(numFive);
        System.out.println("Your  numbers are " + numOne + " " + numTwo + " " + numThree + " " + numFour + " " +
                "" + numFive +
                ".");
        int sum = numOne + numTwo + numThree + numFour + numFive;
        int product = numOne * numTwo * numThree * numFour + numFive;
        System.out.println("The sum of your numbers is: " + sum + ".");
        System.out.println("The product of your number is: " + product + ".");
        int maximum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > maximum) {
                maximum = numbers.get(i);
            }
        }
        int minimum = 0;
        for (int i = 0; i > numbers.size(); i++) {
            if (numbers.get(i) < minimum) {
                minimum = numbers.get(i);
            }
        }

        System.out.println("The largest number is: " + maximum + ".");
        System.out.println("The smallest number is: " + numOne + ".");


    }
}
