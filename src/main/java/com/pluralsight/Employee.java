package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double wage;
    private double shiftWorked;
    private List<Double> shiftTime = new ArrayList<>();
    private double punchTime = 0.0;

    public Employee(int employeeId, String name, String department, double wage, double shiftWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.wage = wage;
        this.shiftWorked = shiftWorked;
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

    public double getShiftWorked() {
        return shiftWorked;
    }
    public double getPayRoll() {
        if (shiftWorked <= 40) {
            return wage * shiftWorked;
        } else {
            double regularWage = wage * 40;
            double overtimeWage = (shiftWorked - 40) * (wage * 1.5);
            return regularWage + overtimeWage;
        }
    }
    public  double getRegularWage() {
        return Math.min(40, shiftWorked) * wage;
    }
    public double getOvertimeWage() {
        double regularWage = Math.min(40, shiftWorked);
        double overtimeWage = Math.max(0, shiftWorked - 40);
        return overtimeWage * (wage * 1.5);
    }

    public void shiftCard(double time) {
        if (punchTime == 0.0) {
            punchTime = time;
        } else {
            shiftWorked += (time - punchTime);
            shiftTime.add(time - punchTime);
            punchTime = time;
        }
    }
    public static void main(String[] args) { // Tester
        Employee employee = new Employee(1, "Lazy Susan", "Food", 16.0, 45);
        employee.shiftCard(45.0);

        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Department: " + employee.getDepartment());
        System.out.println("Total Hours Worked: " + employee.getShiftWorked());
        System.out.println("Regular Pay: $" + employee.getRegularWage());
        System.out.println("Overtime Pay: $" + employee.getOvertimeWage());
        System.out.println("Total Pay: $" + employee.getPayRoll());
    }
}
