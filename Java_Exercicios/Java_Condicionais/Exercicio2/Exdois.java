import java.util.Scanner;
public class Exdois{
    public static void main(String[] args){

    // 2. Faça um programa que leia um valor informado pelo usuário e diga se o
    //  valor informado é positivo, negativo ou zero.

        System.out.print("Por favor, informe um valor: ");
        Scanner in = new Scanner(System.in);
        int valor = in.nextInt();

        if(valor > 0){

            System.out.println("O valor informado e positivo " + valor);

        }
        else if(valor == 0){

            System.out.println("O valor informado e um zero: " + valor);
        }
        else{

            System.out.println("O valor informado e negativo " + valor);

        }

    }

}

