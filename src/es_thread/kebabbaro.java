/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es_thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author agostinelli.luca
 */
public class kebabbaro extends Thread {

    public  boolean kebap;
/*
   sforna kebap imposta il kebap falso poi prepara aspetta 3s e lo imposta true e lo ritorna
   
    */
   
    
    public synchronized boolean sfornaKebap() {
       kebap=false;
        prepara();
        return kebap;
    }
 
   public void prepara(){
        try {
            Thread.sleep(3000);
            kebap=true;
        } catch (InterruptedException ex) {
            Logger.getLogger(kebabbaro.class.getName()).log(Level.SEVERE, null, ex);
        }
   
   }
}
