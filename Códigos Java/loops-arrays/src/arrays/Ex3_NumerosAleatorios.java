package arrays;

import javax.swing.plaf.synth.SynthTextAreaUI;
/*
* Faça um algoritimo que leia 20 números inteiros aleátorios entre 0 e 100 armazene em um vetor
* Ao final mostre os números e seu sucessores.
* */
import java.util.Random;
import java.util.Scanner;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int values ;
        int [] numbers = new int[3];
        int count=0;

        do{
            values = random.nextInt();

            while(values<0 || values>100){
                values = random.nextInt();
                 if(values>=0 && values<=100){
                     numbers[count] = values;
                 }
            }
            numbers[count] =values;
            count++;
        }while(count<numbers.length);

        for (int number:numbers) {
           int var =+number;
           System.out.println(number);
              if(number==var){
                  int sucessor = var + 1;
                  System.out.println(sucessor);
              }
        }
    }
}