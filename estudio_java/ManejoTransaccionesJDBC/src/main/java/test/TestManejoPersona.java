package test;

import datos.ConexionTest;
import datos.PersonaDAO;
import domain.Persona;
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
            PersonaDAO personaDao = new PersonaDAO(conexion);

            Persona cambioPersona = new Persona();
            cambioPersona.setIdPersona(2);
            cambioPersona.setNombre("karla Ivonne");
            cambioPersona.setApellido("Gomez");
            cambioPersona.setEmail("kgomez@mail.com");
            cambioPersona.setTelefono("7713445678");
            personaDao.actualizar(cambioPersona);

            Persona nuevaPersona = new Persona();
            nuevaPersona.setNombre("Calos");
            //nuevaPersona.setApellido("Ramirez111111111111111111111111111111111111111111");
            //en la linea 33 al ejecutar se da una excepcion por lo tanto se ejecuta rollback
            nuevaPersona.setApellido("Ramirez");
            personaDao.insertar(nuevaPersona);
            
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
