/*Problem Statement:
Write a Java program to demonstrate the concept of method overloading in Object-Oriented Programming (OOP).

Create a class named Calculator with multiple methods named add() that perform addition:

Add two integers
Add three integers
Add two decimal numbers

In the main() method:

Create an object of the Calculator class
Call each overloaded method with different arguments
Display the results */  
// Java Program to Demonstrate Method Overloading

class Calculator {

    // Method to add two integers
    void add(int a, int b) {
        System.out.println("Sum of 2 integers: " + (a + b));
    }

    // Overloaded method to add three integers
    void add(int a, int b, int c) {
        System.out.println("Sum of 3 integers: " + (a + b + c));
    }

    // Overloaded method to add two decimal numbers
    void add(double a, double b) {
        System.out.println("Sum of 2 decimal numbers: " + (a + b));
    }
}

public class Addition {
    public static void main(String[] args) {
        Calculator obj = new Calculator();

        obj.add(10, 20);
        obj.add(10, 20, 30);
        obj.add(5.5, 4.7);
    }
}