import java.util.Scanner;
    public class Exdez1{
        public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        
        // 10. Escreva um programa que calcule a média de quatro números informados pelo usuário, mas somente se esses números forem maiores que 0 e menores que 10.
        
        double soma = 0;
        int count = 1;
        double numero;
        
        while(count <= 4 ){
            System.out.print("Por favor, informe o " + "numero "+ count +": ");
            numero = in.nextDouble();

        if (numero > 0 && numero < 10){   
            soma += numero;
            count++;
            }
            else{
                System.out.print("Por favor, informe outro numero!");
          
            }
        }
            double media = soma / 4;
            System.out.println("A soma dos numeros e igual a: " + soma);
            System.out.println("Sua media e: " + media);
            
            // No final, se a média for maior que cinco o usuário receberá uma mensagem "Você passou no teste". Em qualquer outra situação, ele receberá uma mensagem de "tente novamente" 

            if(media > 5){
                System.out.println("Você passou no teste! Parabéns!");
            }
            else{
                System.out.println("Tente novamente. Tu consegue!");
            }
        }

    }
