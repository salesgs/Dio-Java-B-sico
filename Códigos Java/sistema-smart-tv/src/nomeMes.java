import java.util.Scanner;
public class nomeMes {
    
    public static void main(String []args){
        
        int numero;
        Scanner ler = new Scanner(System.in);


        System.out.println("Só é permito números que estejma no intervalo de 1 há 12");
        System.out.println("Digite um número para saber o mês");
        numero = ler.nextInt();



        switch(numero){
            case 1:
                System.out.println("Janeiro");
            break;
            case 2:
                System.out.println("Fevereiro");
            break;
            case 3:
                System.out.println("Março");
            break;
            case 4:
                System.out.println("Abril");
            break;
            case 5:
                System.out.println("Maio");
            break;
            case 6:
                System.out.println("Junho");
            break;
            case 7:
                System.out.println("Julho");
            break;
            case 8:
                System.out.println("Agosto");
            break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
            break;
            case 11:
                System.out.println("Novembro");
            break;
            case 12:
                 System.out.println("Dezembro");
            break;
        }
        
        while(numero==0 || numero>12){
            System.out.println("Erro digite novamente");
            numero = ler.nextInt();                 
            if(numero!=0 || numero<=12){
                
                switch(numero){
                    case 1:
                        System.out.println("Janeiro");
                    break;
                    case 2:
                        System.out.println("Fevereiro");
                    break;
                    case 3:
                        System.out.println("Março");
                    break;
                    case 4:
                        System.out.println("Abril");
                    break;
                    case 5:
                        System.out.println("Maio");
                    break;
                    case 6:
                        System.out.println("Junho");
                    break;
                    case 7:
                        System.out.println("Julho");
                    break;
                    case 8:
                        System.out.println("Agosto");
                    break;
                    case 9:
                        System.out.println("Setembro");
                        break;
                    case 10:
                        System.out.println("Outubro");
                    break;
                    case 11:
                        System.out.println("Novembro");
                    break;
                    case 12:
                         System.out.println("Dezembro");
                    break;
                }
               
            }

            
           
        }



    }
}