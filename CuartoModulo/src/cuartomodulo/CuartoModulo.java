
//Parte 1
package cuartomodulo;

import helpers.Futbolista;
import helpers_2.FCBarcelona;
import helpers_2.FCBayern;
import helpers_2.SSCNapoli;


public class CuartoModulo {

    public static void main(String[] args) {
        
        //Parte 1
        //Instancia
        Futbolista futbolista = new Futbolista();
        
        //Establecer los parametros con metodos setters
        futbolista.setEdad(22);
        futbolista.setNombre("Bryan");
        futbolista.setEquipoActual("SSC Napoli");
        
        //Obtencion de parametros mediante metodos getters
        System.out.println("Parte 1\n");
        System.out.println(futbolista.getEdad()+" años");
        System.out.println(futbolista.getNombre());
        System.out.println(futbolista.getEquipoActual());
        
        //Parte 2
        //Instancias
        FCBarcelona barcelona = new FCBarcelona();
        FCBayern bayern = new FCBayern();
        SSCNapoli napoli = new SSCNapoli();
        
        System.out.println("\nParte 2\n");
        System.out.println(barcelona.getEquipo()+"; "+barcelona.getCapitan());
        System.out.println(bayern.getEquipo()+"; "+bayern.getCapitan());
        System.out.println(napoli.getEquipo()+"; "+napoli.getCapitan());
    }
    
}