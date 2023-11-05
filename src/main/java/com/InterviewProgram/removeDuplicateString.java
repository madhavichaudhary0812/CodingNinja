package com.InterviewProgram;

import java.util.HashMap;
import java.util.Map;

public class removeDuplicateString {

    public static void removeDuplicate(String str)
    {
        String[] sb = str.split("\\s");
        HashMap<String, Integer> map = new HashMap<>();

        for(String word : sb)
        {
            if(map.get(word) != null)
            {
                map.put(word, map.get(word)+1);
            }else
            {
                map.put(word, 1);
            }

               // map.put(word, map.getOrDefault(word,0)+1);

        }

        System.out.print("String after removing duplicate String -: ");
        for(Map.Entry<String, Integer> set : map.entrySet())
        {
          if(set.getValue()==1)
          {
              String s1 = set.getKey();
              System.out.print(s1 +" ");
          }
        }
    }

    public static void main(String []args) {
        String str = "my name is madhavi this is good name";
        removeDuplicate(str);
    }
}
