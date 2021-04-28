
package datosJuego;

import domain.*;
import java.util.*;


public interface IConexion {
//    List<Juego>
    public void seleccionar ();
    
    public void insertar(Juego juego);
    
    public void actualizar(Juego juego);
    
    public void eliminar(Juego juego); 
    
    
    
}
