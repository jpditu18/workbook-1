package com.pluralsight;
// import the scanner from java.uti so we can use it
import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {


        // create an instance of the scanner so we cn use it to get user input
        Scanner myScanner = new Scanner(System.in);


        // ask the user for the first number
        System.out.println("The first number is: ");

        //stop the application and wait for the user to answer the above question and hit enter
        int firstNumber = myScanner.nextInt();

        // ask the user for the second number
        System.out.println("The second number is: ");

        //stop the application and wait for the user to answer the above question and hit enter
        int secondNumber = myScanner.nextInt();

        //eats up the extra line feed (the press of enter) from the above scanner nextInt()
        myScanner.nextLine();

        //display menu for types of calculations
        System.out.println("Possible calculations: ");
        System.out.println("      (A)dd");
        System.out.println("      (S)ubtract");
        System.out.println("      (M)ultiply");
        System.out.println("      (D)ivide");
        System.out.print("Please select an option: ");


        String userChoice = myScanner.nextLine();
        //let figure out the product of the two numbers multiplied together
        int product = firstNumber * secondNumber;

        //
        System.out.print(firstNumber + " * " + secondNumber + " = " + product);












    }













}
