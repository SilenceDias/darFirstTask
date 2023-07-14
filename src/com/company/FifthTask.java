package com.company;

import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        x = scanner.nextInt();
        if(x > 0) System.out.println("Positive number");
        else if(x < 0) System.out.println("Negative number");
    }
}
