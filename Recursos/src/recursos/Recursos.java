package recursos;
import java.util.Scanner;

public class Recursos{
    public static void main(String arg[]){
        Recursos recursos = new Recursos();
        String mensaje=recursos.message();
        System.out.println(mensaje);
        
        String mensajeEdad=recursos.ageMessage();
        System.out.println(mensajeEdad);
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresar primer numero a multiplicar:");
        int x=teclado.nextInt();
        System.out.print("Ingresar segundo numero a multiplicar:");
        int y=teclado.nextInt();
        int producto=recursos.product(x,y);
        System.out.println("El resultado de la multiplicacion es :"+producto);
        
        System.out.print("Ingresar limite de la lista:");
        int limite=teclado.nextInt();
        int listaNumerica[]=Recursos.listNumber(limite);
        
        int i;
        for(i=0;i<=limite-1;i++){
            System.out.println(listaNumerica[i]);
        }
        
    }
    public String message(){
        String message = "Programacion Orientada a Objetos 2021";
        return message;
    }
    public String ageMessage(){
        int edad;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la edad:");
        edad = entrada.nextInt();
        String ageMessage;
        if(edad>=21){
            ageMessage="Es mayor de edad";
        }else{
            ageMessage="Es menor de edad";
        }
        
        return ageMessage;
    }
    public int product(int a, int b){
        int product;
        
        product=a*b;
        
        return product;
    }
    public static int[] listNumber(int a){
        int listNumber[] = new int[a+1];
        int i;
        for(i=0;i<=a;i++){
            listNumber[i]=i+1;
        }
        return listNumber;
    }
}