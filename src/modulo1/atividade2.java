package modulo1;
import java.util.Scanner;

public class atividade2 {
//Crie um programa em linguagem Java que solicita ao usuário que digite o salário, armazene em uma variável do tipo double e imprima uma mensagem caso o salário seja maior que R$ 1997,58, outra mensagem se o salário for maior que R$5399,99 e outra mensagem se o salário digitado for menor ou igual a zero. 
//Caso o salário seja menor igual a zero o sistema deve solicitar que o usuário digite o salário novamente para então realizar as validações de faixas salariais mais uma vez até que o usuário digite um valor acima de zero.

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Double salario = 0.0;

    do{ 
        System.out.println("Digite o seu salário");
        salario = sc.nextDouble();
        sc.nextLine();  

        if (salario > 0 ){
            if (salario > 0 && salario <= 1997.58){
                System.out.println("Salário patamar 1 (R$0 a R$1997,58)");
            }
            else if (salario > 1997.58 && salario <= 5399.99){
                System.out.println("Salário patamar 2 (R$1997,58 a R$5399,99"); 
            }else{   
            System.out.println("Salário patamar 3 (maior que R$5399,99");
            }
    }else if (salario<= 0){
                System.out.println("O salário informado é invalido");
    }
    }while (salario <= 0);
    sc.close();
}
}

