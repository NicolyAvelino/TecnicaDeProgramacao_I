// Faça um programa na Linguagem Java que leia 3 (três) valores inteiros e apresente os 3 números em ordem crescente.

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

        int list[]= {n1,n2,n3};
        
		// realizando operação
        Arrays.sort(list[]);

        for(i=0; i < list.length;i++ ){
            // saida de dados
	        System.out.printf(list[i]);
        }

	    
	}
}