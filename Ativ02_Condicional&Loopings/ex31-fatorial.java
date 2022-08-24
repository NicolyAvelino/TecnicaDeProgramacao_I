//Objetivo: Faça um programa na Linguagem Java que que receba um número e mostre o fatorial desse número.
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// declaração de variável
		double num,ft;

		// cria um objeto scanner
		Scanner sc = new Scanner(System.in);
 
		// receber valor do usuario
        System.out.print("Digite um número: ");
		num = sc.nextDouble();
		
		ft = num;

		// realizando operação do fatorial
        while(num > 1){
            ft = ft * (num - 1);
			num--;
        }
        // saida de dados
        System.out.printf("O fatorial do número é: %.2f.",ft);
	}
}