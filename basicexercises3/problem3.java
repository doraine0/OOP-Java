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
public class problem3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the number of number: ");
        int minutes = sc.nextInt();

        int minutesInYear = 60 * 24 * 365;
        int year = minutes / minutesInYear;
        int days = (minutes % minutesInYear) / (60 * 24);
        System.out.println(minutes + " minutes is approoximitely " + year + " year and " + days + " days ");

    }
}
