package com.InterviewProgram;

public class ReverseStringWords {

    public static String reverseWords(String s1)
    {
        String str[] = s1.split("\\s");
        StringBuilder reverseString = new StringBuilder(" ");

        for(String sb : str)
        {
            StringBuilder s3 = new StringBuilder(sb);
            s3.reverse();
            reverseString = reverseString.append(s3.toString() + " ") ;
        }
        return reverseString.toString().trim();
    }

    public static String reverseWordsPos(String s1)
    {
        String str[] = s1.split("\\s");
        String reverseString2 = "";
        int len = str.length;

        for(int i=len-1; i >=0 ; i--)
        {
            reverseString2 = reverseString2 + str[i] + " ";
        }
        return reverseString2.trim();
    }


    public static void main (String [] args) {
        System.out.println("WAP to reverse the words of string but don't change the words letter");
        System.out.println(" ");
        //input
        String s1 = "My name is Madhavi";
        //output - yM eman si ivahdaM;
        //output - Madhavi is name My;

        String reverseWord = reverseWords(s1);
        System.out.println("Reverse word String is :  " +reverseWord);

        String reverseWord1 = reverseWordsPos(s1);
        System.out.println("Reverse word position String is :  " +reverseWord1);
    }
}
