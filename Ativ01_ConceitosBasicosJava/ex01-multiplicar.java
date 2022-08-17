// Faça um  programa  na  Linguagem Java que  receba  2  números  e apresente a multiplicação dos dois números.
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// declaração de variáveis
		int n1,n2, mult;

		// cria um objeto scanner
		Scanner sc = new Scanner(System.in);

		// receber valor 1 do usuario
        System.out.print("Digite o 1º numero: ");
		n1 = sc.nextInt();

		// receber valor 2 do usuario
		System.out.print("Digite o 2º numero: ");
        n2 = sc.nextInt();

		// realizando a multiplicação
	    mult = (n1 * n2);
		
	    // saida de dados
	    System.out.printf("%d X %d: %d. ",n1,n2,mult);
	}
}