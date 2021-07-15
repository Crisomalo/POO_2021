package practica_grupo4;

import practica_grupo4.helpers.Doctor;

public class Practica_Grupo4 {

    public static void main(String[] args) {
        
        //Instancias
        Doctor doctor = new Doctor();
        
        //Establecer informacion
        doctor.setCodigoEmpleado("A12345");
        doctor.setEspecialidad("Automatizacion");
        doctor.setExperiencia(15);
        
        //Obtencion de informacion
        System.out.println(doctor.getNombre() +" "+ doctor.getApellido());
        System.out.println("ID: " + doctor.getID());
        System.out.println("Edad: " + doctor.getEdad());
        System.out.println("Codigo: " + doctor.getCodigoEmpleado());
        System.out.println("Especialidad: " + doctor.getEspecialidad());
        System.out.println("Experiencia: " + doctor.getExperiencia() + " años");
        
    }
    
}
