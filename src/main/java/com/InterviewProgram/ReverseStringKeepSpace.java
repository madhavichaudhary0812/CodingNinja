package com.InterviewProgram;

public class ReverseStringKeepSpace {


/*
    Given a string S, write a program to reverse the string while preserving the position of spaces.
    For example, if “I am a string” is the given string then the reverse of this string with preserving the position of spaces from the original string and output would be  “g ni r tsamaI”. 

            *For example:
              S —>“I am a string”
               S1—> “g ni r tsamaI”

            S= “I am a string”
             S’= “g ni r tsamaI”*/

    public static void reverseString(String s)
        {

            char [] strArray = s.toCharArray();

            char [] result = new char[strArray.length];

            for(int i = 0; i<strArray.length ;i++)
            {
                if(strArray[i] ==' ')
                {
                    result[i] = ' ';
                }
            }


            int n = strArray.length-1;

            for(int i=0; i < strArray.length; i++)
            {
                if(strArray[i] !=' ')
                {
                    if(result[n] == ' ')
                    {
                        n--;
                    }

                    result[n] = strArray[i];
                    n--;
                }
            }

            System.out.println(s + "reverse string is --------" +String.valueOf(result));

        }

        public static void main(String args[])
        {
            String s = "I am a string";
            //string str = "";
            reverseString(s);
        }
    }

