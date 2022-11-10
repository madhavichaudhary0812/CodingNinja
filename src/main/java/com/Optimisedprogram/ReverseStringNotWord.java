package com.Optimisedprogram;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseStringNotWord {

    /*WAP to Reverse Words in a String like below :
    input - "My Name is Madhavi"
    output - "yM emaN si ivahdaM"

    Source link - https://www.geeksforgeeks.org/reverse-individual-words/
     */
    // Scenario 1 - When String is null;
    // Scenario 2 - When String is Empty;
    // Scenario 3 - When String have only one word;
    // Scenario 4 - When String have more than one word;


    public static String reverseStringNotWord(String str) {

        if (str == null) {
            System.out.println("------> Given String is null <------");
            return null;
        }

        if (str.length() < 1) {
            System.out.println("------> Given String is empty <------");
            return null;
        }

        StringBuilder reverseString = new StringBuilder("");

        for (int i = str.length() - 1; i >= 0; i--) {
            reverseString = reverseString.append(str.charAt(i));

        }

        String s2 = reverseString.toString().trim();
        System.out.println("------> reverse String for 1 <------" + s2);


        String[] arr = s2.split(" ");
        StringBuilder reverseWord = new StringBuilder("");


        for (int i = arr.length - 1; i >= 0; i--) {
            reverseWord.append(" " + arr[i]);

        }

        System.out.println("------> reverse String for 2<------" + reverseWord.toString().trim());
        return reverseWord.toString().trim();
    }

    // Splitting the string based on space and reverse each part
    // and then join
    public static void reverse(String str) {
        String result = Arrays.asList(str.split(" "))
                .stream()
                .map(s -> new StringBuilder(s).reverse())
                .collect(Collectors.joining(" "));

        System.out.println(result);

    }

    // Reverse method of string builder
    public static String reverseWords(String s1) {
        String str[] = s1.split("\\s");
        StringBuilder reverseString = new StringBuilder(" ");

        for (String sb : str) {
            StringBuilder s3 = new StringBuilder(sb);
            s3.reverse();
            reverseString = reverseString.append(s3.toString() + " ");
        }
        return reverseString.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println("***** WAP to reverse the string but not words *****");
        String str = "My Name is Madhavi";
        String str1 = "";
        String str2 = null;
        String str3 = "try";

        reverseStringNotWord(str);
        reverse(str);
//       reverseStringNotWord(str1);
//        reverseStringNotWord(str2);
//        reverseStringNotWord(str3);

    }

}
