/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package caixaeletronico;

/**
 *
 * @author marcelosiedler
 */
public class TesteConstrututor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conta c = new Conta();
        
        System.out.println("SALDO:" + c.retornarSaldo());
        System.out.println("AGÊNCIA:" + c.getAgencia());
        System.out.println("ÄTIVA:"+c.isAtiva());
        
    }
    
}
