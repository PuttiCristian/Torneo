/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package torneo;

/**
 *
 * @author cristian
 */
public class Arbitro {
    public String nome;
    
    public Arbitro(String nome) {
        this.nome = nome;
    }
    
    public void inizioTorneo() {
        String ms = "inizio torneo";
        System.out.println(ms);
    }
    
    public void fineTorneo() {
        String ms = "fine torneo";
        System.out.println(ms);
    }
}
