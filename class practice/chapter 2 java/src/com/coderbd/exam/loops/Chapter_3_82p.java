
package com.coderbd.exam.loops;

import java.util.Scanner;


public class Chapter_3_82p {
    
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);
        System.out.println("Enter your Score");
        
        int score= input.nextInt();
        
        if(score>= 90.0)
            System.out.println("A");
        else if(score>=80.0)
            System.out.println("B");
        else if(score>=70.0)
            System.out.println("c");
        else if(score>=60.0)
            System.out.println("D");
        else
            System.out.println("F");
    }
}
