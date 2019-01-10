
package com.coderbd;


public class PrintRangeNumber {
    public static void main(String[] args) {
        printRangenumber(1 ,10);
    }
    
    public static void printRangenumber(int n1, int n2){
        do{
            System.out.println(n1);
            n1++;
        }while (n1<= n2);
    }
}
