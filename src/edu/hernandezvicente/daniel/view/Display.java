/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hernandezvicente.daniel.view;

import java.awt.Dimension;
import java.awt.Event;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JTextField;

/**
 *
 * @author daniel
 */
public class Display extends JTextField {
    private Status status;
    private Statuszero statuszero;
    private StatusNumbers statusNumbers;
    
    public Display(){
        statuszero = new Statuszero();
        statusNumbers = new StatusNumbers();
        setZero();
    }
    
    
    private void screenDefatulOptions(){
        super.setPreferredSize(new Dimension(50, 20));
        setBorder(BorderFactory.createEtchedBorder());
        super.setEditable(false);
        super.setText("0");
        super.setHorizontalAlignment(JTextField.RIGHT);
        super.setFont(new Font("personal", 2, 30));
    }  
    
    public void setZero(){
        status = statuszero;
        status.handle();
    }
    
    public void setfilling(){
        status = statusNumbers;
        status.handle();
    }

    public boolean isEmpty(){
        return status.toString().equals("empty");
    }
    
//father class to define the diferent jTextField status:     
    abstract class Status{
        
        abstract void handle();
    }
    
    class Statuszero extends Status{

        @Override
        void handle() {
            screenDefatulOptions();
        }      
        

        @Override
        public String toString() {
            return "empty";
        }
        
    }
    
    class StatusNumbers extends Status{

        @Override
        void handle() {
            
        }        

        @Override
        public String toString() {
            return "filling";
        }
        
        
    }
}
