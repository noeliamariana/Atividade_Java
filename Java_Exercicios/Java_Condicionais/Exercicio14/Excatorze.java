import java.util.Scanner;
public class Excatorze{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        // 14 - Acrescente ao exercício anterior a mensagem "Infelizmente, você foi reprovado!" caso a média calculada seja menor que 6.0.

        System.out.println("Vamos calcular a media do semestre de cada aluno.");
        System.out.print("Nome do aluno: ");
        String nome = in.next();

        int count = 1;
        double soma = 0;
        double nota;

        while(count <= 4){
            System.out.print("Por favor coloque a nota da avaliacao " + count + ": ");
            nota = in.nextDouble();
    
            if(nota >= 0 && nota <=10){
                soma += nota;
                count++;
            }
            else{
                System.out.println("Por favor, informe outra nota entre 0 e 10! ");
            }
        }

            double media = soma/4;
            System.out.println("A media semestral de " + nome + " e igual a: " + media);

            if(media >= 6){
                System.out.print("PARABENS! Voce foi aprovado!");
            }
            else{
                System.out.print("Infelizmente, voce foi reprovado!");
            }
    

 

    }
}