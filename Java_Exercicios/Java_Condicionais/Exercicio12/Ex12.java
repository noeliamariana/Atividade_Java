import java.util.Scanner;
public class Ex12{
    public static void main(String[] args){

  Scanner ler = new Scanner (System.in);  
  System.out.println("qual o comprimento da pista em metros?");
  int n1 = ler.nextInt();

  System.out.println("quantas voltas a serem percorridas?"); 
  int voltas = ler.nextInt(); 

  System.out.println("Numéro de reabastecimento:");
  int n3 = ler.nextInt(); 

  System.out.println("Qual o consumo de combustivvel?:");
  int n4 = ler.nextInt();

  int n2 = 0;
  int voltas_1 = (n2/n3);
  int reabastecimento =(voltas_1*n1)/1000;

  if(voltas > 2 && voltas == 2);{ 
    System.out.println("tente novamente");         
    }
    if(voltas< 2 && voltas == 2);{ 
      System.out.println("Total de combustivel até o primeiro reabastecimento " +reabastecimento+ " Litros");   
       } 

           }
            }