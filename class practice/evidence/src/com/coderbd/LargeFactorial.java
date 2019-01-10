
package com.coderbd;

import java.math.*;


public class LargeFactorial {
    public static void main(String[] args) {
        System.out.println("5! is " + factorial(5));
    }
    
    public static BigInteger factorial(long n){
     BigInteger rs = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            rs =rs.multiply(new BigInteger(i+ ""));
        }
    return rs;
    }
}
