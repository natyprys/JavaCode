package modulo1;

import java.util.Scanner;

public class a5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //para monitorar a entrada do terminal.
        String linha = sc.nextLine();
        // vai ler uma linha do terminal e eu posso armazenar  numa variavel
        System.out.println("Foi lido:  " + linha);

        String linha2 = sc.nextLine();
        System.out.println("Foi lido 2:  " + linha2);
    
        String linha3 = sc.nextLine();
        System.out.println("Foi lido 3:  " + linha2);
    

        System.out.println("---------------------------------------------");
         int n1 = sc.nextInt();
         System.out.println("Foi lido 4:  "+ n1);

         int n2 = sc.nextInt();
         System.out.println("Foi lido 5:  "+ n2);

         String linha9 = sc.nextLine();
         System.out.println("Foi lido:  " + linha9);
         //da erro
         // ele joga um espaço em branco, use o sc.nextLine() ou converte o inteiro em string
         //int n2= Integer.parseInt(sc.nextInt());
    }
    
}
