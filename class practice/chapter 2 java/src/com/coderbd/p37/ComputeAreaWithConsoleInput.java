/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.p37;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ComputeAreaWithConsoleInput {
    
    static int num1, num2,num3, result;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for num1: ");
        num1 =sc.nextInt();
        System.out.println("Enter Number for num2: ");
        num2 = sc.nextInt();
        
        System.out.println("Enter Number for num2: ");
        num3 = sc.nextInt();
        result = num1 + num2 -num3;
        System.out.println("Result:" + result);
    }
}
