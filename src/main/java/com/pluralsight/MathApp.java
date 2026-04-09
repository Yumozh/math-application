package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        double bobSalary = 258699.94f;
        double garySalary = 234906.28f;
        double highestSalary;

        highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is $" + highestSalary);

        double carPrice = 35000.94;
        double truckPrice = 123090.00;
        double smallestPrice;

        smallestPrice = Math.min(truckPrice, carPrice);
        System.out.println("The smallest price is $" + smallestPrice);

        double radius = 7.25;
        double circleArea = 3.14 * (7.25 * 7.25);

        System.out.printf("Area of a circle equals to %.2f%n",circleArea);

        double myNumber = 5.0;
        double result = Math.sqrt(myNumber);

        System.out.printf("The square root of %.1f is %.2f%n" ,myNumber, result);

        int pointFirst = 5;
        int pointSecond = 10;

        int pointThird = 85;
        int pointFourth = 50;

        int distanceFirstAndSecond = Math.max(pointFirst,pointSecond) - Math.min(pointFirst,pointSecond);
        int distanceThirdAndFourth = Math.max(pointThird,pointFourth) - Math.min(pointThird,pointFourth);

        System.out.println("Distance between first two point is: " + distanceFirstAndSecond );
        System.out.println("Distance between second two point is: " + distanceThirdAndFourth );

        double givingNumber = -3.8;

        double absoluteValue = Math.abs(givingNumber);
        System.out.println("The absolute value is: " + absoluteValue);

        int randomNumber = (int)(Math.random() * 1);
        System.out.println("My random number is: " + randomNumber);

        int days = 24;

        int minutesInDays = 24 * 60;
        int millisecondsInDays = minutesInDays * (60 * 1000);

        System.out.println("There are " + minutesInDays + " minutes in " + days + " days.");
        System.out.println("And " + millisecondsInDays + " milliseconds in " + days + " days." );
    }
}
