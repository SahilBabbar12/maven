package com.knoldus;

public class StringOperations {
    String reverseString(String originalstring){
        String reversedString="";
        for(int index=originalstring.length()-1;index>=0;index--)
        {
            reversedString+=originalstring.charAt(index);
        }
        return reversedString;
    }
    int calculateLength(String originalString){
        int count =0;
        for (int index=0;index<originalString.length();index++)
        {
            count++;
        }
        return  count;
    }
}