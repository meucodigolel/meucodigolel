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
public class CaixaEletronico {

    /**
     * @param args the command line arguments
     */
    
  
    
    
    public static void main(String[] args) {
        // TODO code application logic here
       Banco banco = new Banco();
       String eImo, eCar, nome;
       String emprestaImovel, emprestaCarro;
       nome = JOptionPane.showInputDialog("Digite Nome:");
       banco.setNome(nome);
       banco.setNumero(JOptionPane.showInputDialog("Digite Número:"));
       eImo = "";
       while(!eImo.equals("S") && !eImo.equals("N") )
       {
            eImo = JOptionPane.showInputDialog("Oferece Empréstimo Imóvel?(S/N):");
       }
       if(eImo.equals("S"))
       {
           banco.setEmprestimoImovel(true);
       }
       else
       {
           banco.setEmprestimoImovel(false);
       }
       eCar = JOptionPane.showInputDialog("Oferece Empréstimo Carro?(S/N):");
       if(eCar.equals("S"))
       {
           banco.setEmprestimoCarro(true);
       }
       else
       {
           banco.setEmprestimoCarro(false);
       }
        
       
       
       //Aqui é para exibição
       if(banco.isEmprestimoCarro())
       {
           emprestaCarro = "Sim";
       }
       else
       {
           emprestaCarro = "Não";
       }
       
       //Aqui é para exibição
       if(banco.isEmprestimoImovel())
       {
           emprestaImovel = "Sim";
       }
       else
       {
           emprestaImovel = "Não";
       }
        
       JOptionPane.showMessageDialog(null, "BANCO:\n"+banco.getNome()+"\n"
               +banco.getNumero()+"\nEmp. Carro:"+emprestaCarro+ 
               "\nEmp. Imóvel:"+emprestaImovel);
        
        
        /*
        Boolean deucerto;
        c.abrir("Marcelo", "123456", "7690000");
        
        deucerto = c.depositar(13.0);
        if(deucerto==true)
        {
            JOptionPane.showMessageDialog(null, 
                    "Depósito realizado com sucesso\nSaldo:"+c.retornarSaldo());
            
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Depósito não realizado");
        }
                
        
        deucerto = c.sacar(20.0);
        if(deucerto==true)
        {
            JOptionPane.showMessageDialog(null, "Saque realizado com sucesso");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Saque não realizado");
        }
        
        deucerto = c.sacar(9.0);
        if(deucerto==true)
        {
            JOptionPane.showMessageDialog(null, 
                    "Saque realizado com sucesso\nSaldo:"+c.retornarSaldo());
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Saque não realizado");
        }
        */
    }
    
}
