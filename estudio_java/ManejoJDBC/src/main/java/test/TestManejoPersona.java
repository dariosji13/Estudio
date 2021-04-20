
package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.*;


public class TestManejoPersona {
    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();
        
        //Insertando un nuevo objeto de tipo persona
//        Persona personaNueva =new Persona("Carlos", "Esparza","cesparza@mail.com","54455687");
//        personaDao.insertar(personaNueva);


        // Modificar un objeto de persona existente
//        Persona personaModificada= new Persona(7,"Juan Calos","Esparza","jcesparza@mail.com","54455687");
//        personaDao.actualizar(personaModificada);
//        
        //Eliminar un registro
        Persona personaEliminada= new Persona(7);
        personaDao.eliminar(personaEliminada);
        //Listado de personas
        List<Persona> personas= personaDao.seleccionar();
//        for(Persona persona: personas){
//            System.out.println("persona = "+persona);
//        }es el ciclo forEach
        personas.forEach(persona -> {
            System.out.println("persona = "+persona);
        });//es ciclo forEach con funcion land
        
    }
}
