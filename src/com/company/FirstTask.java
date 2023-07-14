package com.company;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        double x, y;
        int choose;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        x = scanner.nextDouble();
        System.out.println("Enter second number: ");
        y = scanner.nextDouble();
        System.out.println("Choose operation\n1.Sum\n2.Multiply\n3.Subtract\n4.Divide\nUr answer: ");
        choose = scanner.nextInt();
        switch (choose){
            case 1:
                System.out.println("Sum: "+ x +" + " + y + " = " + sum(x,y));
                break;
            case 2:
                System.out.println("Multiply: "+ x +" X " + y + " = " + multiply(x,y));
                break;
            case 3:
                System.out.println("Subtract: "+ x +" - " + y + " = " + subtract(x,y));
                break;
            case 4:
                System.out.println("Divide: "+ x +" / " + y + " = " + divide(x,y));
                break;
            default:
                System.out.println("Wrong number");
                break;
        }

    }
    public static double sum(double x, double y){
        return x+y;
    }
    public static double multiply(double x, double y){
        return x*y;
    }
    public static double subtract(double x, double y){
        return x-y;
    }
    public static double divide(double x, double y){
        return x/y;
    }
}
