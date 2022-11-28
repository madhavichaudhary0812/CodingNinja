package com.Optimisedprogram;

import java.io.BufferedReader;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class PatientTest {
    public static void main(String[] args) {
        HashMap<String, Patient> patientDataMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        while (true) {
            System.out.println("Do You want to add more patient?\nPress 0 for No or Press any other number to continue adding Patients");
            int choice = sc.nextInt();
            if (choice == 0)
                break;
            System.out.print("Enter PatientName:\t");
            String name = sc.next();
            if (patientDataMap.keySet().contains(name)) {
                throw new IllegalArgumentException("PatientAlreadyExists");
            } else {
                Patient p = new Patient();
                p.setPatientName(name);
                p.setPatientID(random.nextInt(10000));
                p.setPatientDecease("testDesease");
                patientDataMap.put(name, p);
                System.out.println("\nPatient Added Successfully");
                System.out.println("\n***********************\n\n");
            }

        }
        patientDataMap.forEach((i, k) -> System.out.println(k));
    }
}
