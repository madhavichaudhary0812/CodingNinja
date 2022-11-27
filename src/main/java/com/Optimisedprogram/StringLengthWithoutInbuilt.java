package com.Optimisedprogram;

public class StringLengthWithoutInbuilt {

    /* WAP to get length of String length of String without using inbuilt method
    * Approach 1- last index of string
    * Approach 2- convert in char of array and get length of array.
    * Approach 3- convert in array and use counter
    * */

    public static void getLength(String s)
    {
        int length = s.lastIndexOf("");
        System.out.println(length);
    }

    public static void getLengthByArray(String s)
    {
        char []ch = s.toCharArray();
        int length = ch.length;
        System.out.println(length);
    }

    public static void getLengthByCounter(String s)
    {
        int count = 0;
        for (Character ch :s.toCharArray())
        {
            count++;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        String Str = "shgweefgfgyuefyuefedscbdeverqfy8239e2398rr3rdkwed2fewjcjeqw";
        String Str1 = "qwerty";
        getLength(Str1);
        getLengthByArray(Str);
        getLengthByCounter(Str1);
    }
}
