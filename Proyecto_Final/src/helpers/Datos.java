package helpers;

public class Datos {
    
    private static int selectorFila = 0;
    public static String data[][] = new String [50][9];
    
    public void incrementarSelector(){
        Datos.selectorFila ++;
    }
    
    public int getSelectorFila(){
        return Datos.selectorFila;
    }
    
    public void setDato(int _fila, int _columna, String _dato){
        Datos.data[_fila][_columna] = _dato;
    }
    
    public void imprimirMatriz(){
        for(int i = 0; i < 50; i++){
            for(int j = 0; j <= 7; j++){
                if(Datos.data[i][j] != null){
                System.out.println(i + " " + j + " : " + data[i][j]);
                }
            }
        }
    }
    
}
