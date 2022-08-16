// Faça um programa na Linguagem Java para calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula: VOLUME <--3.14159 * RAIO2 * ALTURA.
import java.util.Scanner;
public class ex04-volume {
	public static void main(String[] args) {       
              double r, alt, vol;
              Scanner sc = new Scanner(System.in);
              System.out.print("Digite o valor do raio: ");
              r = sc.nextDouble();
              System.out.print("Digite o valor da altura: ");
              alt = sc.nextDouble();
              vol = 3.14159 * (r * r) * alt;
              
              System.out.printf("O valor do volume é %.2fcm³", vol);
	}
}