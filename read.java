package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Conexao_BancoMysql;
import model.Usuario;

/**
 *
 * @author Graziela Guimarães
 */
public class Controlador {
    
    
    
    public static void main(String[] args) throws SQLException {
        
        
       List<Usuario> usuariosLista = new ArrayList<>();
       usuariosLista = read();
       
       
        
         }
    
    public static List<Usuario> read(){
        
        String sql = "select * from usuario";
        List usuarios = new ArrayList();
        
        try {
            Connection con = Conexao_BancoMysql.conectar();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.executeQuery();
            ResultSet set = pst.executeQuery();
            
            if(set.next()){
                Usuario u = new Usuario();
                
                u.setId(set.getInt("id"));
                u.setLogin(set.getString("login"));
                u.setSenha(set.getString("senha"));
                
                usuarios.add(u);
            }
            
            
            
        } catch (SQLException ex) {
            System.out.println("Erro ao listar"); 
    }
        
        return usuarios;
        
        
      }
    
    
       
    }
    
   
    

