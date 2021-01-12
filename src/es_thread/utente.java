/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es_thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 il metodo run 
 * @author agostinelli.luca
 */
public class utente implements Runnable {

    private boolean soddisfatto = false;
    private boolean stop = false;
    private kebabbaro kebabbaro;
    private int numero;
    
    public utente(kebabbaro kebabbaro, int numero) { //utilizzo per impostare i parametri all'utente
    this.kebabbaro = kebabbaro;
        this.numero = numero;
    }

   @Override
   public void run() {

        while (!stop) { //se è false va avanti
            while (!soddisfatto) { 
                soddisfatto = kebabbaro.sfornaKebap();//gli assegno la variabile buleana
                if (soddisfatto) { //se il panino è pronto 
                    System.out.println("THREAD SODDISFATTO"+numero);
                   notify();
                }else{ //se il panino no è pronto 
                    try {
                        wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(utente.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }

    public void termina() {
        stop = true;
    }

}
