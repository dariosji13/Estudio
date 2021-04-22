
package datos;

import domain.PersonaDTO;
import domain.UsuarioDTO;
import java.sql.SQLException;
import java.util.List;


public interface IUsuarioDao {
    
    public List<UsuarioDTO> select()throws SQLException;
    public int insert(UsuarioDTO usuario)throws SQLException;
    public int update(UsuarioDTO usuario)throws SQLException;
    public int delete(UsuarioDTO usuario)throws SQLException;
    
}
