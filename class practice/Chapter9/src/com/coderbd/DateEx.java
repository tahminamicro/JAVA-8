
package com.coderbd;

import java.util.Date;


public class DateEx {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(new java.util.Date());
        
        Date date = new Date();
        System.out.println("Time in ms:" + date.getTime());
        System.out.println("Date of Today:" +date.getDate());
        System.out.println("Date of Today:" +date.getDate());
        
    }
}
