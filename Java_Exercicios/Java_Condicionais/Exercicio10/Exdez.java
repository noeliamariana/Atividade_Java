import java.util.Scanner;
    public class Exdez{
        public static void main(String[]args){
        Scanner in = new Scanner(System.in);
// 10. Escreva um programa que calcule a média de quatro números informados pelo usuário, mas somente se esses números forem maiores que 0 e menores que 10. No final, se a média for maior que cinco o usuário receberá uma mensagem "Você passou no teste". Em qualquer outra situação, ele receberá uma mensagem de "tente novamente" 

        int soma = 0;
        int count = 1;
        int numero = 0;
        
        while(count <= 4 ){
        System.out.print("Por favor, informe o " + "numero "+ count +": ");
        numero = in.nextInt();

        if (numero > 0 && numero < 10){   
            soma += numero;
            }
        else{
            System.out.print("Por favor, informe outro numero " + count +": ");    
            numero = in.nextInt();      
            count --;
        }

        count++;
        }
        System.out.println(soma /4);    

        // Código que não deu certo :( [Mas o outro deu :)]
        }
    }
