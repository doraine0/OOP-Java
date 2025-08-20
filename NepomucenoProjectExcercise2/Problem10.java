/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Problem10 {

    /**
     *
     */
    public class Problem10 {

        public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

            System.out.print("Input the number: ");
            int num = sc.nextInt();

            for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= num; j++) {

                System.out.println(" ");
            }
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
               
                    
                }
            System.out.println();
        }
    }
}
}