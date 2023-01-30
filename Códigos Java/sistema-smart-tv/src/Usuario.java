public class Usuario {
    public static void main(String[] args) throws Exception { //inicializa a aplicação
    
        //new ocorrence class
        Contador contador = new Contador();

        contador.incrementar();
        contador.incrementar();
        contador.incrementar();


        System.out.println("Números de intens: " +contador.incrementar());

        
        System.out.println(contador.zerar());
    }
}
