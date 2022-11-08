package com.Optimisedprogram;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class lastRepeatingCharacter {

    public static void lastRepeatingChar(String str)
    {
        char []ch = str.toCharArray();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(int i = ch.length-1 ; i >=0; i--)
        {
            map.put(ch[i], map.getOrDefault(ch[i],0)+1);
        }

        for(Map.Entry<Character,Integer> mp : map.entrySet())
        {
            if(mp.getValue()>1)
            {
                System.out.println(mp.getKey());
                break;
            }
        }
    }

    //
    public static void lastReoccuringCharacter(String str)
    {
        char [] chr = str.toCharArray();
        Set<Character> data = new HashSet<>();
        for(int i = chr.length-1 ; i>=0 ; i--)
        {
            if(data.add(chr[i])==false)
            {
                System.out.println(chr[i]);
                break;
            }
        }
    }

    public static void main(String args[])
    {
        String str = "tripatthi";
        String str1 = "my name is madhavi";

        lastRepeatingChar(str);
        System.out.println("-----");
        lastReoccuringCharacter(str);
        System.out.println("-----");


        //System.out.println("WAP to get the frequency of each character in a given String.");
//        (str1);
//        System.out.println(getFrequency1(str));

    }
}
