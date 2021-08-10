package helpers;

public class Administrador extends Usuario{
    
    public Administrador(){
        setNivelAcceso(2);
        setTipoUsuario("Administrador");
        setContraseña("administrador");
    }
    
}
