
package com.coderbd;

import java.util.Scanner;


public class Chapter_5_2 {
    public static void main(String [] args){
    int number1 = (int)(Math.random() * 10);
    int number2 = (int)(Math.random() * 10);
    
    Scanner input = new Scanner(System.in);
        System.out.println("What is" + number1 + "+" + number2 +"?");
        int answer = input.nextInt();
        
        while(number1 + number2 != answer){
            System.out.println("Wrong Answer. try again What is" + number1 + "+" + number2+"?");
            answer = input.nextInt();
        }
        System.out.println("You got it");
    }
}
