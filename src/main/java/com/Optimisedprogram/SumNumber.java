package com.Optimisedprogram;

public class SumNumber {

    public static void sum(int num) {
        int rem = 0;
        while (num != 0 || rem > 9) {
            if (num == 0) {
                num = rem;
                rem = 0;

            }
            rem = rem + num % 10;
            num = num / 10;

        }

        System.out.println(rem);
    }


    public static void main(String[] args) {
        int num = 1235;
        sum(num);


    }
}
