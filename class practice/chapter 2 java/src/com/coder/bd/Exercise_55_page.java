
package com.coder.bd;


public class Exercise_55_page {
    public static void main(String [] args){
    int i =10;
    int a =20;
    int b = a++;
    int newNum =10 * ++i;
        System.out.println("i is"+ i + "newNum is " + newNum);
        System.out.println(a);
        System.out.println(b);
        
      b= ++a;
      System.out.println(b);
      
      
    }
}
