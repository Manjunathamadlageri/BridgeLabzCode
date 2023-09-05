package com.employeeWage;

import java.util.Random;

public class EmployeeWageUsingConditionalStatements
{
    public static void main(String[] args) {
        int fullDayHours = 8;
        int partTimeHours = 4;
        int wagePerHour = 125;
        int workingDays = 28;
        int maxWorkingHours = 100;

        int totalWorkingHours = 0;
        int totalWage = 0;
        int totalDays = 0;

        while (totalDays < workingDays && totalWorkingHours < maxWorkingHours) {
            int empCheck = getRandomNumberInRange(0, 2);

            if (empCheck == 0) {
                System.out.println("Employee is absent");
            }

            if (empCheck == 1) {
                int fullDayWage = calculateDailyWage(fullDayHours, wagePerHour);
                totalWage += fullDayWage;
                totalWorkingHours += fullDayHours;
            }

            if (empCheck == 2) {
                int partTimeWage = calculateDailyWage(partTimeHours, wagePerHour);
                totalWage += partTimeWage;
                totalWorkingHours += partTimeHours;
            }

            totalDays++;
        }

        System.out.println("Total working hours: " + totalWorkingHours);
        System.out.println("Total wage: " + totalWage);
    }

    static int getRandomNumberInRange(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

    static int calculateDailyWage(int hoursWorked, int wagePerHour) {
        return hoursWorked * wagePerHour;
    }

}
