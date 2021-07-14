
package ciclos;
import java.util.Scanner;

public class Ciclos {
    public static void main(String[] args) {
       int n,i;
       
       Scanner teclado = new Scanner(System.in);
       System.out.print("Ingrese el numero de columnas:");
       n=teclado.nextInt();
       
        System.out.println("\nN\t10*N\t100*N\t1000*N");
        
        for(i = 1; i <= n; i++){
            System.out.println(i+"\t"+i*10+"\t"+i*100+"\t"+i*1000);
        }
    }
}
