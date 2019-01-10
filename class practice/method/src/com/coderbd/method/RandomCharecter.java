
package com.coderbd.method;


public class RandomCharecter {
    public static char getRandomCharecter(char ch1, char ch2){
    return(char)(ch1 + Math.random()*(ch2 - ch1+1));
    }
    
    public static char getRandomLowerClassLetter(){
    return getRandomCharecter('a' , 'z');
    }
    
    public static char grtRandomUpperLowerClassLetter(){
    return getRandomCharecter('A' , 'Z');
    }
    public static char getRandomDigitCharecter(){
    return getRandomCharecter('0' , '9');
    }
    
    public static char getRandomCharecter(){
    return getRandomCharecter('\u0000' , '\uFFFF');
    }
}
