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
public class Caixa {
    String nome, data_nasc, cpf, horario_trab;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getHorario_trab() {
        return horario_trab;
    }

    public void setHorario_trab(String horario_trab) {
        this.horario_trab = horario_trab;
    }
    
    public Double Salario( ) {
        return 0.0;
    }
}
