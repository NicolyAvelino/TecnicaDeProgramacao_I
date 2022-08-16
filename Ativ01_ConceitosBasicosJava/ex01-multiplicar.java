// Faça um  programa  na  Linguagem Java que  receba  2  números  e apresente a multiplicação dos dois números.
import java.util.Scanner;
public class ex01-multiplicar {
	public static void main(String[] args) {
		int n1,n2, mult;
		Scanner sc = new Scanner(System.in);

		// receber valores do usuario
        System.out.print("Digite o 1º numero: ");
		n1 = sc.nextInt();
		System.out.print("Digite o 2º numero: ");
        n2 = sc.nextInt();
	    mult = (n1 * n2);
	    // saida de dados
	    System.out.printf("%d X %d: %d. ",n1,n2,mult);
	}
}