package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        //Prompt for sandwich size
        System.out.println("Choose your sandwich size");
        System.out.println("1: Regular ($5.45)");
        System.out.println("2: Large ($8.95)");
        System.out.println("Enter 1 or 2:");
        int size = myScanner.nextInt();


        //Set base price based on size
        double price = 0.0;
        if (size == 1) {
            price = 5.45;
        } else if (size == 2) {
            price = 8.95;
        } else {
            System.out.println("Invalid size selection");
            return;
        }

        //prompt for age
        System.out.println("Enter your age");
        int age = myScanner.nextInt();

        //Apply discount, 10% for students under the age of 17, and 20% for seniors 65 and up
        double discount = 0.0;
        if (age <=17) {
            discount = 0.10;
        } else if (age >= 65) {
            discount = 0.20;
        }

        double finalPrice = price - (price * discount);

        //output the final price
        System.out.printf("Your sandwich will cost:$%.2f", + finalPrice);



    }























}
