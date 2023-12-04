package com.Practice2023;

public class palindromeString {

    public static boolean palindromeCheck(String str)
    {
        int n = str.length()-1;
        int i =0;
        while(i<n/2)
        {
            if(str.charAt(i)!=str.charAt(n))
            {
                return false;
            }
            i++;
            n--;
        }
        return true;
    }

    public static boolean isPalindrome(String str)
    {
        StringBuilder sb = new StringBuilder("");

        for(int i = str.length()-1; i >=0; i--) {
           sb = sb.append(str.charAt(i));
        }
        if(str.equals(sb.toString()))
        {
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        String str = "madam";
        String str1 = "madabm";

        System.out.println("String check palindrome -> "+palindromeCheck(str));
        System.out.println("String check palindrome -> "+palindromeCheck(str1));

        System.out.println("String is palindrome -> "+isPalindrome(str));
        System.out.println("String is palindrome -> "+isPalindrome(str1));


    }
}
