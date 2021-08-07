package formulario;

public class Control extends Producto {
    
    private int cantidad;
    private double precio;
    
    public Control(){
        
    }
    
    public Control(int _cantidad, double _precio){
        this.setCantidad(_cantidad);
        this.setPrecio(_precio);
    }
    
    public Control(String _codigo, String _nombre, double _precio, int _cantidad){
        this.setCantidad(_cantidad);
        this.setPrecio(_precio);
        this.setNombre(_nombre);
        this.setCodigo(_codigo);
    }
    
    public void setCantidad(int _cantidad){
        this.cantidad = _cantidad;
    }
    
    public void setPrecio(double _precio){
        this.precio = _precio;
    }
    
    public int getCantidad(){
        return this.cantidad;
    }
    
    public double getPrecio(){
        return this.precio;
    }
}
