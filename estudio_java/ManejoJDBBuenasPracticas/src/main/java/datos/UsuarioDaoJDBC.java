package datos;


import domain.UsuarioDTO;
import java.sql.*;
import java.util.*;

public class UsuarioDaoJDBC implements IUsuarioDao{
    
    private Connection conexionTransaccional;
    private static final String SQL_SELECT = "SELECT id_usuario, username,password FROM test.usuario ";
    private static final String SQL_INSERT = "INSERT INTO  test.usuario(username, password) VALUES(?,?)";
    private static final String SQL_UPDATE = "UPDATE test.usuario SET username=?, password=? WHERE id_usuario=?";
    private static final String SQL_DELETE = "DELETE FROM test.usuario WHERE id_usuario=?";

    public UsuarioDaoJDBC() {
    }

    public UsuarioDaoJDBC(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;
    }

    
    public List<UsuarioDTO> select() throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        UsuarioDTO usuario = null;
        List<UsuarioDTO> usuarios = new ArrayList<>();
        try {
            conn = this.conexionTransaccional!= null ?this.conexionTransaccional :ConexionTest.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idUsuario = rs.getInt("id_usuario");
                String username = rs.getString("username");
                String password = rs.getString("password");
                System.out.println("ejecutando query: "+ SQL_SELECT);
                usuario= new UsuarioDTO(idUsuario,username,password);
                usuarios.add(usuario);
            }
        
        } finally {
            
                ConexionTest.close(rs);
                ConexionTest.close(stmt);
                if (this.conexionTransaccional== null){
                    ConexionTest.close(conn);
                }       
            
        }
        return usuarios;
    }

    public int insert(UsuarioDTO usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros= 0;
        try {
            conn =this.conexionTransaccional!= null ?this.conexionTransaccional :ConexionTest.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, usuario.getUsername());
            stmt.setString(2, usuario.getPassword());
            System.out.println("ejecutando query: "+ SQL_INSERT);
            registros = stmt.executeUpdate();
            System.out.println("Numero de registros afectados: "+ registros);
        } 
        finally{
                ConexionTest.close(stmt);
                if (this.conexionTransaccional== null){
                    ConexionTest.close(conn);
                }   
        }
        return  registros;
    } 
    
     public int update (UsuarioDTO usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros= 0;
        try {
            conn =this.conexionTransaccional!= null ?this.conexionTransaccional :ConexionTest.getConnection();
             System.out.println("ejecutando query: "+ SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, usuario.getUsername());
            stmt.setString(2, usuario.getPassword());
            stmt.setInt(3, usuario.getIdUsusario());
            registros = stmt.executeUpdate();
             System.out.println("Numero de registros actualizados: "+ registros);
        } 
        finally{
            
                ConexionTest.close(stmt);
                if (this.conexionTransaccional== null){
                    ConexionTest.close(conn);
                }   
        }
        return  registros;
    } 
     
      public int delete(UsuarioDTO usuario) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros= 0;
        try {
            conn =this.conexionTransaccional!= null ?this.conexionTransaccional :ConexionTest.getConnection();
             System.out.println("ejecutando query: "+ SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, usuario.getIdUsusario());
            registros = stmt.executeUpdate();
             System.out.println("Numero de registros eliminados: "+ registros);
        } 
        finally{
            
                ConexionTest.close(stmt);
                if (this.conexionTransaccional== null){
                    ConexionTest.close(conn);
                }   
          
        }
        return  registros;
    } 
}
    
