package com.test;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;


public class GetFrequencyOfCharacters {

/*  WAP to get the frequency of each character in a given String.
    Input - "my name is madhavi"
    Output - m - 3, a -3, i-2, y-1,n-1,e-1,s-1,d-1,h-1,v-1
 */

/*
    Source link : https://www.geeksforgeeks.org/print-characters-frequencies-order-occurrence/
    Scenarios :
    1. String have multiple characters
    2. String is empty
    3. String is null
    4. Ignore Space

    Which Map need to use :

    HashMap - Want print map with any order of character.
    TreeMap - If you want to print map where character appears with sorted order of character and string
    LinkedHashMap - If you want print map in order character came in map

*/

    public static void getFrequency(String str)
    {

        if(str.length()<1 || str == null)
        {
            System.out.println("String doesn't have character");
            return;
        }

        char arr[] = str.replaceAll(" ","").toCharArray();

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();

        for(Character ch : arr)
        {

            if(map.get(ch)!=null)
            {
                map.put(ch, map.get(ch) + 1);

            }else

            {
                map.put(ch, 1);
            }
        }

        System.out.println(map);

    }


    public static String getFrequency1(String str)
    {

        if(str.length()<1 || str == null)
        {
            System.out.println("String doesn't have character");
            return null;
        }

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();

        for(Character ch : str.replaceAll(" ","").toCharArray())
        {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        pq.addAll(map.entrySet());

        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            Map.Entry e = pq.poll();
            for (int i = 0; i < (int)e.getValue(); i++)
                sb.append(e.getKey());
        }
        return sb.toString();

    }




public static void main(String args[])
{
    String str = "tripathi";
    String str1 = "my name is madhavi";
    String str2 = "";
    String str3 = null;
    System.out.println("WAP to get the frequency of each character in a given String.");
    getFrequency(str1);
    System.out.println(getFrequency1(str));

}
}