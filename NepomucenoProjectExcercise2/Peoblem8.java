/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NepomucenoProjectExcercise2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Peoblem8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input number of terms: ");
        int numOfTerms = sc.nextInt();

        for (int i = 1; i <= numOfTerms; i++) {
            System.out.println(" Number is: " + i + " and cube of " + i + " is : " + (i * i * i));

        }
    }
}
