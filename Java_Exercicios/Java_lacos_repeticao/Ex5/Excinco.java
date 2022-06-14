import java.util.Scanner;
public class Excinco{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        // LACO DE REPETICAO

        // 5 - Escreva um programa para ler as notas das 4 avaliações de um aluno no semestre, calcular e escrever a média do semestre e a seguinte mensagem: PARABÉNS! Você foi aprovado! somente se o aluno foi aprovado (considere 6.0 a média mínima para aprovação e 4 notas informadas).

        int count = 1;
        double soma = 0;

        while(count <= 4 ){
            System.out.print("Por favor informe a nota da avaliacao " + count + ": ");
            double aval = in.nextInt();    
            soma += aval;
            count++;
         }
             double media = soma / 4;
             
             if(media >= 6){
             System.out.print("Sua media e " + media+ ". Voce foi aprovado!");
            
             }
           



    }
}