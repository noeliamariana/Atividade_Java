import java.util.Scanner;
public class Extres{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        // 3. Faça um programa para ler 3 valores (considere que não serão informados valores iguais)
        //  e escrever o maior deles. 

        System.out.print("Informe o primeiro valor: "); 
        int valor = in.nextInt();

        System.out.print("Informe o segundo valor: ");
        int valordois = in.nextInt();

        System.out.print("Informe o terceiro valor: ");
        int valortres = in.nextInt();


        if(valor > valordois && valor > valortres){
            System.out.print("O numero maior e o: " + valor);
        }

        else if(valordois > valor && valordois > valortres){
            System.out.print("O numero maior e o: " + valordois);
        }

        else if(valortres > valor && valortres > valordois){
            System.out.print("O numero maior e o: " + valortres);
        }

        else{
            System.out.print("Os numeros nao podem ser iguais. Por favor, informe numeros diferentes");
 
    }

}}