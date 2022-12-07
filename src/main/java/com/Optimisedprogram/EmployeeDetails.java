package com.Optimisedprogram;

public class EmployeeDetails {

    private int emp_ID;
    private String emp_Name;
    private String emp_Country;
    private int emp_Age;

    public int getEmp_ID() {
        return emp_ID;
    }

    public void setEmp_ID(int emp_ID) {
        this.emp_ID = emp_ID;
    }

    public String getEmp_Name() {
        return emp_Name;
    }

    public void setEmp_Name(String emp_Name) {
        this.emp_Name = emp_Name;
    }

    public String getEmp_Country() {
        return emp_Country;
    }

    public void setEmp_Country(String emp_Country) {
        this.emp_Country = emp_Country;
    }

    public int getEmp_Age() {
        return emp_Age;
    }

    public void setEmp_Age(int emp_Age) {
        this.emp_Age = emp_Age;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "EmployeeName='" + emp_Name + '\'' +
                ", EmployeeID='" + emp_ID + '\'' +
                ", EmployeeCountry='" + emp_Country + '\'' +
                ", EmployeeAge='" + emp_Age + '\'' +
                '}';
    }


        /*public String getEmployeeName() {
            return emp_Name;
        }

        public void setEmployeeName(String emp_Name) {
            this.emp_Name = emp_Name;
        }

        public int getEmployeeID() {
            return emp_ID;
        }

        public void setEmployeeID(int emp_ID) {
            this.emp_ID = emp_ID;
        }

        public int getEmployeeAge() {
            return emp_Age;
        }

        public void setEmployeeAge(int emp_Age) {
            this.emp_Age = emp_Age;
        }

        public String getEmployeeCountry() {
            return emp_Country;
        }

        public void setEmployeeCountry(String emp_Country) {
            this.emp_Country = emp_Country;
        }*/

}
