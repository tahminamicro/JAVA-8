
package com.coder.bd;

import java.util.Scanner;


public class ComputeChange {
 public static void main(String[] args){
 Scanner input= new Scanner(System.in);
 
     System.out.println("Enter an amount in double for example 11.56:");
     double amount = input.nextDouble();
     
     int remainingAmount = (int)(amount* 100);
     int numberOfOneDollars = remainingAmount / 100;
     
         
 } 
}
