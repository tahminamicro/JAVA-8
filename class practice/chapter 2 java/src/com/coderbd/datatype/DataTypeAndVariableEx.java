/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.datatype;

/**
 *
 * @author User
 */
public class DataTypeAndVariableEx {

    static byte byteVar = 127; //8 bits
    static short shortVar = 32767; //16bits
    static int intVar = 2147483647; //32 bits
    static long longVar = 2147483647L; //64bits
    static float floatVar = 214748367.0F; //32bits
    static double doubleVar = 214748367.0; //64bits
    static char charVar = 'A';
    static boolean booleanVar = true;

    static String name;

    public static void main(String[] args) {

        System.out.println("byteVar:" + byteVar);
        System.out.println("byteVar:" + shortVar);
        System.out.println("byteVar:" + intVar);
        System.out.println("byteVar:" + longVar);
        System.out.println("byteVar:" + floatVar);
        System.out.println("byteVar:" + doubleVar);
        System.out.println("byteVar:" + charVar);
        System.out.println("byteVar:" + booleanVar);
        System.out.println("Name:" + name);

        int num = 10;
        num++;
        num--;
        num += 50;
        --num;
        num -= 10;
        System.out.println("Nume:" + num);
    }

}
