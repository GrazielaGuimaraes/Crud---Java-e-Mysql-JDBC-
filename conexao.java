package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Graziela Guimarães
 */
public class Conexao_BancoMysql {
    
    private static final String USUARIO = "seu_usuario_no_mysql";
    private static final String SENHA = "sua_senha_no_mysql";
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql//localhost:suaPorta/nomeSeuBancoMysql";
    
    
    public Connection conectar() throws SQLException{
        
    
    Connection con = null;
        
        try {
            Class.forName(DRIVER);
            
            con = DriverManager.getConnection(URL, USUARIO, SENHA);
            
            //TESTANDO CONEXÃO
            System.out.println("Conectado");
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Não conectado " + ex);
        }
        
        
        
        return con;
    
  }
    

}

