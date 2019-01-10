
package com.coderbd;

import java.util.Scanner;


public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SentinelValue.workWithSentinelValue(sc);
        System.out.println(WhileLoop.makeSum(1, 10)); 
        WhileLoop.printNum1ToNum2(1, 10);
        
        WhileLoop.findOutGcd(16, 24);
    }
}
