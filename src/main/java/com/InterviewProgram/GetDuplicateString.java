package com.InterviewProgram;

import java.util.*;


public class GetDuplicateString {

    public static void getDuplicateString( String str)
    {
        String []str1 = str.split("\\s");
        int len = str1.length;

        HashMap <String, Integer> map = new HashMap<>();

        for(String elm : str1)
        {
            if(map.get(elm) !=null)
            {
                map.put(elm , map.get(elm) +1);

            }else
            {
                map.put(elm, 1);
            }
        }

        Set <String> set1 = map.keySet();
        for( String sab : set1)
        {
            if(map.get(sab)>1)
            {
                System.out.println(sab+ " - " +map.get(sab) + " times ");

            }
        }

    }

    public static void main(String []args)
    {
       String str = "my name is madhavi name denotes person madhavi is qa and works in testing team qa team works with dev team";
        getDuplicateString(str);
    }
}
