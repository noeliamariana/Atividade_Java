import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Ex22{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Locale localeBR = new Locale("pt","BR");

        // 22. A Loja Remi du Fromage está com uma promoção onde cada capacete artesanal para tartaruga custa R$18.230 e pode ser pago em até 15 vezes sem juros. 
        // Crie um programa onde o usuário possa informar o valor parcelas que deseja pagar e exiba o valor de cada parcela.   

        double capacete = 18230;
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);

        System.out.println("O capacete artesanal para tartaruga pode ser parcelado ate 15x sem juros. ");

        System.out.print("Informe o numero de parcelas que deseja pagar: ");
        int parcelas = in.nextInt();

        double cada_parcela = (capacete / parcelas);

        if(parcelas >=1 && parcelas <= 15){
            System.out.print("O valor de cada parcela sera igual a: " + dinheiro.format(cada_parcela));
        }

        else{
            System.out.print("Pode ser pago em ate 15x sem juros. Informe novamente o valor das parcelas!"); 
        }
 
 
 
    }
}