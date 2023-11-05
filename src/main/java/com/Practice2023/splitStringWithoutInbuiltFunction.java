package com.Practice2023;

import java.util.ArrayList;
import java.util.List;

public class splitStringWithoutInbuiltFunction {

    public static void splitString(String str)
    {
        String space = " ";
        List<String> list = new ArrayList<>();
        int i, start =0, end =0;

        for(i = str.indexOf(space); i !=-1 ; i=str.indexOf(space,i+1))
        {
            end =i;
            list.add(str.substring(start,end));
            start =i;
        }

        list.add(str.substring(end));
        System.out.println(list);
        System.out.println(" ");

        String Output[]=list.toArray(new String [list.size()]);
        for(String op : Output)
        {
            System.out.print(op);
        }
    }

    public static void main (String args[])
    {
        String given ="My Name is madhavi";
        splitString(given);
    }
}
