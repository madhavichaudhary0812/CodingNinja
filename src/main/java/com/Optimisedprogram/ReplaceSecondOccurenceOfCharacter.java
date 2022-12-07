package com.Optimisedprogram;

import java.util.HashMap;

public class ReplaceSecondOccurenceOfCharacter {

    public static String replacOccurence(String s)
    {
        StringBuilder str = new StringBuilder();
        int count =0;
        char arr[] = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 'o' && count ==1)
            {
                arr[i] = '$';
                count++;
            }

            str = str.append(arr[i]);

        }



        return str.toString();
    }

        private static String replace2ndOccurrence(String s, char c) {
            int n = s.indexOf(c);
            int m = s.substring(n + 1).indexOf(c);
            if (m == -1) {
                System.out.println(c + " is only once in a String");
                return s;
            }
            return s.substring(0, (m + n + 1)) + "$" + s.substring(n + m + 2);
        }




        public static void main(String[] args) {
        String s = "tomorrow";
        System.out.println(replacOccurence(s));
        System.out.println(replace2ndOccurrence(s,'o'));



}}
