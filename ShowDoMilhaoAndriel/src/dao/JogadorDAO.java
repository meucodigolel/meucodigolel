/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.sun.istack.internal.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import modelo.Jogador;

/**
 *
 * @author Andriel
 */
public class JogadorDAO {
    
    public Boolean inserir (Jogador jogador)
    {
        
        Boolean retorno = false;
        //Mostra o sql de insert da tabela
        String sql = "INSERT INTO jogador (login,senha,email)" +
                "VALUES (?,?,?)";
        //Prepara a conexão
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
       try{ 
        pst.setString(1, jogador.getLogin());
        pst.setString(2, jogador.getSenha());
        pst.setString(3, jogador.getEmail());
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
    
      public Boolean excluir (Jogador jogador)
    {
        
        Boolean retorno = false;
        //Mostra o sql de insert da tabela
        String sql = "DELETE FROM jogador WHERE login = ?";
        //Prepara a conexão
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
       try{ 
        pst.setString(1, jogador.getLogin());
       
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
    
    public List<Jogador> listar()
    {
        
        //crio a lista de jogadores
        
        List<Jogador> lista = new ArrayList<Jogador>();
        String sql = "SELECT * FROM jogador";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try {
            //Executo o aql e jogo em um resultSet
            ResultSet res = pst.executeQuery();
            //Eqaunto tiver REGISTRO eu vou relacionar
            //com a minha classe Jogador e adicionar na lista 
            while(res.next())
            {
                Jogador jogador = new Jogador();
                jogador.setLogin(res.getString("login"));
                jogador.setSenha(res.getString("senha"));
                jogador.setEmail(res.getString("email"));
                lista.add(jogador);
            }
            } catch(SQLException ex){
               
               ex.printStackTrace();
            }
        return lista;
        }
        
    }
    

