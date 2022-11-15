package com.Optimisedprogram;

import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateString {

    /* WAP to get all duplicate String from given String
    * */

    public static void getDuplicateString(String str)
    {
        String []strArr = str.split("\\s");

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for(String word : strArr)
        {
            map.put(word, map.getOrDefault(word,0)+1);
        }

        for(Map.Entry<String, Integer> entry : map.entrySet())
        {
            if(entry.getValue()>1)
            {
                System.out.println(entry.getKey() +" is duplicate String and value is ---> "+entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        String str = "my name is madhavi i live in delhi and my full name is madhavi chaudhary and my value is more and i deserve more";

        getDuplicateString(str);
    }
}
