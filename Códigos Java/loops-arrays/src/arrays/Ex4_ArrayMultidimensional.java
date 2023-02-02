package arrays;

import java.util.Random;

/*
* Gere e imprima uma matriz 4x4 com valores aleatórios entre 0 e 9.
* */
public class Ex4_ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int [][] M = new int [4][4];

        for(int i=0;i<M.length;i++){//line
            for(int j=0;j<M.length;j++){  // column
                M[i][j]=random.nextInt(9);
            }
        }
        System.out.println("Matriz: ");
        for (int[] line:M) {
            for (int ElementColumn:line) {
                System.out.print(ElementColumn+ "  ");
            }
            System.out.println();
        }
    }
}
