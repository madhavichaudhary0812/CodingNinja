package com.InterviewProgram;

import java.util.HashMap;
import java.util.Map;

public class removeDuplicateCharacter {

    public static void removeDuplicate(String str)
    {
        char [] sb = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for(char word : sb)
        {
            if(map.get(word) != null)
            {
                map.put(word, map.get(word)+1);
            }else
            {
                map.put(word, 1);
            }
        }

        System.out.print("String after removing duplicate String -: ");
        for(Map.Entry<Character, Integer> set : map.entrySet())
        {
            if(set.getValue()==1)
            {
                System.out.print(set.getKey());
            }
        }
    }

    public static void main(String []args) {
        String str = "hello";
        removeDuplicate(str);
    }
}
