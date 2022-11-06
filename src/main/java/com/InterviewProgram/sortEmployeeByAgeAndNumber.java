package com.InterviewProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class sortEmployeeByAgeAndNumber {
    public static void main(String []args)
    {
        ArrayList<Employee1> al = new ArrayList<>();
        al.add(new Employee1(2,"Vijay", 6));
        al.add(new Employee1(1,"Raghu", 7));
        al.add(new Employee1(3,"Maddy", 8));
        al.add(new Employee1(5,"Niku", 6));
        al.add(new Employee1(4,"Vijay", 5));

        System.out.println("Employee sorting by name");
        Collections.sort(al, new nameComparator1());
        for(Employee1 el : al)
        {
            System.out.println("{" + el.empId + " " + el.name + " " + el.age + "}");
        }

        System.out.println("***************************************************************************************");
        System.out.println("Employee sorting by Age");
        Collections.sort(al, new AgeComparator1());
        for(Employee1 el : al)
        {
            System.out.println("{" + el.empId + " " + el.name + " " + el.age + "}");
        }

}
}

class Employee1
{
   int empId;
   String name;
   int age;

   Employee1(int empId, String name, int age)
   {
       this.empId = empId;
       this.name = name;
       this.age = age;
   }
}

class AgeComparator1 implements Comparator<Employee1>
{
    public int compare(Employee1 e1 , Employee1 e2)
    {
        if(e1.age == e2.age)
        {
            return 0;
        }else if(e1.age > e2.age)
        {
            return 1;
        }else
        {
            return -1;
        }
    }
}

class nameComparator1 implements Comparator<Employee1>
{
    public int compare(Employee1 e1, Employee1 e2)
    {
        return e1.name.compareTo(e2.name);
    }


}