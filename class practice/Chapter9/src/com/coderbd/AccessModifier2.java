
package com.coderbd;


public class AccessModifier2 {
   
    private int privateVar = 5000;
    int defaultVar=1000;
    protected int protectedVar = 500;
    public int publicvar = 100;
    
    public static void main(String[] args) {
        AccessModifier2 obj = new AccessModifier2();
        System.out.println(obj.privateVar);
         System.out.println(obj.defaultVar);
          System.out.println(obj.protectedVar);
           System.out.println(obj.publicvar);
    }

}
