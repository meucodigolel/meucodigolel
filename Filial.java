/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mcdonalds;

import java.util.List;

/**
 *
 * @author Aluno
 */
public class Filial {
  
    List <Cozinheiro> cozinheiros;
    List <Caixa> caixas;
    
    
    private Gerente gerente;
    private String cidade;
    private Double preco_medio_lanche;
    private Integer qtd_vendas;

    public List<Cozinheiro> getCozinheiros() {
        return cozinheiros;
    }

    public void setCozinheiros(List<Cozinheiro> cozinheiros) {
        this.cozinheiros = cozinheiros;
    }

    public List<Caixa> getCaixas() {
        return caixas;
    }

    public void setCaixas(List<Caixa> caixas) {
        this.caixas = caixas;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Double getPreco_medio_lanche() {
        return preco_medio_lanche;
    }

    public void setPreco_medio_lanche(Double preco_medio_lanche) {
        this.preco_medio_lanche = preco_medio_lanche;
    }

    public Integer getQtd_vendas() {
        return qtd_vendas;
    }

    public void setQtd_vendas(Integer qtd_vendas) {
        this.qtd_vendas = qtd_vendas;
    }
    
    

      
    

    
    public Double faturamento_medio() {
        return qtd_vendas * preco_medio_lanche;
        
    }
    
}
