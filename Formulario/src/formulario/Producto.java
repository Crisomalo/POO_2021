package formulario;

public class Producto {
    
    private String nombre;
    private String codigo;
    
    public Producto(){
        
    }
    
    public Producto(String _nombre, String _codigo){
        this.setNombre(_nombre);
        this.setCodigo(_codigo);
    }
    
    public void setNombre(String _nombre){
        this.nombre = _nombre;
    }
    
    public void setCodigo(String _codigo){
        this.codigo = _codigo;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getCodigo(){
        return this.codigo;
    }
}