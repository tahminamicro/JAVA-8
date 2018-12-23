
package com.coderbd.chapter4;


public class FormatdemoJava {
    public static void main(String [] args){
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Degrees", "Radians", "Sine", " cosine", "Tangent");
        
        int Degrees =30;
        double radians = Math.toRadians(Degrees);
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n","Degrees", "Radians", "Sine", " cosine", "Tangent");
    }
}
