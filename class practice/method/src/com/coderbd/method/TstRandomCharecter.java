
package com.coderbd.method;


public class TstRandomCharecter {
    public static void main(String[] args) {
        final int NUMBER_OF_CHARS =175;
        final int chars_PER_LINE =25;
        
        for(int i=0; i< NUMBER_OF_CHARS; i++){
        char ch = RandomCharecter.getRandomLowerClassLetter();
        if((i+1) % chars_PER_LINE == 0){
                System.out.println(ch);
        }else{
            System.out.print(ch);
        }
        }
    }
}
