// Objetivo: Faça um programa na Linguagem Java que leia 3 números inteiros e mostre o maior deles.

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// declaração de variáveis
		int n1,n2, n3, maior;

		// cria um objeto scanner
		Scanner sc = new Scanner(System.in);
 
		// receber valor 1 do usuario
        System.out.print("Digite o 1º número: ");
		n1 = sc.nextInt();

		// receber valor 2 do usuario
        System.out.print("Digite o 2º número: ");
        n2 = sc.nextInt();

        // receber valor 3 do usuario
        System.out.print("Digite o 3º número: ");
        n3 = sc.nextInt();

		// realizando operação
		if(n1 > n2 && n1 > n3){
			// saida de dados
	    	System.out.printf("O maior número é: %d.",n1);
		} else if(n2 > n1 && n2 > n3){
			// saida de dados
	    	System.out.printf("O maior número é: %d.",n2);
		} else{
			// saida de dados
	    	System.out.printf("O maior número é: %d.",n3);
		}
	}
}