
package com.coderbd;


public class AccessModifier {
    private int privateVar = 5000;
    int defaultVar=1000;
    protected int protectedVar = 500;
    public int publicvar = 100;
    
    public static void main(String[] args) {
        AccessModifier obj = new AccessModifier();
        System.out.println(obj.privateVar);
         System.out.println(obj.defaultVar);
          System.out.println(obj.protectedVar);
           System.out.println(obj.publicvar);
    }
}
