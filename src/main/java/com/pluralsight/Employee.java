package com.pluralsight;
import java.time.LocalDateTime;

public class Employee {
    private int employeeId;
    private String name, department;
    private double payRate, hoursWorked, pastPunchTime;

    public Employee(int employeeId, String name, String department, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = 0.0;
        this.pastPunchTime = 0.0;
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

    public double getPayRate() {
        return payRate;
    }

    public double getTotalPay() {
        if (hoursWorked <= 40) {
            return payRate * hoursWorked;
        } else {
            double regularPayRate = payRate * 40;
            double overtimePayRate = (hoursWorked - 40) * (payRate * 1.5);
            return regularPayRate + overtimePayRate;
        }
    }

    public double getRegularHours() {
        return Math.min(hoursWorked, 40);
    }

    public double getOvertimeHours() {
        return Math.min(hoursWorked - 40, 0);
    }

    public double getTime() {
        double hour = LocalDateTime.now().getHour();
        double minute = (double) LocalDateTime.now().getMinute() / 60;
        return  hour + minute;
    }

    public void punchTimeCard(double time) {
        double currentTime = getTime();
        if (pastPunchTime == 0.0) {
            pastPunchTime = currentTime;
        } else {
            hoursWorked += (currentTime - pastPunchTime);
            pastPunchTime = currentTime;
        }
    }

    public void punchIn(double time) {
        pastPunchTime = time;
    }

    public void punchOut(double time) {
        double currentTime = getTime();
        if (pastPunchTime != 0.0) {
            hoursWorked += (currentTime - pastPunchTime);
            pastPunchTime = currentTime;
        }
    }

    public double getHoursWorked() {
        double currentTime = getTime();
        if (pastPunchTime != 0.0) {
            hoursWorked += (currentTime - pastPunchTime);
        }
        return hoursWorked;
    }
}
//    public static void main(String[] args) { // Tester
//        Employee employee = new Employee(1, "Lazy Susan", "Food", 16.0, 45);
//        employee.shiftCard(45.0);
//
//        System.out.println("Employee ID: " + employee.getEmployeeId());
//        System.out.println("Employee Name: " + employee.getName());
//        System.out.println("Department: " + employee.getDepartment());
//        System.out.println("Total Hours Worked: " + employee.getShiftWorked());
//        System.out.println("Regular Pay: $" + employee.getRegularWage());
//        System.out.println("Overtime Pay: $" + employee.getOvertimeWage());
//        System.out.println("Total Pay: $" + employee.getPayRoll());
//    }