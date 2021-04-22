package test;

import datos.ConexionTest;
import datos.IPersonaDao;
import datos.PersonaDaoJDBC;
import domain.PersonaDTO;
import java.sql.*;
import java.util.*;


public class TestManejoPersona {

    public static void main(String[] args) {
        
        Connection conexion= null;          

        try {
            conexion = ConexionTest.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }
            IPersonaDao personaDao = new PersonaDaoJDBC(conexion);

            List<PersonaDTO> personas= personaDao.select();
            personas.forEach(persona -> {
                System.out.println("Persona DTO: "+persona);
            });
            
            conexion.commit();
            System.out.println("Se ha hecho commit de la transaccion");
            
        } catch (SQLException ex) {
            try {
                ex.printStackTrace(System.out);
                System.out.println("Entramos al rollback");
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }

    }

}
