package com.company;

import java.util.Scanner;

public class EightsTask {
    public static void main(String[] args) {
        int max = 0, secondMax = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int length = scanner.nextInt();
        int array[] = new int[length];
        int sum = 0;
        for (int i = 0; i < length; i++){
            System.out.println("Enter " + (i + 1) + " element of array : ");
            array[i] = scanner.nextInt();
            if(array[i]>max){
                secondMax = max;
                max = array[i];
            }
        }
        System.out.println("Second max number is " + secondMax);


    }
}
