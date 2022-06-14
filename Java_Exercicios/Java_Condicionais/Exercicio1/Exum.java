import java.util.Scanner;

public class Exum {
    public static void main(String[] args){
     // 1. Escreva um programa em que o usuário informe dois 
     // números utilizando o "prompt". Então escreva em tela o maior deles.
    
     Scanner dani = new Scanner(System.in);

     System.out.println("Por favor, informe o primeiro numero: ");
     int n1 = dani.nextInt();

     System.out.println("Por favor, informe o segundo numero: ");
     int n2 = dani.nextInt();

    if (n1 > n2){

        System.out.println("O numero maior e: " + n1);
    }
    else if( n1 == n2){
        System.out.println("Os numeros sao iguais");
    }
    else{
        System.out.println("O numero maior é: " + n2);
    }


    dani.close();
    }

}