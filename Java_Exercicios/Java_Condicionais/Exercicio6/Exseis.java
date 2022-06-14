import java.util.Scanner;
public class Exseis{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
    // 6.  Faça um programa que leia 10 valores informados pelo usuário,
    //  calcule, exiba os números informados e escreva a média aritmética desses valores lidos.


    System.out.print("Por favor, informe o primeiro numero: ");

    double n1 = in.nextDouble();

    System.out.print("Por favor, informe o segundo numero: ");

    double n2 = in.nextDouble();


    System.out.print("Por favor, informe o terceiro numero: ");

    double n3 = in.nextDouble();

    System.out.print("Por favor, informe o quarto numero: ");

    double n4 = in.nextDouble();

    System.out.print("Por favor, informe o quinto numero: ");

    double n5 = in.nextDouble();

    System.out.print("Por favor, informe o sexto numero: ");

    double n6 = in.nextDouble();

    System.out.print("Por favor, informe o setimo numero: ");

    double n7 = in.nextDouble();

    System.out.print("Por favor, informe o oitavo numero: ");

    double n8 = in.nextDouble();
    System.out.print("Por favor, informe o nono numero: ");

    double n9 = in.nextDouble();

    System.out.print("Por favor, informe o decimo numero: ");

    double n10 = in.nextDouble();

    System.out.println("Os numero informados foram: " + n1  + ","+ n2 + ","+ n3 + ","+ n4 + ","+ n5 + "," + n6 + "," + n7+ "," + n8+ "," + n9+ "," + n10);

    double soma = n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10;
    double media = soma / 10;


    System.out.println("A media aritmetica desses valores e igual a: " + media);

    }




}