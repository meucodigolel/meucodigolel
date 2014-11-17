/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mcdonalds;

/**
 *
 * @author Aluno
 */
public class McOferta {
    Bebida bebida;
    Hamburguer hamburguer;
    Batata batata;
    Double preco, precoferta;
    Integer cod;
    String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public Bebida getBebida() {
        return bebida;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    public Hamburguer getHamburguer() {
        return hamburguer;
    }

    public void setHamburguer(Hamburguer hamburguer) {
        this.hamburguer = hamburguer;
    }

    public Batata getBatata() {
        return batata;
    }

    public void setBatata(Batata batata) {
        this.batata = batata;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    
    
    
    public String descricaooferta () {
        return nome + "..." + hamburguer + "..." + bebida + "..." + batata;
        
  }
    
    public Double valoreconomia () {
        precoferta = 3.00;
        
        return preco - precoferta;
    }
    
    
    
}
