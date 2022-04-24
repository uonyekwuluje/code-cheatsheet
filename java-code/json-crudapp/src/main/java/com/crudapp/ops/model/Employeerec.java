package com.crudapp.ops.model;

public class Employeerec {
    private String employeeID;
    private String employeeFirstName;
    private String employeeLastName;
    private int employeeAge;

    public Employeerec(String employeeID, String employeeFirstName, String employeeLastName, int employeeAge) {
       this.employeeID = employeeID;
       this.employeeFirstName = employeeFirstName;
       this.employeeLastName = employeeLastName;
       this.employeeAge = employeeAge;
    }

    public String getEmployeeID() {
        return employeeID;
    }
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;  
    }

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }
    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }
    public void setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
    }

    public String getEmployeeAge() {
        return employeeAge;
    }
    public void setEmployeeAge(String employeeAge) {
        this.employeeAge = employeeAge;
    }

    // Creating String Record
    @Override
    public String toString() {
        return "[employeeid="
            + employeeID
            + ", employeefirstname="
            + employeeFirstName
            + ", employeelastname="
            + employeeLastName
            + ", employeeage="
            + employeeAge + "]"; 
    }

}
