/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicexercises3;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class problem5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input distance in meter: ");
        double distanceMeters = sc.nextDouble();

        System.out.print("Input hour: ");
        int hour = sc.nextInt();
        System.out.print("Input minutes: ");
        int minutes = sc.nextInt();
        System.out.print("Input seconds: ");
        int seconds = sc.nextInt();

        int totalSeconds = (hour * 3600) + (minutes * 60) + seconds;

        double speedMeterPerSeconds = distanceMeters / totalSeconds;
        double speedKilometersPerHour = (distanceMeters / 1000.0) / (totalSeconds / 3600.0);
        double speedMilesPerHour = (distanceMeters / 1609.0) / (totalSeconds / 3600.0);

        System.out.println("Speed in meters/seconds: " + speedMeterPerSeconds);
        System.out.println("Speed in kilometers/hour: " + speedKilometersPerHour);
        System.out.println("Speed in miles/hour: " + speedMilesPerHour);

    }
}
