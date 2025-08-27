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
public class problem2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a value for inches: ");
        double inches = sc.nextDouble();
        double meters = inches * 0.0254;

        System.out.println(inches + " inches is " + meters + " meters ");

    }
}
