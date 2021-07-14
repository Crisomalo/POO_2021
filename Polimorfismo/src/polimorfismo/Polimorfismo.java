
package polimorfismo;

import polimorfismo.helpers.Famas;
import polimorfismo.helpers.Galil;

public class Polimorfismo {


    public static void main(String[] args) {
    
        Famas famas = new Famas();
        Galil galil = new Galil();
        
        System.out.println("Daño de disparo Famas");
        System.out.println(famas.disparar());
        System.out.println("\nDaño de disparo Galil");
        System.out.println(galil.disparar());
        
    }
    
}
