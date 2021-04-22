
package test;

import datos.*;
import domain.Usuario;
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
            UsuarioDAO usuarioDao = new UsuarioDAO(conexion);
            
            Usuario nuevoUsuario = new Usuario();
            nuevoUsuario.setUsername("gloria.jimenénez");
            nuevoUsuario.setPassword("0412");
            usuarioDao.insertar(nuevoUsuario);
            
            Usuario cambioUsuario = new Usuario();
            cambioUsuario.setIdUsusario(2);
            cambioUsuario.setUsername("lora.osji");
            cambioUsuario.setPassword("032592");
            usuarioDao.actualizar(cambioUsuario);
            
            conexion.commit();
            
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
