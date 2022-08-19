// Objetivo: Faça um programa na Linguagem Java que efetue a leitura de cinco números inteiros e identificar o maior e o menor valor. Não execute a ordenação de valores.

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// declaração de variáveis
		int n1,n2, n3, n4, n5, maior, menor;

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

        // receber valor 4 do usuario
        System.out.print("Digite o 4º número: ");
        n4 = sc.nextInt();

        // receber valor 5 do usuario
        System.out.print("Digite o 4º número: ");
        n5 = sc.nextInt();

        // realizando operação
		// if(n1 > n2 && n1 > n3){
		// 	// saida de dados
	    // 	System.out.printf("O maior número é: %d.",n1);
		// } else if(n2 > n1 && n2 > n3){
		// 	// saida de dados
	    // 	System.out.printf("O maior número é: %d.",n2);
		// } else if(n3 > ){

        // } 
        // else{
		// 	// saida de dados
	    // 	System.out.printf("O maior número é: %d.",n3);
		// }

		// // realizando operação
        // // Descobrir o maior
        // m1 = (n1 + n2 + Math.abs(n1-n2))/2;
        // m2 = (m1 + n3 + Math.abs(m1-n3))/2;
        // m3 = (m2 + n4 + Math.abs(m2-n4))/2;
        // m4 = (m3 + n5 + Math.abs(m3-n5))/2;

        // // saida de dados
	    // System.out.printf("O maior número é: %d.",m4);
	}
}