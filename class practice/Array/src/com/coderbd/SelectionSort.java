
package com.coderbd;

public class SelectionSort {
    public static void main(String[] args) {
        double[] list={24, 54, 32, 45};
        for(double x : selectionSort(list)){
            System.out.print(x+ ", ");
        }
        
    }
    public static double[] selectionSort(double[] list){
    
        for(int i=0; i<list.length-1; i++){
         double currentMin =list[i];
         int currentMinIndex =i;
         for(int j=i+1; j<list.length; j++){
         if(currentMin>list[j]){
             currentMin = list[j];
             currentMinIndex =j;
         }
         }
            if(currentMinIndex!=i){
            list [currentMinIndex]=list[i];
            list[i]=currentMin;
            
            }
        }
       return list;
    } 
}
