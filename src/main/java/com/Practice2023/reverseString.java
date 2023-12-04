package com.Practice2023;

import java.util.Arrays;

public class reverseString {
    //reverse small string without space
    public static void reverseString(String str)
    {
        char arr[] = str.toCharArray();
        String rev = "";
        for(int i= arr.length-1; i>=0; i--)
        {
            rev = rev+arr[i];
        }

        System.out.println("final string is -> "+rev);
    }
//reverse big string with space
    public static void reverse(String str){
        String arr[]= str.split("\\s");
        String rev = "";
        for(int i=arr.length-1; i>=0;i--){
            rev = rev+" "+arr[i];
        }
        System.out.println(rev.trim());
    }

    //reverse string word along without position

    public static void reverseWord(String str)
    {
        String arr[]= str.split("\\s");

        String rev ="";

        for (int i = 0; i < arr.length; i++) {
            StringBuilder sb = new StringBuilder(arr[i]);
            rev = rev +" "+ sb.reverse();
        }
        System.out.println(rev.trim());
    }

//reverse string and word both

    public static void reverseWordandString(String str)
    {
        String arr[]= str.split("\\s");

        String rev ="";

        for (int i = arr.length-1; i>=0; i--) {
            StringBuilder sb = new StringBuilder(arr[i]);
            rev = rev +" "+ sb.reverse();
        }
        System.out.println(rev.trim());
    }


    //reverse without reverse method

    public static void reverseStringWord(String str)
    {
        String arr[] = str.split("\\s");
                //str.toCharArray()
        String rev1 = "";
        for(int i= arr.length-1; i>=0; i--)
        {
            String rev = "";
            for (int j = arr[i].length()-1; j >=0; j--) {

                char srr[]= arr[i].toCharArray();
                rev = rev + srr[j];
            }
            rev1 = rev1+" "+rev;
        }

       // System.out.println("final string is -> "+rev);
        System.out.println("final string is -> "+rev1.trim());
    }

    public static void main(String args[])
    {
        String str ="Madhavi";
        String str1 = "My name is madhavi";
        reverseString(str);
        reverse(str1);
        reverseWord(str1);
        reverseWordandString(str1);
        reverseStringWord(str1);

    }
}
