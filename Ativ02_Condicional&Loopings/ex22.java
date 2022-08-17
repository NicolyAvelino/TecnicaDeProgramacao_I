// Faça um programa na Linguagem Java que leia 3 números inteiros e mostre o maior deles.

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// declaração de variáveis
		int n1,n2, n3, maior, def;

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
        maior = (n1 + n2 + Math.abs(n1-n2))/2;
        def = (maior + n3 + Math.abs(maior-n3))/2;
        
        // saida de dados
	    System.out.printf("O maior número é: %d.",def);
	}
}