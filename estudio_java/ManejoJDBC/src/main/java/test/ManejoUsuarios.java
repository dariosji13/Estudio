
package test;

import datos.UsuarioDAO;
import domain.Usuario;
import java.util.*;

public class ManejoUsuarios {
    public static void main(String[] args) {
        UsuarioDAO usuarioDao= new UsuarioDAO();
        
        //Insertar un nuevo usuario
        
//        Usuario usuarioNuevo= new Usuario("calos.juarez","456");
//        usuarioDao.insertar(usuarioNuevo);

        //Modificar un usuario existente
//        
//        Usuario usuarioModificado= new Usuario(3,"calos.juarez","456");
//        usuarioDao.actualizar(usuarioModificado);

          //eliminar un usuario 
          
          usuarioDao.eliminar(new Usuario(3));
          
//        //Ejecutando el listado de usuarios
        List<Usuario> usuarios=usuarioDao.selecionar();
         usuarios.forEach(usuario-> {
            System.out.println("usuario = "+usuario);
        });
    
    }
   
}
