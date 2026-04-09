package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        double bobSalary = 258699.94f;
        double garySalary = 234906.28f;
        double highestSalary = 0;

        highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is $" + highestSalary);

        double carPrice = 35000.94;
        double truckPrice = 123090.00;
        double smallestPrice = 0;

        smallestPrice = Math.min(truckPrice, carPrice);
        System.out.print("The smallest price is $" + smallestPrice);



    }
}
