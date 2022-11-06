package com.InterviewProgram;

public class palindromeString {

    public static void isPalindrome(String str)
    {
        int len = str.length();
        if(len==0)
        {
            System.out.println("String is not palindrome as string is null");
        }

        String reverseStr ="";
        for(int i = (len-1); i>=0 ; --i)
        {
            reverseStr += str.charAt(i);
        }

        if(reverseStr.equals(str))
        {
            System.out.println("String is palindrome");
        }else
        {
            System.out.println("String is not palindrome");
        }

    }

    public static boolean isPalindrome1(String str)
    {
        int i=0 ;
        int len = str.length()-1;
        int mid = (len/2);

        while(i<mid)
        {
            if(str.charAt(i) != str.charAt(len))
            {
                return false;

            }else
            {
                i++;
                len--;
            }
        }

        return true;



    }



    public static void main(String []args)
    {
        String str = "radar";
        String str2= "nitin";
        boolean status = isPalindrome1(str);
        System.out.println(status);
        isPalindrome(str2);

    }
}
