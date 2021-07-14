
package practicaherencia.helpers;


public abstract class Formas {
    
    //Atributos
    private String color;
    
    //Getters y Setters
    public void setColor(String _color){
        this.color = _color;
    }
    
    public String getColor(){
        return color;
    }
    
    public abstract String dibujar();

    
}
