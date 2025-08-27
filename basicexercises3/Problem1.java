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
public class Problem1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a degree in Fahrenhiet: ");
        double fahrenhiet = sc.nextDouble();

        double celsuis = (fahrenhiet - 32) * 5 / 9;

        System.out.print(fahrenhiet + " degree is equal to " + celsuis + " in celsuis");

    }
}
