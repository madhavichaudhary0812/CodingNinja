package com.InterviewProgram;

import java.util.*;

public class charOfFrequency {

    private static void charFrequencyFunction(String s1)
    {

        char [] str = s1.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for(Character ch : str)
        {
            if(map.containsKey(ch))
            {
                map.put(ch, map.get(ch) +1);
            }else
            {
                map.put(ch,1);
            }
        }

        for(Map.Entry key :map.entrySet())
        {
            System.out.println("Character * " +key.getKey() +" * frequency :- " +key.getValue());
        }

    }

    public static void main(String [] args)
    {
        System.out.println("WAP to get frequency of each character in string");

        String s1 = "mynameismadhavi";
        charFrequencyFunction(s1);
    }
}
