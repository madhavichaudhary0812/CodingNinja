package com.test;

abstract class Coffee
{
   Coffee () {
       System.out.println("Inside Constructor of Coffee..");
   }

    Coffee (String s) {
        System.out.println("Inside parameterised Constructor of Coffee..");
    }
   public void foo()
   {
       System.out.println("non static method");
   }
}

class ColdCoffee extends Coffee {
    ColdCoffee() {
        System.out.println("Inside Constructor of ColdCoffee..");
    }

    ColdCoffee(String s)
    {
        //super(s);
        System.out.println("Inside parameterised Constructor of ColdCoffee..");
    }
}
public class AbstractClassTesting
{
    public static void main(String[] args) {
        String str = "Radha";
        ColdCoffee cf = new ColdCoffee();
        ColdCoffee cf1 = new ColdCoffee(str);

    }       }