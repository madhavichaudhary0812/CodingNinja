package com.practice2024;

public class ReverseOnlyWordsInString {

    public static String reverseTheWordsButNotString(String str)
    {
        String newStr ="";

        if(str.length()<1)
        {
            System.out.println("String is empty");
            return "";
        }

        String arr[] = str.split("\\s");
        for (String npr : arr)
        {
            StringBuilder revStr = new StringBuilder(npr);
            newStr = newStr + revStr.reverse() + " ";
        }


        return newStr;
    }

    public static void main(String[] args) {
        String str ="My name is madhavi and i am looking for Job and lord krishan-Radha helping me";
      //  output - yM eman si ivahdam dna i ma gnikool rof boJ dna drol ahdaR-nahsirk gnipleh em
        System.out.println(reverseTheWordsButNotString(str));
    }
}
