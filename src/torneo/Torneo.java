/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package torneo;

/**
 *
 * @author cristian
 */
public class Torneo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arbitro a = new Arbitro("Gianluca");
        
        Squadra s1 = new Squadra("s1");
        Squadra s2 = new Squadra("s2");
        Squadra s3 = new Squadra("s3");
        Squadra s4 = new Squadra("s4");
        
        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s2);
        Thread t3 = new Thread(s3);
        Thread t4 = new Thread(s4);
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
        
    }
    
}
