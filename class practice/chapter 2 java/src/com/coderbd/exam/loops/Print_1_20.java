
package com.coderbd.exam.loops;

//print 1 to 20 except 5,10,15;
public class Print_1_20 {
    public static void main(String [] args){
     for(int i=1; i<=20; i++){
         if(i%5!=0) {
             System.out.println(i);
         }
     }
         
    }
}
