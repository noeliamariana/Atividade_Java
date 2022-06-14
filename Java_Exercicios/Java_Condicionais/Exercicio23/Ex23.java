import java.util.Scanner;
public class Ex23{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
    
        // 23 - Faça um programa em que o usuário informe 20 valores e no final, escreva o maior e o menor valor lido.

        int count = 1;
        int valmaior = 0;
        int valmenor = 0;

        while(count <= 20){
            System.out.print("Informe o valor " + count + ": ");
            int valor = in.nextInt();
          
            if(valor > valmaior){
               valmaior = valor;
            }
            else if( valor < valmenor){
                valmenor = valor;
            }
              count++;
        }
            System.out.println("O numero maior e: " + valmaior);
            System.out.println("O numero menor e: " + valmenor);

        
    }
}

