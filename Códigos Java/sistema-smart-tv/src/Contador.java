public class Contador {
    int contador=0;

    public int zerar(){
       return this.contador = 0;
    }

    public int incrementar(){
        contador++;
        return this.contador ;
        
    }

    public int valorContadorAtual(){
      return this.contador;
    }
}
