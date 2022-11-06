package com.InterviewProgram;

import java.util.*;


public class duplicateElementInArray {

// Using only hashmap
    public static void findDuplicate3(int []arr)
    {
        System.out.println("Find duplicate element by hashMap approach");
        System.out.print("Duplicate Elements are by map : { ");

        HashMap<Integer, Integer> map = new HashMap<>();
        for(Integer e : arr)
        {
            if(map.get(e) != null)
            {
                map.put(e, map.get(e)+1);
            }else
            {
                map.put(e, 1);
            }
        }


        for(Map.Entry <Integer, Integer> set : map.entrySet())
        {
            if(set.getValue() >1)
            {
                System.out.print(set.getKey() +" ");
            }
        }
        System.out.println("}");
        System.out.println("***************************************************");
    }
    //2- brute force
    public static void findDuplicate(int arr[])
    {
        System.out.println("Find duplicate element by brute force approach");
        System.out.print("{ ");
        for(int i=0 ; i< arr.length ; i++)
        {
            for(int j = i+1; j< arr.length; j++)
            {
                if (arr[i] == arr[j])
                {
                    System.out.print(arr[i] + " ");

                }
            }
        } System.out.println("}");
        System.out.println("***************************************************");
    }

    //3- HasSet

    public static void findDuplicate1(int []arr)
    {

        System.out.println("Find duplicate element by hashSet approach");
        System.out.print("Duplicate Elements are by Hashset - : { ");
        HashSet<Integer> data = new HashSet<>();
        for(int e : arr)
        {
           if(data.add(e)==false)
           {
               System.out.print(e + " ");
           }
        }
        System.out.println("}");
        System.out.println("***************************************************");
    }

//4     HashMap
    public static void findDuplicate2(int []arr)
    {
        System.out.println("Find duplicate element by hashMap approach");
        System.out.print("Duplicate Elements are by using map and set : { ");

        HashMap<Integer, Integer> map = new HashMap<>();
        for(Integer e : arr)
        {
            if(map.get(e) != null)
            {
                map.put(e, map.get(e)+1);
            }else
            {
                map.put(e, 1);
            }
        }

        Set<Map.Entry<Integer,Integer>> keys = map.entrySet();
        for(Map.Entry<Integer,Integer> set : keys)
        {
            if(set.getValue() >1)
            {
                System.out.print(set.getKey() +" ");
            }
        }



        System.out.println("}");
        System.out.println("***************************************************");
    }


    public static void main(String []args)
    {
      int arr[] ={2,3,5,6,3,2,6,7,5,8};
      findDuplicate(arr);
      findDuplicate1(arr);
      findDuplicate2(arr);
      findDuplicate3(arr);

    }

}
