import java.util.Scanner;
public class Exdois{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        // LACO DE REPETICAO

        // 2. Faça um programa para ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles. 
        
        int count = 1; 
        int maior = 0; 
        while(count <= 3){
            System.out.print("Por favor informe o valor " + count + ": ");
            int valor = in.nextInt();
            if(valor > maior){
                maior = valor;
            }
            else if(valor == maior){
                System.out.print("Por favor informe outro valor.");
            count --;
            }
            else{
                maior = maior;
            }
            count++;
            
        }
        System.out.print("O maior valor e o: " + maior);
            


    }
}
