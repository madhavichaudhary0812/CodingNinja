package com.InterviewProgram;

import java.util.HashMap;

public class frequencyOfString {

    public static void main(String []args)
    {
        String str = "my name is madhavi name denotes person madhavi is qa and works in testing team qa team works with dev team";
        String [] strArray = str.split("\\s");

        HashMap<String, Integer> map = new HashMap<>();
        for(String abc : strArray)
        {
            if(map.get(abc) !=null)
            {
                map.put(abc, map.get(abc)+1);
            }else
            {
                map.put(abc,1);
            }
        }

        System.out.print(map);
        System.out.println(" ");

        //print by loop
        for(int i=0; i<strArray.length;i++) {
            System.out.print(strArray[i] + " = " + map.get(strArray[i]) +" ");
        }
    }
}
