public class SmartTv {
 
    boolean ligada = false;
    int canal=1;
    int volume=25;


    public void mudarCanal(int novoCanal){//variável de método
        canal = novoCanal;                //retorna valor para varíavel de classe              
    }
    public void aumentarCanal(){
        canal++;
    }
 
    public void diminuirCanal(){
        canal--;
    }


    public void diminuirVolume(){
        volume--;
    }
 
 
    public void aumentarVolume(){
        volume++;
    }
    
    public void ligar(){
        ligada =true;
    }

    public void desligar(){
        ligada=false;
    }

}