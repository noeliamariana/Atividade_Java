import java.util.Scanner;
public class Exvinte{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        // 20 - Escreva um programa para ler o número de lados de um polígono regular e a medida do lado (em cm).
        // Calcular e imprimir o seguinte: 
        // Se o número de lados for igual a 3 escrever TRIÂNGULO e o valor do seu perímetro. 
        // Se o número de lados for igual a 4 escrever QUADRADO e o valor da sua área. 
        // Se o número de lados for igual a 5 escrever PENTÁGONO. 

        // Observação: Considere que o usuário só informará os valores 3, 4 ou 5. 

        // Caso o número de lados seja inferior a 3 escrever NÃO É UM POLÍGONO. 
        // Caso o número de lados seja superior a 5 escrever POLÍGONO NÃO IDENTIFICADO.



    int triangulo = 3;
    int quadrado = 4;
    int pentagono = 5;

    System.out.print("Por favor, informe o numero de lados do poligono: ");
    int lados = in.nextInt();
    System.out.print("Informe a medida dos lados: ");
    int medida = in.nextInt();

    int perimetro = medida + medida + medida;
    int area = medida * medida;

    if(lados < 3 ){
    System.out.println("NAO E UM POLIGONO");
        
    }
    if(lados > 5){
    System.out.println("POLIGONO NAO IDENTIFICADO!");
    
    }

   else if(lados == 3){
        System.out.println("TRIANGULO");
        System.out.print("O perimetro e igual a " + perimetro);
        
    }

    else if(lados == 4){
        System.out.println("QUADRADO");
        
        System.out.print("A area e igual a " + area);
   
    }
    else if(lados == 5){
        System.out.print("PENTAGONO");
   
    }
    
    }
}