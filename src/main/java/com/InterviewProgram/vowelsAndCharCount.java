package com.InterviewProgram;

import java.util.Locale;

public class vowelsAndCharCount {

    public static void vowelsCount(String str)
    {
        int vCount =0;
        int cCount =0;
        str = str.toLowerCase();
        for(int i=0; i<str.length()-1; i++)
        {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' )
            {
                vCount++;
            }else
            {
                cCount++;
            }
        }

        System.out.println("Character count is : " +cCount);
        System.out.println("vowels count is : " +vCount);


    }

    public static void main(String []args)
    {
        String str = "madhavieouaeiiiuu";
        vowelsCount(str);
    }
}
