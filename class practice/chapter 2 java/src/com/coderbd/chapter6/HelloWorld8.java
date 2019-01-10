
package com.coderbd.chapter6;
 

public class HelloWorld8 {
    
    public static void main(String []args){
            System.out.println(sayHello("Hello" , "World....................."));

        }
    public static String sayHello(String s1, String s2){
    return HelloWorld6.sayHello(s1, s2);
    }
    
    public static String sayHelloo(){
     String msg = HelloWorld6.sayHello("Hello", "World");
     return msg;
    }
}
