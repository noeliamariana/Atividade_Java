import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;

public class Exquinze{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        // 15 - Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que ela nasceu).

        int nascimento;
        int ano;
        
        System.out.println("Vamos ver se voce vai poder votar este ano.");
        System.out.print("Por favor, informe o ano do seu nascimento: ");
        nascimento = in.nextInt();

        // System.out.print("Por favor, informe o ano atual: ");
        // ano = in.nextInt();

        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int dateYear = calendar.get(Calendar.YEAR);
        // System.out.println(dateYear);

        int voto = dateYear - nascimento;
        
        if(voto >= 16){
            System.out.println("Voce pode votar! Pois tem " + voto + " anos.");
        }        
        else{
            System.out.println("Voce ainda nao pode votar. Pois tem " +voto+ " anos");
        }
    }

}