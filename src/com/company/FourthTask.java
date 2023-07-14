package com.company;

import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {
        int x, y, z;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        x = scanner.nextInt();
        System.out.println("Enter second number: ");
        y = scanner.nextInt();
        System.out.println("Enter third number: ");
        z = scanner.nextInt();
        if(z>x && z > y) System.out.println(z);
        else if(x > z && x > y) System.out.println(x);
        else if(y > z && y > x) System.out.println(y);
    }
}
