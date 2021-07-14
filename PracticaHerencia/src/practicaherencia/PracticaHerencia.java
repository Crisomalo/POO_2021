
package practicaherencia;

import practicaherencia.helpers.Circulo;
import practicaherencia.helpers.Cuadrado;
import practicaherencia.helpers.Linea;
import practicaherencia.helpers.Triangulo;


public class PracticaHerencia {


    public static void main(String[] args) {
        
        //Instancias
        Circulo circulo = new Circulo();
        Linea linea = new Linea();
        Triangulo triangulo = new Triangulo();
        Cuadrado cuadrado = new Cuadrado();
        
        //Para circulo
        System.out.println(circulo.dibujar());
        circulo.calcularRadio(100);
        System.out.println("Radio = " + circulo.getRadio());
        System.out.println("Color = " + circulo.getColor() + "\n");
        
        //Para linea
        System.out.println(linea.dibujar());
        linea.setLargo(100);
        System.out.println("Longitud = " + linea.getLargo());
        System.out.println("Color = " + linea.getColor() + "\n");
        
        //Para triangulo
        System.out.println(triangulo.dibujar());
        triangulo.calcularArea(15, 15);
        System.out.println("Area = " + triangulo.getArea());
        triangulo.setAngulo(60);
        System.out.println("Angulo = " + triangulo.getAngulo());
        System.out.println("Color = " + triangulo.getColor() + "\n");
        
        
        //Para cuadrado
        System.out.println(cuadrado.dibujar());
        cuadrado.calcularArea(15, 15);
        System.out.println("Area = " + cuadrado.getArea());
        System.out.println("Color = " + cuadrado.getColor());        

    }
    
}
