/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_grupo4.helpers;

/**
 *
 * @author horair
 */
public class Deportista extends Persona {
    
    private String equipo;
    private String posicion;
    private int numeroCamiseta;
    
    public void Doctor(){
        //constructor vacio
    }
    
    public void setequipo(String _equipo){
        this.equipo = _equipo;
    }
    
    public String getequipo(){
        return equipo;
    }
    
    public void setposicion(String _posicion){
        this.posicion = _posicion;
    }
    
    public String getposicion(){
        return posicion;
    }
    
    public void setnumeroCamiseta(int _numeroCamiseta){
        this.numeroCamiseta = _numeroCamiseta;
    }
    
    public int getnumeroCamiseta(){
        return numeroCamiseta;
    }
    
    @Override
    public String getNombre() {
        return "Horair";
    }

    @Override
    public String getApellido() {
        return "Ponce";
    }

    @Override
    public String getID() {
        return "242368";
    }

    @Override
    public int getEdad() {
        return 24;
    }
    
}
