package com.pluralsight;

import java.util.Scanner;

public class MyApplication {

    public static void main(String[] args) {


        Scanner myScanner = new Scanner(System.in);


        //print out user's name and age
        System.out.println("What's your name? ");
        String name = myScanner.nextLine();
        String [] nameParts = name.split(" ");
        String firstName = nameParts[0];
        String lastName = nameParts[1];

        System.out.println("How old are you " + firstName + "?");
        int age = myScanner.nextInt();

        System.out.println(name + " is " + age + " years old ");

        //add an if statement that checks the users age
        if (age >= 18) {
            System.out.println(name + " is old enough to vote ");
        }else {
            System.out.println(name + " is not old enough to vote ");
        }





    }







}
