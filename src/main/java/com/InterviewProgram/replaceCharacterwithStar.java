package com.InterviewProgram;

public class replaceCharacterwithStar {

    // inbuilt function
    public static String replacewithAt(String str)
    {
        char ch = '#';
        String str1 = str.replace('l',ch);
        return str1;
    }

    //substring

    public static String replaceWithSubString(String str, int index, char ch)
    {
        String newString="";

        newString = str.substring(0,index)+ ch +str.substring(index+1);

        return newString;
    }

    //recurssion method
    public static String replace(String str)
    {
        int len = str.length();
        if (len == 1 || len == 0)
        {
            return str;
        }

        if(str.charAt(0) == 'l' )
        {
            String newStr = replace(str.substring(1));

            String output = "*" + newStr;

            return output;
        }else
        {

            String temp = replace(str.substring(1));

            String newoutput = str.charAt(0) + temp;

            return newoutput;

        }

    }

    public static void main(String []args) {
        String str = "hello";
        String input = replace(str);
        System.out.println(input);

        String str1 = "smileleell";
        String input1 = replacewithAt(str1);
        System.out.println(input1);

        String str3 = "Geeks Gor Geeks";
        String input2 = replaceWithSubString(str3, 6,'F');
        System.out.println(input2);
    }
}
