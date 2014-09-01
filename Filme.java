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
public class Filme {
    
    String nome , genero , ator ;
    Integer duracao , idade ;
    Integer classificacao ;
    boolean midade;
    
            
    void atribuirnome (String valor)
            
    {
        nome = valor;
        
    }
    
    String retornarnome ()
    {
        return  nome ;
    }
    
    void atribuirator (String valor)
    {
        ator = valor ;
    }
    
    String retornarator ()
    {
        return ator ;
    }
    void atribuirgenero (String valor)
    {
        genero = valor;  
    }
    String retornargenero ()
    {
        return genero ;
    } 
    
    void atribuirduracao (Integer valor)
    {
        duracao = valor;
    }
    Integer retornarduracao ()
    { 
        return duracao;
    }
     void atribuirclassificacao (Integer valor)
     {
         classificacao = valor ;
     }
    Integer retornarclassificacao()
    {
        return classificacao;
    }
    void atribuiridade ( Integer valor )
    {
        idade = valor;
        
        boolean midade = classificacao < idade;
        
        if (midade == false){
            JOptionPane.showMessageDialog(null, "vc não pode assistir esse filme ");
        }
        else {
            JOptionPane.showMessageDialog(null, "vc pode assistir esse filme ");
        }
    }
    Integer retornaridade()
    {
        return idade;
    
    }
    
}
