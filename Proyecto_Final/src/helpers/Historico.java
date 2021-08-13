package helpers;


public class Historico {
    
    private static int selectorFilaHistorico = 0;
    public static String dataHistorico[][] = new String [100][8];
    
    public void incrementarSelectorHistorico(){
        Historico.selectorFilaHistorico ++;
    }
    
    public int getSelectorFilaHistorico(){
        return Historico.selectorFilaHistorico;
    }
    
    public void setDatoHistorico(int _fila, int _columna, String _dato){
        Historico.dataHistorico[_fila][_columna] = _dato;
    }
    
    public void imprimirMatrizHistorico(){
        for(int i = 0; i < 50; i++){
            for(int j = 0; j <= 7; j++){
                if(dataHistorico[i][j] != null){
                System.out.println(i + " " + j + " : " + dataHistorico[i][j]);
                }
            }
        }
    }
    
}
