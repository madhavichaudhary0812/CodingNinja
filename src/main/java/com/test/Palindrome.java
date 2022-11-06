package com.test;

public class Palindrome {

/*    WAP to check a given String is Palindrome.
    Input - "nitin"
    Output - Yes

    Source link - https://www.javatpoint.com/java-program-to-determine-whether-a-given-string-is-palindrome
    Source link - https://www.geeksforgeeks.org/java-program-to-check-whether-a-string-is-a-palindrome/
*/

    public static boolean Palindrome(String str) {

        boolean flag ;
        StringBuilder revStr = new StringBuilder("");

        for (int i = str.length() - 1; i >= 0; i--)
        {
            revStr = revStr.append(str.charAt(i));
        }
        if (str.equals(revStr.toString()))
        {
            flag = true;
        } else
        {
            flag = false;
        }

        return flag;
    }


    // by Mid point
    public static boolean isPalindrome(String str)
    {
        //boolean flag1;
        int n = str.length()-1;
        int mid = n/2;
        int i=0;

        while(i<mid)
        {
            if(str.charAt(i) != str.charAt(n))
            {
                return false;
            }
            i++;
            n--;

        }

        return true;
    }


    public static void main(String args[])
    {
        System.out.println("WAP to check a given String is Palindrome.");
        String str = "nitin";
        System.out.println(str + " <-----status is ---> " +isPalindrome(str));





    }
}


