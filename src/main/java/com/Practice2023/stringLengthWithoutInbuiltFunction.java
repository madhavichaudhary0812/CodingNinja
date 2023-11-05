package com.Practice2023;

public class stringLengthWithoutInbuiltFunction {

    public static void stringLengthWithLastIndex(String str)
    {
        int length = str.lastIndexOf("");
        System.out.println(length);
    }

    public static void byArrayLenthMethod(String str)
    {
        char arr[] = str.toCharArray();
        System.out.println(arr.length);
    }

    public static void byCounter(String str)
    {
        int count =0;
        char arr[] = str.toCharArray();
        for (char ch : arr)
        {
            count++;
        }
        System.out.println(count);

    }

    public static void main (String args[])
    {
        String Str ="shgweefgfgyuefyuefedscbdeverqfy8239e2398rr3rdkwed2fewjcjeqw";
        String Str1 = "qwerty";
        stringLengthWithLastIndex(Str1);
        stringLengthWithLastIndex(Str);

        byArrayLenthMethod(Str1);
        byArrayLenthMethod(Str);

        byCounter(Str1);
        byCounter(Str);


    }
}
