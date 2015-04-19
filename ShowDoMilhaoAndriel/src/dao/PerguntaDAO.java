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
import modelo.Pergunta;

/**
 *
 * @author Andriel
 */
public class PerguntaDAO {
    
     public Boolean inserir (Pergunta pergunta)
    {
        
        Boolean retorno;
        //Mostra o sql de insert da tabela
        String sql = "INSERT INTO pergunta (enunciado,a,b,c,d,certa,nivel)" +
                "VALUES (?,?,?,?,?,?,?)";
        //Prepara a conexão
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
       try{ 
        pst.setString(1, pergunta.getEnunciado());
        pst.setString(2, pergunta.getA());
        pst.setString(3, pergunta.getB());
        pst.setString(4, pergunta.getC());
        pst.setString(5, pergunta.getD());
        pst.setString(6, pergunta.getCerta());
         pst.setInt(7, pergunta.getNivel());
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
     
     public List<Pergunta> listar()
    {
        
        //crio a lista de jogadores
        
        List<Pergunta> lista = new ArrayList<Pergunta>();
        String sql = "SELECT * FROM pergunta";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try {
            //Executo o aql e jogo em um resultSet
            ResultSet res = pst.executeQuery();
            //Eqaunto tiver REGISTRO eu vou relacionar
            //com a minha classe Jogador e adicionar na lista 
            while(res.next())
            {
                Pergunta pergunta = new Pergunta();
                pergunta.setEnunciado(res.getString("enunciado"));
                pergunta.setA(res.getString("A"));
                pergunta.setB(res.getString("B"));
                pergunta.setC(res.getString("C"));
                pergunta.setD(res.getString("D"));
                pergunta.setId(res.getInt("id"));
                pergunta.setCerta(res.getString("certa"));
                pergunta.setNivel(res.getInt("nivel"));
                
                
                lista.add(pergunta);
            }
            } catch(SQLException ex){
               
               ex.printStackTrace();
            }
        return lista;
        }
    
}
