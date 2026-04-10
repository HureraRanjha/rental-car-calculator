package com.pluralsight;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the pickup date (mm-dd-yyyy): ");
        String pickupDate = scanner.nextLine();

        System.out.println("Number of days for the rental");
        int daysForRental = Integer.parseInt(scanner.nextLine());

        System.out.println("Do you want an electronic toll tag at $3.95/day (true/false): ");
        boolean electronicTollTag = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("Do you want a GPS at $2.95/day (true/false): ");
        boolean wantGPS = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("Do you want roadside assistance at $3.95/day (true/false): ");
        boolean wantRoadsideAssistance = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("Current Age: ");
        int currentAge = Integer.parseInt(scanner.nextLine());

        double basicCarRental = 29.99;
        if (currentAge < 25) basicCarRental *= 1.3;

        if (electronicTollTag) basicCarRental += 3.95;
        if (wantGPS) basicCarRental += 2.95;
        if (wantRoadsideAssistance) basicCarRental += 3.95;

        double totalCost = basicCarRental * daysForRental;
        System.out.printf("The The total cost %.2f", totalCost);

    }

}
