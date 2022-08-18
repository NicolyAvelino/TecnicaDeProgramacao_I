// Objetivo: Faça  um programa  na  Linguagem Java que  calcule  a  área  da circunferência. Fórmula => (A = π r²)
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
                // declaração de variáveis
                double r, areaC;
                
                // cria um objeto scanner
                Scanner sc = new Scanner(System.in);

                // Entrada de dados
                System.out.print("Digite o valor do raio: ");
                r = sc.nextDouble();
                
                // cálculo da formúla 
                areaC = 3.14159 * (r * r);

                // saida de dados
                System.out.printf("A área da circunferência é %.2fm²", areaC);
	}
}