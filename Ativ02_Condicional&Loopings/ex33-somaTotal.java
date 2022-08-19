//Objetivo: Faça um programa na Linguagem Java para apresentar o total da soma obtida dos cem primeiros números inteiros ( 1 + 2 + 3 + 4 + .... 98+ 99+ 100).

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// declaração de variáveis
		int soma = 0;

		// realizando operação
        for (int i=0; i<=100; i++){
            soma += i;
        }
		
		// saida de dados
        System.out.printf("A soma total obtida dos cem primeiros números é: %d.",soma);
	    	
	}
}