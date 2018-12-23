
package com.coderbd.chapter4;


public class CommonMathFunction {
    public static void main(String[] args){
    
    double x = Math.sqrt(25);
        System.out.println("25 is" + x);
        System.out.println(Math.pow(5, 5));
        System.out.println(Math.ceil(25.1234));
        System.out.println(Math.floor(25.1234));
        System.out.println(Math.rint(25.1234)); //rint returns 25 if it don't cross .5
        System.out.println(Math.rint(25.5234)); // rint increases if it cross .5
        System.out.println(Math.round(25.1234));
        System.out.println(Math.round(25.500));
        
    
    }
}
