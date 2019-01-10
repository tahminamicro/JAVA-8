
package com.coderbd;


public class ArrayBasics24 {
    public static void main(String[] args) {
        int[] intArr =new int[2];
        intArr[0]=10;
        intArr[1]=15;
        System.out.println("intArr Length:" +intArr.length);
        System.out.println("intArr[0]" + intArr[0]);
        
        String str[] =new String[3]; //Array takes homogenous data
        str[0]="A....";
        System.out.println("str:"+ str[0]);
        
        double[] doubleArr= new double[5];
        System.out.println("doubleArr[0]:"+ doubleArr[0]);
        
        int intArray[]= {5, 10, 15, 20, 25};
        System.out.println("Min" + intArray[0]);
        System.out.println("Max: "+ intArray[intArray.length-1]);
        System.out.println("20:" + intArray[3]);
        
        for(int i=0; i<=intArray.length-1; i++){
            System.out.println(i+":"+intArray[i]);
        }
         
        char[] city ={'D', 'a', 'l', 'a', 's'};
        System.out.println(city);
        System.out.println("Size of city:" + city.length);
        /////////////////////////
        int[] intNumbers =new int[100];
        
        for(int j=0; j< intNumbers.length; j++){
         intNumbers[j]=j;
        }
        System.out.println("Length of intNumbers:" + intNumbers.length);
        
        for(int p=0; p< intNumbers.length; p++){
         if(intNumbers[p]>50){
             System.out.println(p +":" +intNumbers[p]);
         }
        }
        
        for(int k=0; k< intNumbers.length; k++){
         if(intNumbers[k]%5==0){
             System.out.println(k +":" +intNumbers[k]);
         }
        }
        
        for(int n=0; n< intNumbers.length; n+=5){
         if(intNumbers[n]%5==0){
             System.out.println(n +":" +intNumbers[n]);
         }
        }
        ///////////////for each loop or for in/////////
        
        for( int i: intNumbers){
            System.out.println("::"+i);
        }
    }
}
