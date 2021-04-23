
package test;

import java.sql.*;





public class TestMysqlJDBC {
    public static void main(String[] args) {
        //cadena de coneccion a la base de datos mysql se puede decir que es hasta text? despues son los 
        //parametros 
        
        var url="jdbc:mysql://localhost:3306/test?userSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrival=true";
        try {
            //try {
            // Class.forName("com.mysql.cj.jdbc.Driver");//esta linea es requeria para las aplicaciones web
            //} catch (ClassNotFoundException ex) {
            //  ex.printStackTrace(System.out);
            //}
            Connection conexion= DriverManager.getConnection(url, "root", "maxi");
            Statement instruccion= conexion.createStatement();
            var sql= "SELECT id_persona, nombre, apellido, email, telefono  FROM persona";
            ResultSet resultado = instruccion.executeQuery(sql);
            while(resultado.next()){
                System.out.print(" Id Persona: "+ resultado.getInt("id_persona"));
                System.out.print(" Nombre: "+resultado.getString("nombre"));
                System.out.print(" Apellido: "+resultado.getString("apellido"));
                System.out.print(" email: "+resultado.getString("email"));
                System.out.print(" Telefono: "+resultado.getString("telefono"));
                System.out.println(" ");
            }
            resultado.close();
            instruccion.close();
            conexion.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
