/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package caixaeletronico;

import javax.swing.JOptionPane;

/**
 *
 * @author marcelosiedler
 */
public class Quarta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conta c = new Conta();
        
        c.abrir("aaa", "1234", "987678");
        Double entradavalor;
        Boolean deucerto;
        entradavalor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor para depósito:"));
        
        deucerto = c.depositar(entradavalor);
        
        if(deucerto==true)
        {
            System.out.println("OKKKK");
        }
        else
        {
            System.out.println("NA DEU");
        }
        
        
        System.out.println(c.retornarSaldo());
        deucerto = c.sacar(10.0);
        if(deucerto==true)
        {
            System.out.println("OKKKK");
        }
        else
        {
            System.out.println("NA DEU");
        }
        
        deucerto = c.sacar(1000.0);
        if(deucerto==true)
        {
            System.out.println("OKKKK");
        }
        else
        {
            System.out.println("NA DEU");
        }
        
       
    }
    
}
