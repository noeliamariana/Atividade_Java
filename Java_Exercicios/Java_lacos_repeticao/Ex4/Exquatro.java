import java.util.Scanner;
public class Exquatro{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
         // LACO DE REPETICAO

        //  4.  Faça um programa que leia 10 valores informados pelo usuário, calcule, exiba os números informados e escreva a média aritmética desses valores lidos.
    

        int valor;
        int count = 1;
        double soma = 0;
        while(count <= 10 ){
            System.out.print("Por favor informe o valor " + count + ": ");
            valor = in.nextInt();
            
           soma += valor;
            count++;
         }

          double media = soma / 10;
          System.out.print("A media dos valores informados e: " + media);
    }
}