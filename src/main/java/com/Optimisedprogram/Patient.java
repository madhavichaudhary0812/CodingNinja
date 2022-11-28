package com.Optimisedprogram;

public class Patient {
    private String patientName;
    private int patientID;
    private String patientDecease;

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        if (this.patientName != null)
            throw new IllegalArgumentException("PatientAlreadyExists");
        this.patientName = patientName;
    }

    public int getPatientID() {
        return patientID;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientName='" + patientName + '\'' +
                ", patientID='" + patientID + '\'' +
                ", patientDecease='" + patientDecease + '\'' +
                '}';
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getPatientDecease() {
        return patientDecease;
    }

    public void setPatientDecease(String patientDecease) {
        this.patientDecease = patientDecease;
    }


}

