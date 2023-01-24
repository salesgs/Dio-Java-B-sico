public class  TiposVariaveis {
    public static void main(String[] args) throws Exception {


        double salarioMinimo =2500; 
 
        short numeroCurto =1;
        int numeroNormal = numeroCurto;//um inteior pode armazenar um short
        short numeroCurto2 = (short) numeroNormal;//um short não pode armazenar um inteiro através do casting
    
        int numero =10;
        System.out.println(numero);

        final double VALOR_DE_PI=3.14;

    }
}