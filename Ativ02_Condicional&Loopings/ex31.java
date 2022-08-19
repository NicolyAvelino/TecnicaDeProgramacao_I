//Objetivo: Faça um programa na Linguagem Java que que receba um número e mostre o fatorial desse número.
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// declaração de variável
		int n = 6;
        int ft = n;

		// cria um objeto scanner
		Scanner sc = new Scanner(System.in);
 
		// receber valor do usuario
        // System.out.print("Digite um número: ");
		// n = sc.nextInt();

		// realizando operação
        while(n > 1){
            ft = ft * (n -1);
        }
        // saida de dados
        System.out.printf("O fatorial do número %d é: %d.",n,ft);
	}
}