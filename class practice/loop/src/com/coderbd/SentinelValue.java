
package com.coderbd;

import java.util.Scanner;


public class SentinelValue {
    public static void workWithSentinelValue(Scanner sc){
     int sum=0;
      int n1=0;
      while(true){
      System.out.println("Enter Number:" + n1 +"Time");
      int num1 = sc.nextInt();
      if(num1 != -1){
      sum+=num1;
          System.out.println("Sum:" + sum);
      n1++;
      }else{
      break;
      }
        }
    }
}
