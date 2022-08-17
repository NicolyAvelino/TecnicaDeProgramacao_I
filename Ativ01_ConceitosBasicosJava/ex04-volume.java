// Faça um programa na Linguagem Java para calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula: VOLUME <--3.14159 * RAIO2 * ALTURA.
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {       
                // declaração de variáveis
                double r, alt, vol;

                // cria um objeto scanner
                Scanner sc = new Scanner(System.in);

                // Entrada de dados
                System.out.print("Digite o valor do raio: ");
                r = sc.nextDouble();

                // Entrada de dados
                System.out.print("Digite o valor da altura: ");
                alt = sc.nextDouble();

                // cálculo da formúla  
                vol = 3.14159 * (r * r) * alt;

                // saida de dados
                System.out.printf("O valor do volume é %.2fcm³", vol);
	}
}