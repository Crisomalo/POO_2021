
package crecimientousuarios;

import java.util.Scanner;


public class CrecimientoUsuarios {

    public static void main(String[] args) {
        
        /*Se toma como consideracion un 0.0013333333 como tasa de crecimiento, siendo este una muestra
        diaria dando como resultado el contador en dias
        Para mayor presicion, realizar porcentaje de muestra por hora
        */
        int seleccion,limite = 0;
        
        System.out.print("1- 1500 millones\n2- 2000 millones\nSeleccione el limite de crecimiento: ");
        Scanner teclado = new Scanner(System.in);
        seleccion = teclado.nextInt();
        
        switch(seleccion){
            case 1: limite = 1500000000;break;
            case 2: limite = 2000000000;break;
        }
        
        int usuario_actual = 1000000000, auxiliar ;
        int i, k = 1, j = 0;
        double meses,dias;

        for (i = 0; i >= 0 && k != 0; i++) {
            auxiliar = (int) (usuario_actual * 0.0013333333);
            usuario_actual = usuario_actual + auxiliar;
            if (usuario_actual >= limite) {
                k = 0;
            }
            j++;
        }

        dias = j;
        meses = dias / 30;

        System.out.println("Informacion para limite aproximado : " + limite + " usuarios\n");
        System.out.println(dias + " dias");
        System.out.println(meses + " meses");
        System.out.println(usuario_actual + " usuarios actuales");

    }

}
