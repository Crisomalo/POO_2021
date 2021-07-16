package practica_grupo4.helpers;

public class Doctor extends Persona{
    
    private String especialidad;
    private String codigoEmpleado;
    private int experiencia;
    
    public void Doctor(){
        //constructor vacio
    }
    
    public void setEspecialidad(String _especialidad){
        this.especialidad = _especialidad;
    }
    
    public String getEspecialidad(){
        return especialidad;
    }
    
    public void setCodigoEmpleado(String _codigoEmpleado){
        this.codigoEmpleado = _codigoEmpleado;
    }
    
    public String getCodigoEmpleado(){
        return codigoEmpleado;
    }
    
    public void setExperiencia(int _experiencia){
        this.experiencia = _experiencia;
    }
    
    public int getExperiencia(){
        return experiencia;
    }
    
    @Override
    public String getNombre() {
        return "Jose";
    }

    @Override
    public String getApellido() {
        return "Romero";
    }

    @Override
    public String getID() {
        return "123456";
    }

    @Override
    public int getEdad() {
        return 40;
    }
    
}
