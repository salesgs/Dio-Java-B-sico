package loops;


import java.util.Scanner;

/*
* Faça um programa que leia 5 números
* e informe o maior número
* e a media desses números
*/
public class Ex03_MaiorMedia {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int equal=0;
        int count = 0;
        int media =0;
        int mediaTotal = 0;
        do{
            System.out.println("Número: ");
            numero = scan.nextInt();
            count = count + 1;
            if(numero > equal){
                    equal =+numero;
            }
            media +=numero;
        }while(count < 5);
        mediaTotal = media / count;
        System.out.println("O maior número foi : " + equal);
        System.out.println("Soma : " +media);
        System.out.println("Média dos valores : " +mediaTotal);



    }
}
