import java.util.Scanner;
public class DiaSemana {

    public static void main(String []args){
        Scanner ler = new Scanner(System.in);
        int diaSemana;


        System.out.println("Informe um número");
        diaSemana = ler.nextInt();

        switch(diaSemana){
            case 1:
                System.out.println("Segunda-Feira");
            break;
            case 2:
                System.out.println("Terça-Feira");
            break;
            case 3:
                System.out.println("Quarta-Feira");
            break;
            case 4:
                System.out.println("Quinta-Feira");
            break;
            case 5:
                System.out.println("Sexta-Feira");
            break;
            
            case 6:
                System.out.println("Sabádo");
             break;
             case 7:
                System.out.println("Domingo");
            break;
            
        }

        
    }


}
