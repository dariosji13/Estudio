
package datosJuego;

import domain.*;
import java.util.*;


public interface IConexion {
    
    public List<Juego> seleccionar ();
    
    public void insertar(Juego juego);
    
    public void actualizar(Juego juego);
    
    public void eliminar(Juego juego); 
    
    
    
}
