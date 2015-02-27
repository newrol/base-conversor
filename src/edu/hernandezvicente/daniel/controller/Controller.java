/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.hernandezvicente.daniel.controller;

import edu.hernandezvicente.daniel.model.Conversor;
import edu.hernandezvicente.daniel.view.Calc;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 * @author Daniel 
 */
public class Controller {
    private Calc calc;
    private Conversor conversor;
    
    public static void main(String[] args) {
        new Controller().init();
    }
    
    public void init() {
        
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                conversor = new Conversor();
                calc = new Calc(Controller.this);
                calc.setLocationRelativeTo(null);
                calc.setVisible(true);
            }
            
        });
    }
    
    /**
     * calculate the decimal value of calc display
     */
    public void decimalConversion(){
        calc.setResult(conversor.decimalConvert(calc.getDisplayValue(), getBase()));
        calc.setDecimal();
    }
    
    /**
     * calculate the hexadecimal value of calc display
     */
    public void hexadecimalConversion(){
        calc.setResult(conversor.hexadecimalConvert(calc.getDisplayValue(), getBase()));
        calc.setHexadecimal();
    }
    
    /**
     * calculate the octal value of calc display
     */
    public void octalConversion(){
        calc.setResult(conversor.octalConvert(calc.getDisplayValue(), getBase()));
        calc.setOctal();
    }
    /**
     * calculate the binary value of calc display
     */
    public void binaryConversion(){
        calc.setResult(conversor.binaryConvert(calc.getDisplayValue(), getBase()));
        calc.setBinary();
    }
    
    /**
     * method to get display number base:
     * @return 10, 16, 8, 2 
     */
    private int getBase(){
        String statusValue = calc.getStatusValue();
        
        switch (statusValue) {
            case "decimal":
                    return 10;       
            case "hexadecimal":
                    return 16;
            case "octal":
                    return 8;
            case "binary":
                    return 2;                
            default:
                throw new AssertionError();
        }
    }
    
    //Event class to set keyboard values in to display:    
    public class KeyboardAction implements  ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            calc.setDisplayValue(e.getActionCommand());
        }
    }
    
    //Event class to set CE reset button:
    public class ResetAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            calc.reset();
        }    
    }
}
