package helpers;

public class Usuario {
    
    private int nivelAcceso;
    private String tipoUsuario;
    private String contraseña;
    
    public void setNivelAcceso(int _nivelAcceso){
        this.nivelAcceso = _nivelAcceso;
    }
    
    public void setTipoUsuario(String _tipoUsuario){
        this.tipoUsuario = _tipoUsuario;
    }
    
    public void setContraseña(String _contraseña){
        this.contraseña = _contraseña;
    }
    
    public int getNivelAcceso (){
        return this.nivelAcceso;
    }
    
    public String getTipoUsuario(){
        return this.tipoUsuario;
    }
    
    public String getContraseña(){
        return this.contraseña;
    }
    
}
