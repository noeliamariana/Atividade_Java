import java.util.Scanner;

public class Exquatro{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);


        // 4. Faça um programa que leia  3 valores (considere que não serão informados valores iguais)
        //  e escrever a soma dos 2 maiores. 

        System.out.println("Vamos calcular a soma dos 2 numeros maiores! Por favor, informe tres numeros.");

        System.out.print("Informe o primeiro valor: "); 
        int valor = in.nextInt();

        System.out.print("Informe o segundo valor: ");
        int valordois = in.nextInt();

        System.out.print("Informe o terceiro valor: ");
        int valortres = in.nextInt();


        if(valor == valordois || valor == valortres || valordois == valortres ){
            System.out.print("Os numeros nao podem ser iguais. Por favor, informe numeros diferentes!");
    
        }

        if(valor > valordois && valor > valortres){

            if(valordois > valortres){
                int soma1 = valor + valordois;
            System.out.println("A soma dos dois numero maiores e: " + soma1);
            }
            else{
                int soma2 = valor + valortres;
            System.out.println("A soma dos dois numero maiores e: " + soma2);
            }
        }

        if(valordois > valor && valordois > valortres){
            if(valor > valortres){
                int soma3 = valordois + valor;
                System.out.print("A soma dos dois numero maiores e: " + soma3);
            }
            else{
                int soma4 = valordois + valortres; 
                System.out.print("A soma dos dois numero maiores e: " + soma4);
                }
            }

        if(valortres > valor && valortres > valordois){
            if(valor > valordois){
                int soma5 = valortres + valor;
            System.out.print("A soma dos dois numero maiores e: " + soma5);
        }
            else{
                int soma6 = valortres + valordois;
            System.out.print("A soma dos dois numero maiores e: " + soma6);
            }
        }

        





    }

}