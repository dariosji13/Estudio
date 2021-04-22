
package domain;


public class UsuarioDTO {
    
    private int idUsusario;
    private String username;
    private String password;

    public UsuarioDTO() {
    }

    public UsuarioDTO(int idUsusario) {
        this.idUsusario = idUsusario;
    }

    public UsuarioDTO(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public UsuarioDTO(int idUsusario, String username, String password) {
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
