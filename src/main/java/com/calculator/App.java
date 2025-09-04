package com.calculator;
public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Demonstrating addition
        System.out.println("Addition: " + calculator.add(5, 3));

        // Demonstrating subtraction
        System.out.println("Subtraction: " + calculator.subtract(5, 3));

        // Demonstrating multiplication
        System.out.println("Multiplication: " + calculator.multiply(5, 3));

        // Demonstrating division
        System.out.println("Division: " + calculator.divide(5, 3));
    }
}