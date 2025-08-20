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
public class Problem9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input number of rows : ");
        int numOfRows = sc.nextInt();

        for (int i = 1; i <= numOfRows; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(j);
            }
            System.out.println();
        }
    }
}
