import javax.swing.SwingContainer;

public class Comentario {
    
    public static void main(String []args){


    }

    /*
    @author Gabriel Sales
     *Este método foi elaborao as pressas
     * por isso eu abreviei o nome das variáveis
     * mas olha, ele tem a finalidade de soma ou multiplicar
     * dois números
     */
    public int somaMultiplica(int n, int x,String m){
        int r = 0;
        if(m =="M"){
            r = n * x;
        }else{
            r = n + x;
        }
        return r;
    }
}