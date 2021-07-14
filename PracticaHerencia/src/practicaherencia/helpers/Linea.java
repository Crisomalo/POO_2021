
package practicaherencia.helpers;


public class Linea extends Formas{
    
    //Atributos
    private double largo;
    
    //Getters y Setters
    public void setLargo(double _largo){
        this.largo = _largo;
    }
    
    public double getLargo(){
        return largo;
    }
    
    public Linea(){
        setColor("Negro");
    }


    @Override
    public String dibujar() {
        return "Linea";
    }
}
