/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hernandezvicente.daniel.model;

/**
 *  
 * Class created to convert a number between his different decimal, hexadecimal octal and binary bases: 
 * @author daniel
 */
public class Conversor {
    
    private long numberBuffer = 0;
    /**
     * Convert nBase number  to decimal
     * @param inputValue String number value.
     * @param radx actual number base
     * @return 
     */
    public String decimalConvert(String inputValue, int radx){
       numberBuffer = Long.parseLong(inputValue, radx);
        return Long.toString(numberBuffer, 10);        
    }
   
    /**
     * Convert nBase number to hexadecimal
     * @param inputValue String number value.
     * @param radx actual number base
     * @return 
     */
    public String hexadecimalConvert(String inputValue, int radx){
        numberBuffer = Long.parseLong(inputValue, radx);
        return Long.toString(numberBuffer , 16).toUpperCase();
    }
   
    /**
     * Convert nBase number to octal
     * @param inputValue String number value.
     * @param radx actual number base
     * @return 
     */
    public String octalConvert(String inputValue, int radx){
       numberBuffer = Long.parseLong(inputValue, radx);
       return Long.toString(numberBuffer, 8);
    }
   
    /**
     * Convert nBase number to binary
     * @param inputValue String number value.
     * @param radx actual number base
     * @return 
     */
   public String binaryConvert(String inputValue, int radx){
       numberBuffer = Long.parseLong(inputValue, radx);
       return Long.toString(numberBuffer, 2);
    }
}

