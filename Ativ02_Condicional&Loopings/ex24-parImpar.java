//Objetivo: Faça um programa na Linguagem Java que efetue a leitura de um número inteiro e apresentar uma mensagem informando se o número é par ou ímpar.

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// declaração de variável
		int n1;

		// cria um objeto scanner
		Scanner sc = new Scanner(System.in);
 
		// receber valor do usuario
        System.out.print("Digite um número: ");
		n1 = sc.nextInt();

		// realizando operação
        if(n1%2==0){
            // saida de dados
            System.out.printf("O número %d é par.",n1);
        } else{
            // saida de dados
            System.out.printf("O número %d é ímpar.",n1);
        }

	}
}
