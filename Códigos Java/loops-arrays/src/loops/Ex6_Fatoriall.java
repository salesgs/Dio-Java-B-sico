package loops;

import java.util.Scanner;

/*
* Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
* */
public class Ex6_Fatoriall {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numero=0;
        int contador = 0;
        int fatorial=0;
        System.out.println("Informe o número");
        numero = scan.nextInt();
        contador =+numero;
        while (contador>1){
            contador--;
             fatorial = numero *contador;
            numero=+fatorial;
        }
        System.out.println("!"+fatorial);

    }
}
