import java.util.Scanner;
public class Ex21{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        // 21 - Escreva um programa que leia as notas das duas avaliações normais e a nota da avaliação optativa. 
        // Calcular a média do semestre considerando que a prova optativa substitui a nota mais baixa entre as duas primeiras avaliações.
        //  Escrever a média e mensagens que indiquem se o aluno foi aprovado, reprovado ou está em exame, de acordo com as informações abaixo: 
        // Aprovado: média >= 6.0
        // Reprovado: media < 3.0
        // Exame: media >= 3.0 e <6.0

        double av1;
        double av2;
        double opta;


        System.out.print("Informe a nota da primeira avaliacao: ");
        av1 = in.nextDouble();
        System.out.print("Informe a nota da segunda avaliacao: ");
        av2 = in.nextDouble();
        System.out.print("Informe a nota da avaliacao optativa: ");
        opta = in.nextDouble();

        if(av1 > av2 ){
            av2 = opta;
        }
        else{
            av1 = opta;
        }
        double media = (av1 + av2)/2;
        System.out.println("A media e igual a: " + media);
        
        if(media >= 6){
            System.out.print("Aprovado");
        }
        else if(media < 3){
            System.out.print("Reprovado");
        }
        else if(media >= 3 && media < 6){
            System.out.print("Exame");
        }
    }
}
