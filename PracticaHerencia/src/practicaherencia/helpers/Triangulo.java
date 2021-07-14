
package practicaherencia.helpers;


public class Triangulo extends Formas {
    
    //Atributos
    private double angulo;
    private double area;
    
    //Getters y Setters
    public void setAngulo(double _angulo){
        this.angulo = _angulo;
    }
    
    public double getAngulo(){
        return angulo;
    }
    
    public void calcularArea(double _base , double _altura){
        this.area = (_base*_altura)/2;
    }
    
    public double getArea(){
        return area;
    }
   
    public Triangulo(){
        setColor("Verde");
    }


    @Override
    public String dibujar() {
        return "Triangulo";
    }
}
