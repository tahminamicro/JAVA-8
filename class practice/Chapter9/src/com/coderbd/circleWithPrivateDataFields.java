
package com.coderbd;


public class circleWithPrivateDataFields {
    double radius;
    circleWithPrivateDataFields(double x){
     radius = x;
    }
    
    public double getArea(){
     return Math.pow(radius, 2)* 3.1415926;
    }
    
    public double getRadius(){
    return radius;
    }
}
