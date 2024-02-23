package com.practice2024;

import java.util.Arrays;

public class ReverseTheStringWithSpace {

    public static String reverseTheStringButNotWords(String str)
    {
        if(str.length()<1)
        {
            System.out.println("String is empty");
            return "";
        }

        String[] arr = str.split("\\s");
        int len = arr.length;

        System.out.println(Arrays.toString(arr));
        System.out.println("******************************************");

        String newStr = "";

        for (int i = len-1; i>=0; i--)
        {
            newStr = newStr + arr[i] + " ";
        }

        return newStr.trim();
    }


    public static void main(String[] args) {
        String str ="My name is madhavi and i am looking for Job and lord krishan-Radha helping me";
        System.out.println(reverseTheStringButNotWords(str));
    }
}
