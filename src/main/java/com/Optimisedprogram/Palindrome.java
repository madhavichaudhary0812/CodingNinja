package com.Optimisedprogram;

public class Palindrome {

/*    WAP to check a given String is Palindrome.
    Input - "nitin"
    Output - Yes

    Source link - https://www.javatpoint.com/java-program-to-determine-whether-a-given-string-is-palindrome
    Source link - https://www.geeksforgeeks.org/java-program-to-check-whether-a-string-is-a-palindrome/
*/

    public static boolean palindromeCheck(String str) {

        StringBuilder revStr = new StringBuilder("");

        for (int i = str.length() - 1; i >= 0; i--) {
            revStr = revStr.append(str.charAt(i));
        }
        if (str.equals(revStr.toString())) {
            return true;
        }
        return false;

    }


    public static boolean isPalindrome(String str) {

        int n = str.length() - 1;
        int i = 0;

        while (i < n / 2) {
            if (str.charAt(i) != str.charAt(n)) {
                return false;
            }
            i++;
            n--;
        }
        return true;
    }


    public static void main(String args[]) {
        System.out.println("WAP to check a given String is Palindrome.");
        String str = "nitin";
        System.out.println(str + " <-----status is ---> " + isPalindrome(str));
        System.out.println(str + " <-----status is ---> " + palindromeCheck(str));

    }
}


