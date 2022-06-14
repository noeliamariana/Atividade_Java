import java.util.Scanner;
public class Exdezenove{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        // 19 - Escreva um programa para ler o número de gols marcados pelo Grêmio e o número de gols marcados pelo Inter em um GRENAL. Escrever o nome do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE.

        int gols;

        System.out.print("Por favor, informe a quantidade de gols do Gremio: ");
        int gremio = in.nextInt(); 

        System.out.print("Por favor, informe a quantidade de gols do Inter: ");
        int inter = in.nextInt();

        if(gremio > inter){
            System.out.print("O vencedor e o Gremio");
        }
        else if(inter > gremio){
            System.out.print("O vencedor e o Gremio");
        }

        else{
            System.out.print("EMPATE");
        }

    }
}
