/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hernandezvicente.daniel.testmodel;

import edu.hernandezvicente.daniel.model.Conversor;
import junit.framework.TestCase;

/**
 *
 * @author daniel
 */
public class ConversorTest extends TestCase {
    private Conversor conversor = null;
    private String decimalValue;
    private String hexadecimalValue;
    private String octalValue;
    private String binaryValue;
    private String outputvalue = null;
    
    /**
     * Method will be executed before all mehtod tests
     *  in this case is used to inicialize default values.
     */
    @Override
    protected void setUp() throws Exception {
        conversor = new Conversor();
        decimalValue = "5321";
        hexadecimalValue = "14C9";
        octalValue = "12311";
        binaryValue = "1010011001001";    
    }
    
    /**
     * conversor.decimalConvert test
     */
    public void testDecimalConversor(){
       outputvalue = conversor.decimalConvert(decimalValue, 10);
       assertEquals(decimalValue , outputvalue);
       outputvalue = conversor.decimalConvert(hexadecimalValue, 16);
       assertEquals(decimalValue, outputvalue);
       outputvalue = conversor.decimalConvert(binaryValue, 2);
       assertEquals(decimalValue, outputvalue);
       outputvalue = conversor.decimalConvert(octalValue, 8);
       assertEquals(decimalValue, outputvalue);
    }
    
    /**
     * conversor.hexadecimalConvert test
     */
    public void testHexadecimalConversor(){
       outputvalue = conversor.hexadecimalConvert(decimalValue, 10);
       assertEquals(hexadecimalValue , outputvalue);
       outputvalue = conversor.hexadecimalConvert(hexadecimalValue, 16);
       assertEquals(hexadecimalValue, outputvalue);
       outputvalue = conversor.hexadecimalConvert(binaryValue, 2);
       assertEquals(hexadecimalValue, outputvalue);
       outputvalue = conversor.hexadecimalConvert(octalValue, 8);
       assertEquals(hexadecimalValue, outputvalue);
    }
    
    /**
     * conversor.octalConversor test
     */
    public void testOctalConversor(){
       outputvalue = conversor.octalConvert(decimalValue, 10);
       assertEquals(octalValue , outputvalue);
       outputvalue = conversor.octalConvert(hexadecimalValue, 16);
       assertEquals(octalValue, outputvalue);
       outputvalue = conversor.octalConvert(binaryValue, 2);
       assertEquals(octalValue, outputvalue);
       outputvalue = conversor.octalConvert(octalValue, 8);
       assertEquals(octalValue, outputvalue);
    }
    
    /**
     * conversor.binaryConversor test
     */
    public void testBinaryConvert(){
       outputvalue = conversor.binaryConvert(decimalValue, 10);
       assertEquals(binaryValue , outputvalue);
       outputvalue = conversor.binaryConvert(hexadecimalValue, 16);
       assertEquals(binaryValue, outputvalue);
       outputvalue = conversor.binaryConvert(binaryValue, 2);
       assertEquals(binaryValue, outputvalue);
       outputvalue = conversor.binaryConvert(octalValue, 8);
       assertEquals(binaryValue, outputvalue);
    }
}
