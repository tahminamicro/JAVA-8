
package com.coderbd.chapter6;


public class HelloWorld9 {
    
    public static void main(String[] args) {
        sayHello();
        System.out.println(sayHello("Hiiiiiiiiiiii"));
        System.out.println(sayHello("Hello" , "World"));
        System.out.println(sayHello("hello" , 1));
        System.out.println(sayHello(1 , 5));
    }
    public static void sayHello(){
        System.out.println(" Hello world...................................");
    }
  public static String sayHello(String s1){
      return s1;
  }
  
   public static String sayHello(String s1, String s2){
      return s1+s2;
   }
   public static String sayHello(String s1, int n1){
      return s1+n1;
   }
    public static int sayHello(int n2, int n1){
     return n1+n2;
   }
   
    }

