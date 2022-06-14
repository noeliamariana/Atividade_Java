import java.util.Scanner;
public class Exum{
    public static void main(String [] args){
        
        // LACO DE REPETICAO

        // 1 - Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou zero.

        Scanner in = new Scanner(System.in);
        System.out.println("Vamos ver se o valor que voce vai informar e positivo, negativo ou zero.");


        System.out.print("Por favor, informe um valor: ");
        int valor = in.nextInt();

        while(valor > 0){
            System.out.print("O valor e POSITIVO");
            break;
        }while(valor < 0){
            System.out.print("O valor e NEGATIVO");
            break;
        }
        while(valor == 0){
            System.out.print("O valor e ZERO");
            break;
        }

    }
}