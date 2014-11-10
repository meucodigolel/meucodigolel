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
public class Cozinheiro {
    String nome, data_nasc, cpf, turno_trab;

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

    public String getTurno_trab() {
        return turno_trab;
    }

    public void setTurno_trab(String turno_trab) {
        this.turno_trab = turno_trab;
    }
    
    public Double Salario () {
       if (turno_trab == "Noturno") {
           
           return 1700.0;
       }
       else return 1300.0;
        
        
        
    
    }
}
