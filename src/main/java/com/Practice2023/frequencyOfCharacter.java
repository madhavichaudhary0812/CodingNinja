package com.Practice2023;

import java.util.HashMap;
import java.util.Map;

public class frequencyOfCharacter {

    public static void frequencyOfCharacters(String str)
    {
        char ch[] = str.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        for(Character mh : ch)
        {
            map.put(mh, map.getOrDefault(mh,0)+1);
        }

        System.out.println(map);

    }

    public static void main(String[] args) {
        String str ="djghfggdyyefeiufvgbhcdscyewaaahdwg";
        frequencyOfCharacters(str);
    }
}
