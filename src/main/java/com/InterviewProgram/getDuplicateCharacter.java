package com.InterviewProgram;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.*;

public class getDuplicateCharacter {

    public static void getDuplicateCharacters(String str)
    {
        char [] chArr = str.toCharArray();


        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : chArr)
        {
            if(map.containsKey(ch))
            {
                map.put(ch, map.get(ch)+1);
            }else
            {
                map.put(ch,1);
            }
        }

        Set<Character> keys = map.keySet();
        for(Character ch : keys)
        {
            if(map.get(ch) >1)
            {
                System.out.println(ch + "  is " + map.get(ch) + " times");
            }
        }
    }

    public static void main(String []args)
    {
        String str = "madhavichaudhary";
        getDuplicateCharacters(str);

    }
}
