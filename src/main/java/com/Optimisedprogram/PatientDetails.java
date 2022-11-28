package com.Optimisedprogram;

import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class PatientDetails {
/*Write a program to enter the patient details (Name, PId, Disease) and fetch the record according to the name.
Condition: If found duplicate patent then should give error else should return patents details.
*
*
* */

    public static void main(String[] args) {

        LinkedHashMap<String, List<Patient>> map = new LinkedHashMap<>();

/*        if(map.containsKey(""))
        {


        }*/

        List<Patient> patient_details = new ArrayList<Patient>();
        patient_details.add(new Patient("Ram", 12, "Heart-Attack"));
        patient_details.add(new Patient("Mohan", 1, "Cluster-Headache"));
        patient_details.add(new Patient("Vidut", 2, "Sugar"));
        patient_details.add(new Patient("Gaurav", 10, "Sinus"));
        patient_details.add(new Patient("Seeta", 11, "Broken Leg"));
        patient_details.add(new Patient("Reeta", 9, "Anxiety"));
        patient_details.add(new Patient("Girdhari", 5, "Heart-Attack"));



    }
}


class Patient
{
    String Name;
    int PId;
    String Disease;
    public Patient(String Name, int PID, String Disease)
    {
        this.Name = Name;
        this.PId = PID;
        this.Disease = Disease;
    }

}
