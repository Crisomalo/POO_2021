package practica_grupo4.helpers;

public abstract class Persona {
    
    private String nombre;
    private String apellido;
    private String ID;
    private int edad;
    
    public abstract String getNombre();
    public abstract String getApellido();
    public abstract String getID();
    public abstract int getEdad();
    
}
