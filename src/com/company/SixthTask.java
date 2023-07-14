package com.company;

import java.util.Scanner;

public class SixthTask {
    public static void main(String[] args) {
        String str;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string: ");
        str = s.next();
        StringBuilder string = new StringBuilder(str);
        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) == 'a') string.setCharAt(i, 'b');
            else if(string.charAt(i) == 'A') string.setCharAt(i, 'B');
        }
        System.out.println(string);
    }


}
