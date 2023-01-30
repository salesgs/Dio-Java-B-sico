package loops;


/*
* Faça um programa que leia um conjunto de dois valores,
* o primeiro representando o nome do aluno e o segundo representando a sua idade.
*
* */

import java.util.Scanner;

public class Ex_1_NomeIdade {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while(true){

            System.out.println("Nome: ");
            nome = scan.next();

            if(nome.equals("0")){
                System.out.println("Fim do programa");
                break;
            }
            System.out.println("Idade: ");
            idade = scan.nextInt();
        }

    }

}
