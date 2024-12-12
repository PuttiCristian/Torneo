/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package torneo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cristian
 */
public class Squadra implements Runnable {
    public String nome;
    public int nPalleggi;
    public int[] durataPartite;
    
    
    public Squadra(String nome) {
        this.nome = nome;
        nPalleggi = 0;
        this.durataPartite = new int[100];
    }
    
    public void run() {
        while (nPalleggi < 100) {
           System.out.println("squadra: " + nome + " numero passaggi: " + nPalleggi);
            nPalleggi++;
            Thread.currentThread().yield();
        }
         
    }
    
}
