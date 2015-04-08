/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package andrielpessoa;

import javax.swing.JOptionPane;
import modelo.Pessoa;

/**
 *
 * @author Aluno
 */
public class AndrielPessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Pessoa pessoa = new Pessoa ();
    
    pessoa.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo: ")));
    pessoa.setSexo(JOptionPane.showInputDialog("digite sexo: "));
    pessoa.setNome(JOptionPane.showInputDialog("Digite o nome:"));
    
    JOptionPane.showConfirmDialog(null, pessoa.getCodigo()+ "\n" +
                                        pessoa.getSexo()+ "\n" +
                                        pessoa.getNome() );
            
    
    
    
    }
    
}
