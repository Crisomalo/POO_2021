
package tareaprimera;

import java.util.Scanner;

public class TareaPrimera {

    public static void main(String[] args) {
        //Asignacion 1
        System.out.println("\nAsignacion #1\n");
        System.out.println("Hola soy de la clase de Programacion Orientada a Objetos\n");
        //Asignacion 2
        System.out.println("\nAsignacion #2\n");
        float x, y;
        x = 1;
        y = 2;

        System.out.println("x + y = " + (x + y));
        System.out.println("La suma es igual a: "+ (x+y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        //Asignacion 3
        System.out.println("\nAsignacion #3\n");
        int M = 6, T = 1, K = -10;
        boolean estado;

        if (M > T) {
            estado = true;
        } else {
            estado = false;
        }
        System.out.println("\nM>T = " + estado);

        if (T / K == -5) {
            estado = true;
        } else {
            estado = false;
        }
        System.out.println("T/K = " + estado);

        if (M + T == 7 || M - T == 5) {
            estado = true;
        } else {
            estado = false;
        }
        System.out.println("M+T==7 || M-T==5 = " + estado);
        //Asignacion 4
        System.out.println("\nAsignacion #4\n");
        int i;
        String[] ciudades = new String[20];
        Scanner teclado = new Scanner(System.in);

        for (i = 0; i < 20; i++) {
            System.out.print("Ingrese la ciudad " + (i + 1) + ": ");
            ciudades[i] = teclado.next();
        }
        for (i = 0; i < 20; i++) {
            System.out.println("La ciudad " + (i + 1) + " es :" + ciudades[i]);
        }
        //Asignacion 5
        int n = 0;
        System.out.println("\nAsignacion #5\n");

        for (i = 2; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(" " + i);
            }
            if (n == 50) {
                System.out.print("\n");
                n = 0;
            }
            n++;
        }
        System.out.print("\n");
    }

}
