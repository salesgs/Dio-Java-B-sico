package loops;

import java.util.Scanner;

/*
* Faça um progrma que peça uma nota entre 0 e 10
* Mostre uma mensagem caso o valor serja inválido
* E que continue pedidino até que o valor esteja correto
* */
public class Ex_02_Nota {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nota;
        System.out.println("Nota: ");
        nota = scan.nextInt();


        while (nota<0 || nota>10){
            System.out.println("Nota inválida digite novamente ");
            nota = scan.nextInt();
            if(nota>=0 && nota<=10){
                System.out.println("Fim ");
                break;
            }
        }

}
}
