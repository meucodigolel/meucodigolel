/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Pessoa;

/**
 *
 * @author Andriel
 */
public class PessoaDAO {
    public Boolean inserir (Pessoa pessoa)
    {
        
        Boolean retorno = false;
        //Mostra o sql de insert da tabela
        String sql = "INSERT INTO pessoa (nome,sexo)" +
                "VALUES (?,?)";
        //Prepara a conexão
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
       try{ 
        pst.setString(1, pessoa.getNome());
        pst.setString(2, pessoa.getSexo());
        
        //Executa o sql no banco de dados
        pst.executeUpdate();
                retorno = true;
       }
       
       catch(Exception ex)
       {
           ex.printStackTrace();
           retorno = false;
       }
        
       return retorno;
 
    }
    
      public Boolean excluir (Pessoa pessoa)
    {
        
        Boolean retorno = false;
        //Mostra o sql de insert da tabela
        String sql = "DELETE FROM pessoa WHERE login = ?";
        //Prepara a conexão
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
       try{ 
        pst.setInt(1, pessoa.getCodigo());
       
        //Executa o sql no banco de dados
        pst.executeUpdate();
                retorno = true;
       }
       
       catch(Exception ex)
       {
           ex.printStackTrace();
           retorno = false;
       }
        
       return retorno;
 
    }
    
    public List<Pessoa> listar()
    {
        
        //crio a lista de jogadores
        
        List<Pessoa> lista = new ArrayList<Pessoa>();
        String sql = "SELECT * FROM pessoa";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try {
            //Executo o sql e jogo em um resultSet
            ResultSet res = pst.executeQuery();
            //Eqaunto tiver REGISTRO eu vou relacionar
            //com a minha classe Jogador e adicionar na lista 
            while(res.next())
            {
                Pessoa pessoa = new Pessoa();
                //pessoa.setCodigo(Integer.parseInt(res.getString("codigo")));
                pessoa.setCodigo(res.getInt("id"));
                pessoa.setNome(res.getString("nome"));
                pessoa.setSexo(res.getString("sexo"));
                lista.add(pessoa);
            }
            } catch(SQLException ex){
               
               ex.printStackTrace();
            }
        return lista;
        }
}
