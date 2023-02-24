package com.knoldus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // creating a reference variable of StringOperation class and call the function reverse string and calculatelength
        StringOperations object=new StringOperations();
        Scanner input = new Scanner(System.in);
        String originalString = input.next();
        String reversed=object.reverseString(originalString);
        int length= object.calculateLength(originalString);
        System.out.println("original string is "+originalString);
        System.out.println("Reversed String is "+reversed);
        System.out.println("length of the given string ="+length);

    }
}