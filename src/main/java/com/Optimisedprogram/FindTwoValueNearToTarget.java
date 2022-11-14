package com.Optimisedprogram;

import java.util.Arrays;

public class FindTwoValueNearToTarget {

    /*
  /*Arr[] ={12,5,6,2,13,11,10,4} x = 25
{2,4,5,6,10,11,12,13}
num1=0,num2=0, diff=Interger.MaxValue(), i=0,j=arr.length-1
while(i<j){
currentdiff=Abs(Arr[i]+arr[j]- x)
if(currentdiff<diff){
diff=currentDiff;
num1=arr[i];
num2=[arr[j]

}
if(Arr[i]+arr[j]<x)
I++;
Else
j--

}  */

    public static void numberValue(int[] arr, int target) {
        Arrays.sort(arr);
        int num1 = Integer.MIN_VALUE;
        int num2 = Integer.MIN_VALUE;
        int diff = Integer.MAX_VALUE;
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int currentDiff = Math.abs(arr[i] + arr[j] - target);
            if (currentDiff < diff) {
                diff = currentDiff;
                num1 = arr[i];
                num2 = arr[j];
            }

            if (arr[i] + arr[j] < target) {
                i++;
            } else {
                j--;
            }
        }


        System.out.println("Two value which sum are most closet to target is---> " + num1 + " and " + num2 + " and sum of these " +
                "values is " + (num1 + num2));

    }

    public static void main(String[] args) {
        int numberArr[] = {12, 5, 6, 2, 14, 9, 10, 4};
        //    2, 4,5,6,10,11,12,13
        int x = 25;

        numberValue(numberArr, x);
    }
}
