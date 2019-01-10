
package com.coderbd;


public class TotalArea {
    public static void main(String[] args) {
        circleWithPrivateDataFields[] circleArray;
        
        circleArray = createCircleArray();
        
        printCircleArray(circleArray);
        }
      public static circleWithPrivateDataFields[] createCircleArray(){
                circleWithPrivateDataFields[] circleArray =
                        new circleWithPrivateDataFields[5];
                for(int i=0; i<circleArray.length; i++){
                circleArray[i] = new circleWithPrivateDataFields(Math.random()*100);
                }
        return circleArray;
        }
        
        public static void printCircleArray(
                circleWithPrivateDataFields[] circleArray){
            System.out.printf("%-30s%-15s\n", "Radius", "Area");
            for(int i=0; i<circleArray.length; i++){
                System.out.printf("%-30s%-15s\n", circleArray[i].getRadius(), circleArray[i].getArea());
            }
            System.out.println("--------------------------------------------");
            
            System.out.printf("%-30s%-15s\n", "The Total area of circle is", sum(circleArray));
        }
        public static double sum(circleWithPrivateDataFields[] circleArray){
        double sum=0;
        
        for(int i =0; i<circleArray.length; i++)
            sum+= circleArray[i].getArea();
        return sum;
        }
    }

