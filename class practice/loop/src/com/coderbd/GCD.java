/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd;

/**
 *
 * @author User
 */
public class GCD {
     public static void main(String[] args) {
         System.out.println(findOutGcd(32 , 24));
    }
     
     public static int findOutGcd(int n1,int n2){
        int gcd =1;
        int possibleGcd =2;
        while(possibleGcd <= n1 && possibleGcd <=n2){
        if(n1% possibleGcd ==0 && n2%possibleGcd ==0){
        gcd = possibleGcd;
        
        }
        possibleGcd++;
        }
         
         
         return gcd;
     }
}
