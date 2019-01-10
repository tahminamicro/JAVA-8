
package com.coderbd.chapter6;


public class HelloWorld11 {
    public static String sayHi(String s1, String s2){
    String msg = s1+s2;
    return msg;
    }
    public static String sayHi(int s1, int s2){
    String msg = String.valueOf(s1)+ String.valueOf(s2);
    return msg;
    }
    
     public static long sayHi(long s1, long s2){
    long rs = s1 + s2;
    return rs;
    }
    
}
