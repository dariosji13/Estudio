
package test;

import datos.*;
import domain.UsuarioDTO;
import java.sql.*;
import java.util.*;


public class TestManejoUsuarios {
    public static void main(String[] args) {
        
        Connection conexion= null;
        try {
            conexion= ConexionTest.getConnection();
            if(conexion.getAutoCommit()){
                conexion.setAutoCommit(false);
            }
            UsuarioDaoJDBC usuarioDao = new UsuarioDaoJDBC(conexion);
            
              List<UsuarioDTO> usuarios= usuarioDao.select();
            usuarios.forEach(usuario -> {
                System.out.println("Persona DTO: "+usuario);
            });
        
            
            conexion.commit();
            System.out.println("Se ha hecho commit de la transaccion");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos en rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
      
    
    }
   
}
