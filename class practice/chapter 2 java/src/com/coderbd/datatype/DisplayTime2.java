
package com.coderbd.datatype;

import java.util.Scanner;


public class DisplayTime2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer for seconds:");
        int days = input.nextInt();
        
        int hours = days/24;
       
        int minutes = hours*60;
       
        System.out.println(days +"Second is" + hours + "minutes and" + minutes+"seconds");
    }
 
}

