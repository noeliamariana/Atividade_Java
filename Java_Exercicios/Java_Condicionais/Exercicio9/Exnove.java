import java.util.Scanner;
    public class Exnove{
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
    // 9. Faça um programa que leia 6 números que o usuário vai informar. Todos os 
    // números lidos com valor inferior a 72 devem ser somados. Escreva o valor 
    // final da soma efetuada e também todos valores que o usuário informou.  

    System.out.print("Por favor, informe o primeiro numero: ");
    int n1 = in.nextInt();

    System.out.print("Por favor, informe o segundo numero: ");
    int n2 = in.nextInt();

    System.out.print("Por favor, informe o terceiro numero: ");
    int n3 = in.nextInt();

    System.out.print("Por favor, informe o quarto numero: ");
    int n4 = in.nextInt();

    System.out.print("Por favor, informe o quinto numero: ");
    int n5 = in.nextInt();

    System.out.print("Por favor, informe o sexto numero: ");
    int n6 = in.nextInt();

    int numeros = 0;
        
    if(n1 < 72){
        numeros += n1;       
    if(n2 < 72){
        numeros += n2; 
    if(n3 < 72){
        numeros += n3; 
    if(n4 < 72){
        numeros += n4; 
        
    if(n5 < 72){
        numeros += n5; 
    if(n6 < 72){
        numeros += n6; 
    }}}}}}
    System.out.println("A soma dos numeros menores que 72 sao: " + numeros);
    System.out.print("Os numeros informados sao: " + n1 + "," + n2+ "," + n3+ "," + n4+ "," + n5+ "," + n6);
    }
        
}