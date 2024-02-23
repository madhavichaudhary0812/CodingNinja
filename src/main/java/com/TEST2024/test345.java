package com.TEST2024;

public class test345 {

    //string is palindrom
    //arora

    public static void main(String[] args) {

        String str = "arora";

        int mid = str.length();

        int i=0;

        while(i<mid)
        {
            if(str.charAt(i)==str.charAt(str.length()-1))
            {
                System.out.println("string is palindrome");;
                break;

            }else
            {
                System.out.println("string is not palindrome");;
            }
        }

    }
}
