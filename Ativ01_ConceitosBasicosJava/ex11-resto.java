// Faça  um programa  na  Linguagem Java que  receba  um  número  e mostre o resto da divisão por 6.
import java.util.Scanner;
public class Main{ 
	public static void main(String[] args) {
        // declaração de variáveis
        double num, res;

        // cria um objeto scanner
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite um número: ");
        num = sc.nextDouble();

        // cálculo da formúla
        res = num % 6;
        
        // saida de dados
        System.out.printf("O resto da divisão de %.1f por 6 é %.1f",num, res);
	}
}