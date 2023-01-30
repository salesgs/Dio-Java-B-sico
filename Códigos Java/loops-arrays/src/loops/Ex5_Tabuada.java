package loops;

import java.util.Scanner;

/*
Desenvolva um gerador de tabuada
capaz de gerar a tabuada de qualquer número inteiro entre 0 a 10
O usuário deve informa de qual número ele deseja ver a tabuada.
* */
public class Ex5_Tabuada {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numero;
        System.out.println("Número inválido, digite novamente ");
        numero = scan.nextInt();

        while (numero>10){
             System.out.println("Número inválido, digite novamente ");
             numero = scan.nextInt();
         }


        for(int i=0;i<=10;i++){
            System.out.println(numero +" x "+ i +" = " + numero * i);
        }
    }
}