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
// Segunda forma
import java.util.Scanner;
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

        // realizando operação usando if else
		if (n3 > n1){
			if (n1 > n2){
			System.out.printf("Ordem crescente dos números: %d, %d, %d.", n2, n1, n3);
			} else if (n2 < n3){
				System.out.printf("Ordem crescente dos números: %d, %d, %d.", n1, n2, n3);
			}
		}
		if (n1 > n2){
			if (n2 > n3){
			System.out.printf("Ordem crescente dos números: %d, %d, %d.", n3, n2, n1);
			} else if (n3 < n1){
				System.out.printf("Ordem crescente dos números: %d, %d, %d.", n2, n3, n1);
			}
		}
		if (n1 < n2){
			if (n3 < n1){
			System.out.printf("Ordem crescente dos números: %d, %d, %d.", n3, n1, n2);
			} else if (n3 < n2){
				System.out.printf("Ordem crescente dos números: %d, %d, %d.", n1, n3, n2);
			}
		}
	}
}
// outra forma
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		// declarando as variaveis
		int n1,n2,n3,aux;
		Scanner sc = new Scanner(System.in);

		// entrada de dados
		System.out.print("Digite o primeiro número: ");
		n1 = sc.nextInt();
		System.out.print("Digite o segundo número: ");
		n2 = sc.nextInt();
		System.out.print("Digite o terceiro número: ");
		n3 = sc.nextInt();

		// processamento
		if(n1>n2){
			aux = n1;
			n1 = n2;
			n2 = aux;
		}
		if(n2>n3){
			aux = n2;
			n2 = n3;
			n3 = n2;
		}
		if(n1>n3){
			aux = n1;
			n1 = n3;
			n3 = n1;
		}
		System.out.println("O primeiro número é: "+ n1 + "\nO segundo número é: "+ n2 + "\nO terceiro número é: "+ n3);
	}
}