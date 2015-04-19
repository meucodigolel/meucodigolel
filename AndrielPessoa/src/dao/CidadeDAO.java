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
import modelo.Cidade;

/**
 *
 * @author Andriel
 */
public class CidadeDAO {
    public Boolean inserir (Cidade cidade)
    {
        
        Boolean retorno = false;
        //Mostra o sql de insert da tabela
        String sql = "INSERT INTO cidade (nome)" +
                "VALUES (?)";
        //Prepara a conexão
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
       try{ 
        pst.setString(1, cidade.getNome());
        
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
    
      public Boolean excluir (Cidade cidade)
    {
        
        Boolean retorno = false;
        //Mostra o sql de insert da tabela
        String sql = "DELETE FROM cidade WHERE login = ?";
        //Prepara a conexão
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
       try{ 
        pst.setInt(1, cidade.getCodigo());
       
        //Executa o sql no bancod de dados
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
    
    public List<Cidade> listar()
    {
        
        //crio a lista de jogadores
        
        List<Cidade> lista = new ArrayList<Cidade>();
        String sql = "SELECT * FROM cidade";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try {
            //Executo o aql e jogo em um resultSet
            ResultSet res = pst.executeQuery();
            //Eqaunto tiver REGISTRO eu vou relacionar
            //com a minha classe Jogador e adicionar na lista 
            while(res.next())
            {
                Cidade cidade = new Cidade();
                cidade.setCodigo(res.getInt("id"));
                cidade.setNome(res.getString("nome"));
                lista.add(cidade);
            }
            } catch(SQLException ex){
               
               ex.printStackTrace();
            }
        return lista;
        }
}
