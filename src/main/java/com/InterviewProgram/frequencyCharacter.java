package com.InterviewProgram;

import java.util.HashMap;

public class frequencyCharacter {

    public static void main(String []args)
    {
        String str = "madhavichaudhary";

        char []chArray = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for(Character ch : chArray)
        {
            if(map.containsKey(ch))
            {
                map.put(ch, map.get(ch)+1);
            }else
            {
                map.put(ch,1);
            }
        }

        System.out.print(map);
    }
}
