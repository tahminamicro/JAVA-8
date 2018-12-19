
package com.coder.bd;


public class TypeConversion {
   public static void main(String [] args){
   byte byteVar =127;
   short shortVar= byteVar;
   
   long x =10;
   int y =15;
   int rs = (int)x + y;
       System.out.println("RS:" +rs);
       
   long result = x + y;
       System.out.println("Result:" + result);
   
   } 
}
