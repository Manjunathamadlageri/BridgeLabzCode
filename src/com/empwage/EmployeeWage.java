package com.empwage;

public class EmployeeWage
{
    public static void main(String[] args) {
        final int IS_FULL_TIME = 1;
        final int IS_PART_TIME = 2;
        final int EMP_RATE_PER_HOUR = 125;
        int empHours = 0;
        int empWage = 0;
        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == IS_FULL_TIME) {
            System.out.println("Employee is present" + empCheck);
            empHours = 8;
        } else if (empCheck == IS_PART_TIME) {
            System.out.println("EMployee in Part time");
            empHours = 4;
        } else {
            System.out.println("Absent");
        }
        empWage = empHours * EMP_RATE_PER_HOUR;
        System.out.println("Total Emp Wage " + empWage);
    }
}
