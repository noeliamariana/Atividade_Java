import java.util.Scanner;
public class Exonze{
    public static void main(String[] args){
        
        Scanner ler = new Scanner(System.in);
        // 11 - Um motorista de táxi deseja calcular o rendimento de seu carro na praça.
        // Sabendo-se que o preço do combustível é de R$ 2,90, escreva um programa para ler: a marcação do odômetro (Km) no início do dia, a marcação (Km) no final do dia, o número de litros de combustível gasto e o valor total (R$) recebido dos passageiros. Sabendo que o carro desse taxista roda 14 kilômetros por litro de gasolina, crie um programa que calcule e escreva: a média do consumo em Km/L e o lucro (líquido) do dia.

         System.out.println("Informe a marcacao do odometro no inicio do dia em km");    
         int n1 = ler.nextInt();          
        
         System.out.println("Informe a marcacao do odometro no final do dia em km");      
         int n2 = ler.nextInt();          
        
         System.out.println("Informe o número de litros de combustível gasto no dia");  
         int n3 = ler.nextInt();       
        
         System.out.println("Valor total recebido pelos passageiros");    
         int n4 = ler.nextInt(); 
        
         int mediaComb =(n1-n2)/n3;
         Double nu=(n3* 2.90 )-n4;     
       
         System.out.println("A media e " + mediaComb+ " Km/L. O lucro liquido e " + nu);                     
       
    }
}