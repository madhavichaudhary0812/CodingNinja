package com.Optimisedprogram;

import java.util.Arrays;
public class TestArray{

public static void main(String args[]) {
  int arr[] = { 10, 20, 30, 40, 50 };
  int brr[] = Arrays.copyOfRange(arr, 3, 5);

   for (int i : brr) {
    System.out.println(i);
    }

  }
}
