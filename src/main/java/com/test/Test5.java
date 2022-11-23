package com.test;

import java.util.*;
public class Test5 {
   /*
   *
   *
   */

    public static void main(String[] args) {


        String given = "my name is Jeetendra and I work for zepto";

        String spaceStr = " ";
        List<String> list = new ArrayList<>();
        int i , start =0,end =0;
        for(i=given.indexOf(spaceStr); i !=-1; i=given.indexOf((spaceStr),i+1))
        {
            end =i;
            list.add(given.substring(start,end));
            start =i;
        }

        list.add(given.substring(end));
        System.out.println(list);
         System.out.println(" ");
        String Output[] = (String[]) list.toArray(new String [list.size()]);

        for(String op : Output)
        {

            System.out.print(op.trim());
        }

    }
}