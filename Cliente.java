package caixaeletronico;

public class Cliente { 
    private String cpf, datanasc;
    private String nome, endereco;
    private boolean spc, serasa;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(String datanasc) {
        this.datanasc = datanasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void atribuiSpc (boolean valor)
    {
        spc = valor;
    }
    
    public boolean retornaSpc ()
    {
        return spc;
    }
    
    public void atribuiSerasa (boolean valor)
    {
        serasa = valor;
    }
    
    public boolean retornaSerasa ()
    {
        return serasa;
    }
}
