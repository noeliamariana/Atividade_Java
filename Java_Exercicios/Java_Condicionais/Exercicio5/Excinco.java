import java.util.Scanner;
public class Excinco{
    public static void main(String[] args){

    Scanner in = new Scanner(System.in);

    // 5. Faça um programa que leia dois valores informados pelo usuário
    //  e exiba uma das três mensagens a seguir: ‘Números iguais’, 
    // caso os números sejam iguais ‘Primeiro é maior’, caso o primeiro 
    // seja maior que o segundo; ‘Segundo maior’, caso o segundo seja maior que o primeiro. 


    System.out.print("Por favor, informe o primeiro numero: ");

    int n1 = in.nextInt();

    System.out.print("Por favor, informe o segundo numero: ");

    int n2 = in.nextInt();

    if (n1 == n2){
        System.out.print("Os numeros informados sao iguais!");
    }

    else if(n1 > n2){
        System.out.print("O primeiro numero e maior!");
    }

    else{
    System.out.print("O segundo numero e maior!");
        
    }

    }

}