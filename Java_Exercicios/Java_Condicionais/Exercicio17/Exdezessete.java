import java.util.Scanner;
public class Exdezessete{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        // 17 - Escreva um programa que verifique a validade de uma senha fornecida pelo usuário. A senha válida é o número "1234" sem aspas. Devem ser impressas as seguintes mensagens: "ACESSO PERMITIDO" caso a senha seja válida. "ACESSO NEGADO" caso a senha seja inválida.

        int senha;
        
        System.out.print("Por favor, coloque sua senha: ");
        senha = in.nextInt();

        if(senha == 1234){
            System.out.print("ACESSO PERMITIDO");
        }
        else{
            System.out.print("ACESSO NEGADO");
        
        }

    }
}