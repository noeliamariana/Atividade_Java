import java.util.Scanner;
public class Exsete{
    public static void main(String[] args){
    
    Scanner in = new Scanner(System.in);

    // 7. Faça um programa que receba quatro valores informados pelo usuário, 
    // mas informe somente o primeiro, o último e o maior de todos eles 
    // (considere que todos os números informados serão diferentes)

    System.out.print("Por favor, informe o primeiro numero: ");
    double n1 = in.nextDouble();

    System.out.print("Por favor, informe o segundo numero: ");
    double n2 = in.nextDouble();

    System.out.print("Por favor, informe o terceiro numero: ");
    double n3 = in.nextDouble();

    System.out.print("Por favor, informe o quarto numero: ");
    double n4 = in.nextDouble();


   if(n1 != n2 && n1 != n3 && n1 != n4 && n2 != n3 && n2 != n4 && n3 != n4){
  
     if(n1 > n2 && n1 > n3 ){
       if(n1 > n4){
            
            System.out.println("O primeiro numero e: " + n1);

            System.out.println("O ultimo numero informado e: " + n4);

            System.out.print("O numero " + n1+ " e o maior de todos.");
        }
    }

        if(n2 > n1 && n2 > n3 ){
            if(n2 > n4){
            
            System.out.println("O primeiro numero e: " + n1);

            System.out.println("O ultimo numero informado e: " + n4);

            System.out.print("O numero " + n2+ " e o maior de todos.");
        }
    }


        if(n3 > n1 && n3 > n2 ){
           if(n3 > n4){
            
            System.out.println("O primeiro numero e: " + n1);

            System.out.println("O ultimo numero informado e: " + n4);

            System.out.print("O numero " + n1+ " e o maior de todos.");
        }
    }

        if(n4 > n1 && n4 > n2 ){
           if(n4 > n3){
            
            System.out.println("O primeiro numero e: " + n1);

            System.out.println("O ultimo numero informado e: " + n4);

            System.out.print("O numero " + n1+ " e o maior de todos.");
        }
    }
    }

       else{
         System.out.println("Numeros iguais");            
}
    }
 


}