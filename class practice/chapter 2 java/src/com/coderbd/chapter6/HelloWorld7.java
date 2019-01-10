
package com.coderbd.chapter6;
 

public class HelloWorld7 {
    
    public static void main(String []args){
            System.out.println(sayHello());
            System.out.println(sayHelloo());
        }
    public static String sayHello(){
    return HelloWorld6.sayHello("Hello", "World");
    }
    
    public static String sayHelloo(){
     String msg = HelloWorld6.sayHello("Hello", "World");
     return msg;
    }
}
