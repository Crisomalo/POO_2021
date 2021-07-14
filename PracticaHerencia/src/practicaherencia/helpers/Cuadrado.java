
package practicaherencia.helpers;


public class Cuadrado extends Formas{
    
    //Atributos
    private double area;
    
    //Getters y Setters
    public void calcularArea(double _largo , double _ancho){
        this.area = _largo*_ancho;
    }
    
    public double getArea(){
        return area;
    }
    
    public Cuadrado(){
        setColor("Azul");
    }


    @Override
    public String dibujar() {
        return "Cuadrado";
    }
}
