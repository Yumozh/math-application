package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        float bobSalary = 25869.94f;
        float garySalary = 234906.28f;
        float highestSalary = 0;

        highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is $" + highestSalary);
    }
}
