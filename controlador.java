package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Conexao_BancoMysql;
import model.Usuario;

/**
 *
 * @author Graziela Guimarães
 */
public class Controlador {
    
    
    
    
    public static void main(String[] args) throws SQLException {
        
       
         try {
           
             Connection con = new Conexao_BancoMysql().conectar();
             PreparedStatement pst = null;
             ResultSet set = null;
             
             Usuario usuario = new Usuario();
             usuario.setLogin("admin");
             usuario.setSenha("123");
             
            
            pst = con.prepareStatement("insert into usuario (login, senha) values (?,?)");
            pst.setString(1, usuario.getLogin());
            pst.setString(2, usuario.getSenha());
            pst.execute();
            
            System.out.println("Usuário inserido com sucesso!");
            
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir usuário: " + ex);
        }
        
       
    }
    
   
    
}
