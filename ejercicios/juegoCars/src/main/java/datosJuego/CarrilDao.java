
package datosJuego;

import domain.*;
import java.sql.*;
import java.util.*;


public class CarrilDao implements IConexion{
    
   
    private static final String SQL_SELECT = "SELECT id_carril FROM juego_cars.carril ";
    private static final String SQL_INSERT = "INSERT INTO  juego_cars.carril(id_carril) VALUES(?)";
    private static final String SQL_UPDATE = "UPDATE juego_cars.carril SET  telefono=? WHERE id_carril=? ";
    private static final String SQL_DELETE = "DELETE FROM juego_cars.carril WHERE id_persona=?";

    @Override
    public List<Juego> seleccionar() {
        Connection c=null;
        PreparedStatement ps=null;
        ResultSet rs= null;
        List<Carril> carriles =new ArrayList<>();
       
    }

    @Override
    public void insertar(Juego juego) {
        
    }

    @Override
    public void actualizar(Juego juego) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Juego juego) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
