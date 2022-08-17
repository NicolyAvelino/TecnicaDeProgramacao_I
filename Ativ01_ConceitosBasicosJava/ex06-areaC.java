// Faça  um programa  na  Linguagem Java que  calcule  a  área  da circunferência.
// Fórmula => (A = π r²)
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
              double r, areaC;

              Scanner sc = new Scanner(System.in);
              System.out.print("Digite o valor do raio: ");
              r = sc.nextDouble();
              
              areaC = 3.14159 * (r * r);

              System.out.printf("A área da circunferência é %.2fm²", areaC);
	}
}