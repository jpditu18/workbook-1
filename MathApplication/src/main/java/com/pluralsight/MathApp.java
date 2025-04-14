package com.pluralsight;

public class MathApp {

    // this is the main method and where my code will run
    // all code I am typing for this exercise will be in this method
    public static void main(String[] args) {







    int bobSalary = 55000;
    int garySalary = 100000;

    int highestSalary = Math.max(bobSalary, garySalary);

     System.out.println("The highest salary is " + highestSalary);



     int carPrice = 32000;
     int truckPrice = 44000;

     System.out.println("The lowest price " + Math.min(carPrice, truckPrice));

     System.out.println("---------------------------------------");

     double radius = 7.25;

     double area = Math.PI * Math.pow(radius, 2);

     System.out.println("The area of the circle is " + area);

     System.out.println("------------------------------------");

     double number = 5.0;
     double squareRoot = Math.sqrt(number);

     System.out.println("The square root is " + squareRoot);

     System.out.println("---------------------------------------");

     int x1 = 5;
     int x2 = 85;
     int y1 = 10;
     int y2 = 50;

     int newX = x2 - x1;
     int newY = y2 - y1;
     System.out.println("Distance between points is " + Math.sqrt(Math.pow(newX, 2) + Math.pow(newY,2)));

     System.out.println("------------------------------");

     double x = -3.8;
     double absValue = Math.abs(x);

     System.out.println("The value of " + x + " is " + absValue);



     System.out.println("------------------------------");

     System.out.println("A random number between 0 and 1 is: " + Math.random());










     }















    }


