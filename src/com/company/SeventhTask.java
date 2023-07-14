package com.company;

import java.util.Scanner;

public class SeventhTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int length = scanner.nextInt();
        int array[] = new int[length];
        int sum = 0;
        for (int i = 0; i < length; i++){
            System.out.println("Enter " + (i + 1) + " element of array : ");
            array[i] = scanner.nextInt();
            sum+=array[i];
        }
        System.out.println("Sum of all elements: " + sum);
    }
}
