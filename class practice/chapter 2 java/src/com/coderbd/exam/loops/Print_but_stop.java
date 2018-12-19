
package com.coderbd.exam.loops;


public class Print_but_stop {
   public static void main(String [] args){
    
       int n=20;
       for(int i=1; i<=n; i++){
           if(i==n/2)
               break;
            System.out.println(i);
       
       }
          
   } 
}
