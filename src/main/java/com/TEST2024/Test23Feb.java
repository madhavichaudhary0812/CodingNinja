package com.TEST2024;

public class Test23Feb {


    public static boolean isPalindrome(String str)
    {
        int len = str.length();
        int n =len-1;
        int i =0;
        while (i < len/2)
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
    public static void main(String[] args) {

        String str = "nitinyu";
        System.out.println("Given String is Palindrome ->"+isPalindrome(str));

    }
}
