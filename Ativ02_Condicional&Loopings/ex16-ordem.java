// Objetivo: Faça um programa na Linguagem Java que leia 3 (três) valores inteiros e apresente os 3 números em ordem crescente.

import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		// declaração de variáveis
		int n1,n2, n3;

		// cria um objeto scanner
		Scanner sc = new Scanner(System.in);

		// receber valor 1 do usuario
        System.out.print("Digite o 1º numero: ");
		n1 = sc.nextInt();

		// receber valor 2 do usuario
		System.out.print("Digite o 2º numero: ");
        n2 = sc.nextInt();

        // receber valor 3 do usuario
		System.out.print("Digite o 3º numero: ");
        n3 = sc.nextInt();

        // realizando operação, colocando os valores em um vetor e usando sort para ordenar
		int[] num = {n1,n2,n3};
		Arrays.sort(num);

		// saida de dados
		System.out.printf(Arrays.toString(num));	    
	}
}