
package domain;


public class Usuario {
    
    private int idUsusario;
    private String username;
    private String password;

    public Usuario() {
    }

    public Usuario(int idUsusario) {
        this.idUsusario = idUsusario;
    }

    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Usuario(int idUsusario, String username, String password) {
        this.idUsusario = idUsusario;
        this.username = username;
        this.password = password;
    }

    public int getIdUsusario() {
        return idUsusario;
    }

    public void setIdUsusario(int idUsusario) {
        this.idUsusario = idUsusario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsusario=" + idUsusario + ", username=" + username + ", password=" + password + '}';
    }

 
   
    
}
