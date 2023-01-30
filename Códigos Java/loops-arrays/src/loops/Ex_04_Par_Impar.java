package loops;
/*
* Faça um programa que peça N números inteiros
* calcule e mostre a quantidade de números pares
* e a quantidade de números impares
* */

import java.util.Scanner;

public class Ex_04_Par_Impar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantidadeNumero;
        int numero = 0;
        int contadorPar =0;
        int contadorImpar =0;
        System.out.println("Quantidade de números");
        quantidadeNumero = scan.nextInt();

        int count = 0;
        do{
            System.out.println("Informe o número");
            numero = scan.nextInt();
            if(numero%2==0){
               ++contadorPar;
              }else{
                ++contadorImpar;
            }
            count ++;
        }while(count<quantidadeNumero);
        System.out.println("Total de números pares " + contadorPar);
        System.out.println("Total de números impares " + contadorImpar);

    }
}