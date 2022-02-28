package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Conexao_BancoMysql;
import model.Usuario;

/**
 *
 * @author Graziela Guimarães
 */
public class Controlador {
    
    
    
    public static void main(String[] args) throws SQLException {
        
        
        Usuario usuario = new Usuario();
        //Setando o id estaticamente
        usuario.setId(1);
        
         delete(usuario);
         
         
        
         }
    
    public static void delete(Usuario u){
        
        String sql = "delete from usuario where id = ?";
        
        try {
            Connection con = Conexao_BancoMysql.conectar();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, u.getId());
            pst.executeUpdate();
            
            System.out.println("Deletado");
            
        } catch (SQLException ex) {
            System.out.println("Erro ao deletar");        }

        
        
    }
       
    }
    
   
    

