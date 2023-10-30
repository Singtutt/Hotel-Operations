package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double wage;
    private double shiftTime;

    public Employee(int employeeId,String name, String department, double wage, double shiftTime) {
        this.employeeId = employeeId;
        this.name =name;
        this.department = department;
        this.wage = wage;
        this.shiftTime = shiftTime;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getWage() {
        return wage;
    }

    public double getShiftTime() {
        return shiftTime;
    }
    public double getPayRoll() {
        if (shiftTime <= 40) {
            return wage * shiftTime;
        } else {
            double regularWage = wage * 40;
            double overtimeWage = (shiftTime - 40) * (wage * 1.5);
            return regularWage + overtimeWage;
        }
    }
    public  double getRegularWage() {
        return Math.min(40, shiftTime);
    }
    public double getOvertimeWage() {
        return Math.max(0, shiftTime - 40);
    }
}
