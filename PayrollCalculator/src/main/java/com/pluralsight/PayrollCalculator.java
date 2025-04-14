package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {

    public static void main(String[] args) {


        // add the myScanner utility
        Scanner myScanner = new Scanner(System.in);

        //ask user to tell you their name
        System.out.println("What is your name? ");

        String name =  myScanner.nextLine();

        //ask user to tell you how many hours they worked
        System.out.println("How many hours did you work? ");

        //get the hours worked entered in
        double hoursWorked = myScanner.nextDouble();

        System.out.println("What is the pay rate? ");

        double payRate = myScanner.nextDouble();

        System.out.printf("%s made %.2f in gross pay" , name, hoursWorked * payRate);

























    }









}
