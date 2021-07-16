package practica_grupo4;

import practica_grupo4.helpers.Deportista;
import practica_grupo4.helpers.Doctor;

public class Practica_Grupo4 {

    public static void main(String[] args) {
        
        //Instancias
        Doctor doctor = new Doctor();
        Deportista deportista = new Deportista();
        
        //Establecer informacion
        doctor.setCodigoEmpleado("A12345");
        doctor.setEspecialidad("Automatizacion");
        doctor.setExperiencia(15);
        
        deportista.setequipo("Real Madrid");
        deportista.setposicion("Delantero");
        deportista.setnumeroCamiseta(10);
        
        
        //Obtencion de informacion
         System.out.println("Doctor");
        System.out.println(doctor.getNombre() +" "+ doctor.getApellido());
        System.out.println("ID: " + doctor.getID());
        System.out.println("Edad: " + doctor.getEdad());
        System.out.println("Codigo: " + doctor.getCodigoEmpleado());
        System.out.println("Especialidad: " + doctor.getEspecialidad());
        System.out.println("Experiencia: " + doctor.getExperiencia() + " años");
        
        System.out.println("\n");
        
        System.out.println("Deportista");
        System.out.println(deportista.getNombre() +" "+ deportista.getApellido());
        System.out.println("ID: " + deportista.getID());
        System.out.println("Edad: " + deportista.getEdad());
        System.out.println("Equipo: " + deportista.getequipo());
        System.out.println("Posicion: " + deportista.getposicion());
        System.out.println("Numero camiseta: " + deportista.getnumeroCamiseta());
        
        
    }
    
}
