package com.practice2024;

import java.util.Arrays;

public class AddOneInArrayNumber {

    public static int[] addOneInArray(int [] num)
    {
        int res[] = new int[num.length + 1];

        int i = num.length-1;

        while (i>=0)
        {
            if(num[i]!=9) {
                num[i] = num[i]+1;
/*                Arrays.stream(num).asLongStream().forEach(e -> System.out.print(e + " "));
                System.out.println("");
                System.out.println(" ------------------------- ");*/
                return num;
            }

            num[i] = 0;
            i--;
        }

        res[0]=1;
        System.out.println(Arrays.toString(res));
        return res;

/*        Arrays.stream(res).asLongStream().forEach(e -> System.out.print(e + " "));
        System.out.println("");
        System.out.println(" ------------------------- ");*/
    }


    public static void main (String []args)
    {
        System.out.println("Add digit one in array number and store in another array with updated value after adding one.");
        int []arr = {2,5,4};
        int []arr1 = {9,9,9};
        int []arr2 = {0,0,-1};
        int []arr3 = {-1};


        System.out.println("Result of given Array  -----> "+Arrays.toString(addOneInArray(arr)));
        System.out.println("Result of arr1 -----> "+Arrays.toString(addOneInArray(arr1)));
        System.out.println("Result of arr2  -----> "+Arrays.toString(addOneInArray(arr2)));
        System.out.println("Result of arr3  -----> "+Arrays.toString(addOneInArray(arr3)));

/*        addOneInArray(arr);
        addOneInArray(arr1);
        addOneInArray(arr2);
        addOneInArray(arr3);*/


    }
}
