package arrays;
/*
* Crie um vetor de 6 números inteiros
* e mostre-os na ordem inversa.
* */
public class Ex1_OrdemInversa {

    public static void main(String[] args) {
        int [] vetor = {-5,-6,15,50,8,4};
        int i =0;
        for( i=+(vetor.length - 1);i>=0;i--){
            System.out.println(vetor[i] +" ");
        }

    }
}
