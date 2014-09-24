/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package caixaeletronico;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marcelosiedler
 */
public class ExemploContas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Conta> contas = new ArrayList<Conta>();
        //Crio uma conta
        Conta c = new Conta();
        c.abrir("Marcelo", "222-2", "34566");
        //Adiciono na lista
        contas.add(c);
        c = new Conta();
        c.abrir("Ana", "444", "66666");
        //adiciona na lista
        contas.add(c);
        for (Conta conta : contas) {
            System.out.println(conta.getNomeCorrentista());
        }
        
    }
    
}
