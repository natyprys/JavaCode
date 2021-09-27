package modulo1;

// Crie um programa em linguagem Java que atenda aos seguintes requisitos: 
 //Exiba um cabeçalho com o título “Bradesco Financiamentos”.
// Exiba um menu com as opções, Crédito Pessoal, Crédito Imobiliário, Crédito Empresarial e Empréstimo Consignado.
// Solicite ao usuário que escolha uma das opções do menu e caso a opção digitada não seja válida, o sistema deve imprimir o menu novamente, solicitar que ele digite a opção e validar a resposta até que uma opção válida seja digitada.
// Ao digitar uma opção válida o sistema deve exibir apenas uma mensagem com o nome do módulo, nenhuma implementação da funcionalidade do módulo será necessária.
//Após exibir a opção correta, o sistema deve perguntar ao usuário se ele deseja voltar ao menu principal (‘V’) ou sair do sistema(‘S’). 
// O sistema deve ler a opção digitada pelo usuário e validar se ele digitou uma das opções válidas, caso contrário deve solicitar que digite novamente até que uma opção válida seja digitada.
// O sistema deve encaminhar o usuário para o menu principal caso a resposta seja ‘V’ e se a opção digitada for ‘S’ o sistema deve encerrar imprimindo uma mensagem de obrigado.

import java.util.Scanner;

public class atividade11 {
    
    static Scanner sc = new Scanner(System.in);
       

    public static void main(String[] args) {
        cabecalho();
        escolha_menu();
    }
    
    static void cabecalho() {
        System.out.println(" -------------------- Bradesco Financiamentos -----------------------");
    }

    static void escolha_menu() {
        byte opcao;
        char continua = 'N';

        do{
        System.out.print("Escolha uma das opções: \n1. Crédito Pessoal \n2.Crédito Imobiliário  \n3.Crédito Empresarial  \n4.Empréstimo Consignado      \n5.Sair \n");
        opcao = Byte.parseByte(sc.nextLine());
       
        switch (opcao) {
            case 1:
                System.out.println("Crédito Pessoal");
                System.out.printf("...........");
                break;

            case 2:
                System.out.println("Crédito Imobiliário");
                System.out.printf("...........");
                break;

            case 3:
                System.out.println("Crédito Empresarial");
                System.out.printf("...........");
                break;

            case 4:
                System.out.println("Empréstimo Consignado");
                System.out.printf("...........");
                break;

            case 5:    
                System.out.println("Aplicação finaliza. Sair");
                break;

            default:
                System.out.println("Opção inválida. Digite novamente");
                break;
        }
        if (opcao > 0 && opcao < 6){
            do{
                System.out.print("Para voltar ao menu digite V e para sair digite S:");
                continua = sc.nextLine().toUpperCase().charAt(0);
                if (continua == 'S'){
                System.out.println("Obrigada");
            
                }
            }while(continua != 'V' && continua != 'S');
        }
    
    }while (opcao < 1 || opcao >5 || continua == 'V');
}
}

