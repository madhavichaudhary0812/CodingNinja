package com.practice2024;

public class SumOfDigitsFromString {

  //  String s1 = s1.replaceAll("[^0-9]","");
//https://prepinsta.com/java-program/to-count-the-sum-of-numbers-in-a-string/
    //https://www.geeksforgeeks.org/calculate-sum-of-all-numbers-present-in-a-string/


    public static int sumOfDigits(String s)
    {
        int sum =0;

        for (int i = 0; i < s.length(); i++) {

            if(Character.isDigit(s.charAt(i)))
            {
                sum = sum + Character.getNumericValue(s.charAt(i));
            }

        }

        return sum;
    }

    public static void main(String[] args) {
        String str ="MADHAVI46245Chaudhary";
        System.out.println(sumOfDigits(str));

    }
}
