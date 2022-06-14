import java.util.Scanner;
public class Exdezoito{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        // 18 - Tendo como entrada a altura e o sexo (codificado da seguinte forma: 1: feminino 2: masculino) de uma pessoa, construa um programa que calcule e imprima seu peso ideal, utilizando as seguintes fórmulas:
        // CALCULO
        // H -> (72 * h) - 58
        // M -> (62.1 * h) - 44.7

        int sexo;
        double pesomasc;
        double pesofem;

        System.out.print("Por favor, informe sua altura: ");
        double h = in.nextDouble();


        System.out.print("Por favor informe seu sexo. Digite 1 para feminino e 2 para masculino: ");
        sexo = in.nextInt();

        if(sexo == 1){
            pesofem = (62.1 * h) - 44.7;

            System.out.print("O seu peso ideal e de: " + pesofem + "Kg");
        }
        else if(sexo == 2){
            pesomasc = (72 * h) - 58;
            System.out.print("O seu peso ideal e de: " + pesomasc+ "Kg");
        }

        else{
            System.out.print("Numero não valido!");
        }


    }
}