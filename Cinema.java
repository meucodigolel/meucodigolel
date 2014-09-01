/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cinema;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Cinema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
    Filme f = new Filme ();
  
    String nome , genero , ator ;
    Integer duracao , classificacao , idade ;
    
    nome = JOptionPane.showInputDialog("Digite o nome do filme :");
    f.atribuirnome(nome);
    
    ator = JOptionPane.showInputDialog("Digite o nome do ator :");
    f.atribuirator(ator);
    
    duracao = Integer.parseInt(JOptionPane.showInputDialog("Digite a duração do filme :"));
    f.atribuirduracao(duracao);
    
    classificacao = Integer.parseInt(JOptionPane.showInputDialog("Digite a classificação do filme :"));
    f.atribuirclassificacao(classificacao);
    
    genero = JOptionPane.showInputDialog("Digite o genero do filme :");
    f.atribuirgenero(genero);
    
    idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade :"));
    f.atribuiridade(idade);
    
    JOptionPane.showMessageDialog( null , nome + " nome \n" + ator + " ator \n" + duracao + " min \n" + classificacao + " anos \n" + genero );
    
    }
    
}
