/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicexercisespart1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Problem9 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          
           System.out.print("Input first number: ");
        int firstNum = sc.nextInt();

        System.out.print("Input second number: ");
        int secondNum = sc.nextInt ();
        
        System.out.print("Input third number: ");
        int thirdNum = sc.nextInt();
        
        System.out.println((firstNum + secondNum + thirdNum) / 3);
 
    }
    
}
