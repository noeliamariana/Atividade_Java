import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Exdezesseis{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Locale localeBR = new Locale("pt","BR");


        // 16 - As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia, e R$ 0,25 se forem compradas pelo menos doze. Escreva um programa que leia o número de maçãs compradas (considere que o usuário informará a quantidade), e calcule e escreva o valor total da compra.

        int quantidade;
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);

        System.out.print("Por favor, informe a quantidade de macas que voce ira comprar: " );
        quantidade = in.nextInt();

        if(quantidade < 12){
            
            double total = quantidade * 0.30;
            // System.out.println("Valor Formatado em Moeda: "+dinheiro.format(valorReal));

            System.out.print("O valor total da compra e: " +  dinheiro.format(total));
        }

        else if(quantidade >= 12){
            double totaldesconto = quantidade * 0.25;
            System.out.print("O valor total da compra e: " + dinheiro.format(totaldesconto));        
        }
    }
}