package com.company;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        double x, y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        x = scanner.nextDouble();
        System.out.println("Enter second number: ");
        y = scanner.nextDouble();
        double temp = x;
        x = y;
        y = temp;
        System.out.println("x = "+ x + ". y = " + y);
    }
}
