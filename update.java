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
        
         Conexao_BancoMysql conexao = new Conexao_BancoMysql();
         
         Usuario u = new Usuario();
         u.setLogin("Admin");
         u.setSenha("000");
         u.setId(1);
         
         String sql = "update usuario set login = ?, senha = ? where id = ?";
         
         try{
         Connection con = conexao.conectar();
         PreparedStatement pst = con.prepareStatement(sql);
         pst.setString(1, u.getLogin());
         pst.setString(2, u.getSenha());
         pst.setInt(3, u.getId());
         pst.executeUpdate();
         
             System.out.println("Atualizado");
             
         }catch(SQLException e){
             System.out.println("Não atualizado: " + e);
         }
       
    }
    
   
    
}
