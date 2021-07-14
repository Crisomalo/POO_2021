
package practicaherencia.helpers;


public class Circulo extends Formas{
    
    //Atributos
    private double radio;

    //Getters y Setters
    public void calcularRadio(int _diametro){
        this.radio = _diametro/2;
    }
    
    public double getRadio(){
        return radio;
    }
    
    public Circulo(){
        setColor("Rojo");
    }


    @Override
    public String dibujar() {
        return "Circulo";
    }
}
