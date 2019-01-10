
package com.coderbd;

public class WhileLoop {
    
    public static void printNum1ToNum2(int num1, int num2){
    while(num1<=num2){
        System.out.println(num1);
        num1++;
    }
    }
    
     public static int makeSum(int num1, int num2) {
        int sum = 0;
        while (num1 <= num2) {
            sum += num1;
            num1++;
        }
        return sum;
     }
    //greatest common divisior
     public static void main(String[] args) {
        findOutGcd(16 , 24);
    }
     
     public static int findOutGcd(int n1,int n2){
        int gcd =1;
        int possibleGcd =2;
        while(possibleGcd <= n1 && possibleGcd <=n2){
        if(n1% possibleGcd ==0 && n2%possibleGcd ==0){
        gcd = possibleGcd;
        possibleGcd++;
        }
        }
         
         
         return gcd;
     }
    
}
