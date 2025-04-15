package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalculator {
    //create the scanner to capture user input
    static Scanner theScanner = new Scanner(System.in);

    public static void main(String[] args) {

        //ask user for a date and store it as a string
        System.out.println("What is the pickup date?");
        String pickupDate = theScanner.nextLine();


        //ask the user the number of days for the rental
        //store that as an int
        System.out.println("How many days are you renting for?");
        int rentDays = theScanner.nextInt();

        //fix the weird carriage return rom the above scanner
        theScanner.nextLine();

        //do you want an electronic toll tag 3.95 upcharger per day
        //store answer as a string
        System.out.println("Do you an electronic toll tag? (3.95/per day) (y/n):");
        String tollTag = theScanner.nextLine();



        //do you want a gps? 2.95 per day
        System.out.println("Do you want gps? (2.95/per day) (y/n):");
        String gps = theScanner.nextLine();
        //do you want roadside assistance? 3.95 per day
        System.out.println("Do you want roadside assistance? (3.95/per day) (y/n):" );
        String roadSide = theScanner.nextLine();

        //we need to ask their age
        System.out.println("How old are you?");
        int age = theScanner.nextInt();

        //calculate the base rental price 29.99 per day
        double basePrice = 29.99 * rentDays;

        //Start options cost at 0, they don't have an options cost unless they pick options
        double optionCost = 0;

        //figure out the options cost (gps + toll + roadside assistance)
        if(tollTag.equals("y")){
            optionCost += 3.95;
        }

        if (gps.equals("y")){
            optionCost += 2.95;
        }

        if (roadSide.equals("y")){
            optionCost += 3.95;
        }

        //generate total options cost
        optionCost *= rentDays;

        double subTotal = basePrice * optionCost;

        double surcharge = 0;
        if (age <25){
             surcharge= subTotal * .3;
        }

        double total = subTotal + surcharge;



        //display some information
        //basic car rental price
        //options cost
        //underage driver surcharge
        //total cost
        System.out.printf("Base Rental cost $%.2f\n", basePrice);
        System.out.printf("Options Cost Cost $%.2f\n", optionCost);
        System.out.printf("Underage Surcharge $%.2f\n", surcharge);
        System.out.printf("Total Cost Cost $%.2f\n", total);
    }

























}
