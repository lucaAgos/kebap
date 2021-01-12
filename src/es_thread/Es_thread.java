/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es_thread;

/**
 *
 * @author agostinelli.luca
 */
public class Es_thread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread[] t = new Thread[20];
       kebabbaro kebabbaro=new kebabbaro();
        for (int i = 0; i <20; i++) {
            t[i] = new Thread(new utente(kebabbaro,i));//in questo modo inserisco gli utenti dentro thread
        }
        for (int i = 0; i <20; i++) {
            t[i].start();
        }

    
    
    
    }

}
