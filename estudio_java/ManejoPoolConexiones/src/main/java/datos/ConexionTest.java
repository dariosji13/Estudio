package datos;

import java.sql.*;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

public class ConexionTest {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/test?userSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrival=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "maxi";
    private static BasicDataSource ds;
    
    public static DataSource getDatasource(){
        if (ds ==null);
        ds= new BasicDataSource();
        ds.setUrl(JDBC_URL);
        ds.setUsername(JDBC_USER);
        ds.setPassword(JDBC_PASSWORD);
        //Definimos el tamaño inicial del pool de conexiones
        ds.setInitialSize(50);
        return ds;
    }

    public static Connection getConnection() throws SQLException {

        return getDatasource().getConnection();
    }

    public static void close(ResultSet rs) throws SQLException {
        rs.close();
    }
    
    public static void close(Statement smtm)  {
        try {
            smtm.close();
        } catch (SQLException ex) {
           ex.printStackTrace(System.out);
        }
    }

    public static void close(PreparedStatement smtm)  {
        try {
            smtm.close();
        } catch (SQLException ex) {
           ex.printStackTrace(System.out);
        }
    }

    public static void close(Connection conn)  {
        try {
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
