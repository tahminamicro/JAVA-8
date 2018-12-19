
package com.coderbd.datatype;

import java.util.Scanner;


public class DisplayTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer for seconds:");
        int seconds = input.nextInt();
        
        int minutes = seconds/60;
        int remainingSeconds = seconds % 60;
        int hours = minutes/60;
        int days = hours*24;
        System.out.println(seconds +"Second is" + minutes + "minutes and" + remainingSeconds + "seconds"+ hours+"hours"+days+"days");
    }
 
}
