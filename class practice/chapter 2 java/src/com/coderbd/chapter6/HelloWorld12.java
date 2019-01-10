
package com.coderbd.chapter6;


public class HelloWorld12 {
    
    public static void main(String[] args) {
        System.out.println(addition(500 , 25));
        System.out.println(substraction(500 , 25));
        System.out.println(multiplication(500 , 25));
        System.out.println(division(500 , 25));
        System.out.println(remainder(500 , 25));
        
        System.out.println(operateAll(500, 25, "+"));
    }
    
    public static int operateAll(int s1, int s2 , String mode){
    
    int rs = 0;
    if(mode == "+"){
    rs=addition(s1 , s2);
    } else if(mode == "-"){
    rs = substraction(s1 , s2);
    } else if(mode == "*"){
    rs = multiplication(s1 , s2);
    }else if(mode == "/"){
    rs = division(s1 , s2);
    }else if(mode == "%"){
    rs = remainder(s1 , s2);
    }
    return rs;
    }
    
    public static int addition(int s1 , int s2){
     int rs= s1 +s2;
     return rs;
    }
    public static int substraction(int s1 , int s2){
     int rs= s1 - s2;
     return rs;
    }
    
    public static int multiplication(int s1 , int s2){
     int rs= s1 * s2;
     return rs;
    }
    public static int division(int s1 , int s2){
     int rs= s1/s2;
     return rs;
    }
    public static int remainder(int s1 , int s2){
     int rs= s1%s2;
     return rs;
    }
}
