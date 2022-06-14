//  11,12
import java.util.Scanner;
public class Ex25{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // 25 - Uma micro calculadora
        // Escreva um programa para ler 2 valores inteiros informados pelo usuário e uma das seguintes operações a serem
        // executadas (codificada da seguinte forma: 1.Adição, 2.Subtração, 3.Divisão, 4.Multiplicação).
        // O programa deve calcular e escrever o resultado dessa operação sobre os dois valores lidos. Observação: Considere
        // que só serão lidos os valores 1, 2, 3 ou 4 para as operações

        System.out.print("Informe o primeiro valor: ");
        double valo1 = in.nextDouble();
        System.out.print("Informe o segundo valor: ");
        double valo2 = in.nextDouble();

        System.out.println("Coloque: 1.Adicao, 2.Subtracao, 3.Divisao, 4.Multiplicacao");
        System.out.print("Escolha a operacao que deseja realizar: ");
        int operacao = in.nextInt();

        if(operacao == 1){
            double soma = valo1 + valo2;
            System.out.print("A soma dos valores e igual a: " + soma);
        }       
        
        else if(operacao == 2){
            double subtracao = valo1 - valo2;
            System.out.print("A subtracao dos valores e igual a " + subtracao);
        } 
        
        else if(operacao == 3){
            double divisao = valo1 / valo2;
            System.out.print("A divisao dos valores e igual a " + divisao);
        }      
        
        else if(operacao == 4){
            double mult = valo1 * valo2;
            System.out.print("A multiplicacao dos valores e igual a " + mult);
        }      

    
    }
}