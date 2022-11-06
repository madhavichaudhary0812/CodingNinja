package com.InterviewProgram;

import java.io.*;
import java.lang.*;
import java.util.ArrayList;
import java.util.Collections;


public class sortEmployeeAtAge {
    //Employee <String, Integer> = Employee<Name, Age>;
    //input - {vikas,12}, {abc,11}, {xyz,6}
    //output - xyz, abc, vikas


    public static void main(String []args)
    {
        ArrayList<Employee> emp = new ArrayList<Employee>();
        emp.add(new Employee("Vijay", 22));
        emp.add(new Employee("Ragu", 7));
        emp.add(new Employee("Arun", 34));
        emp.add(new Employee("Sanjay", 12));
        emp.add(new Employee("Bindu", 26));

       Collections.sort(emp);
        for(Employee elp : emp)
        {
            System.out.println(elp.name + "-" + elp.age);
        }

    }
}

class Employee implements Comparable<Employee>
{
   String name;
   int age;

   Employee(String name, int age)
   {
       this.name = name;
       this.age = age;
   }

   public int compareTo(Employee el)
   {
       if(age == el.age)
       {
           return 0;
       }else if(age > el.age)
       {
           return 1;
       }else
       {
           return -1;
       }
   }
}
