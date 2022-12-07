package com.Optimisedprogram;

import java.util.HashMap;

public class StoreEmployee {
    public static void main(String[] args)
    {
        HashMap<Integer, EmployeeDetails> Emp = new HashMap<>();

        EmployeeDetails empDetails1 = new EmployeeDetails();
        empDetails1.setEmp_Name("Madhavi");
        empDetails1.setEmp_Age(33);
        empDetails1.setEmp_Country("IND");
        empDetails1.setEmp_ID(12);

        EmployeeDetails empDetails2 = new EmployeeDetails();
        empDetails2.setEmp_Name("Ankur");
        empDetails2.setEmp_Age(31);
        empDetails2.setEmp_Country("US");
        empDetails2.setEmp_ID(11);

        EmployeeDetails empDetails3 = new EmployeeDetails();
        empDetails3.setEmp_Name("John");
        empDetails3.setEmp_Age(30);
        empDetails3.setEmp_Country("Spain");
        empDetails3.setEmp_ID(10);

        Emp.put(empDetails1.getEmp_ID(),empDetails1);
        Emp.put(empDetails2.getEmp_ID(),empDetails2);
        Emp.put(empDetails3.getEmp_ID(),empDetails3);

        Emp.forEach((i, k) -> System.out.println(k));


    }


}


