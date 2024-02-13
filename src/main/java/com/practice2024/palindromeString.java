package com.practice2024;

public class palindromeString {

    public static boolean isPalindrome(String str) {

        int i = 0;
        int n = str.length()-1;

        while (i<n/2)
        {
            if(str.charAt(i)!=str.charAt(n))
            {
                System.out.println("Given String is not palindrome");
                return false;
            }
            i++;
            n--;
        }
        System.out.println("Given String is palindrome");
        return true;
    }


    public static void main(String[] args) {
        String str = "mitim";
        String str1 = "gmitimfg";

        isPalindrome(str);
        isPalindrome(str1);

    }

}
