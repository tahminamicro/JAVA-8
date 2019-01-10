
package com.coderbd;

import java.util.Arrays;


public class TwoDArray {
    public static void main(String[] args) {
        
   
    int [][] twoDArray= {
        {5, 6, 7},
        {7, 9, 6},
        {11, 14, 15}
    };
    
    for(int [] oneD : twoDArray){
        Arrays.sort(oneD);
    for(int i: oneD){
        System.out.print(i +", ");
    }
        System.out.println();
    }
     }
}
