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
public class Banco {

  
    
    private String nome;
    private String numero;
    private Boolean emprestimoImovel;
    private Boolean emprestimoCarro;
    //retornar
    public String getNome() {
        return nome;
    }
//atribuir
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Boolean isEmprestimoImovel() {
        return emprestimoImovel;
    }

    public void setEmprestimoImovel(Boolean emprestimoImovel) {
        this.emprestimoImovel = emprestimoImovel;
    }

    public Boolean isEmprestimoCarro() {
        return emprestimoCarro;
    }

    public void setEmprestimoCarro(Boolean emprestimoCarro) {
        this.emprestimoCarro = emprestimoCarro;
    }

   
   
    
    
}
