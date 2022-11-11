package com.Optimisedprogram;

public class getSubStringAsPalindrom {

    /* Program - WAP to get longest palindrom substring from given string
    *
    * Source Link 1- https://youtu.be/AKIHWGumagI
    * Source - https://leetcode.com/submissions/detail/841598658/
    *
    * Approaches - Brute force 0
    * Approaches - Expand from center
    *
    * Edge cases - if String have even numbers of characters;
    * */

    public static String longestpalindrom(String s)
    {
        int start =0; int end =0;
        for (int i = 0; i < s.length() ; i++)
        {
            int len1 = expandFromCenter(s,i,i); //number of characters are odd
            int len2 = expandFromCenter(s,i,i+1); //number of characters are even
            int len = Math.max(len1,len2);

            if(end-start<len)
            {
                start = i-(len-1)/2;
                end = i+len/2;
            }

        }

        return s.substring(start, end+1);

    }

    public static int expandFromCenter(String s, int i, int j)
    {
        while(i>=0 && j < s.length() && s.charAt(i) == s.charAt(j))
        {
            i--;
            j++;
        }
        return j-i-1;
    }


    public static void main(String[] args) {
        String str = "dsghenitinfghh";

        System.out.println(longestpalindrom(str));
        ;
    }
}
