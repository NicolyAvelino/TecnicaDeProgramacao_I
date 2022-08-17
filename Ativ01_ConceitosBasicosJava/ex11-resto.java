// Faça  um programa  na  Linguagem Java que  receba  um  número  e mostre o resto da divisão por 6.
import java.util.Scanner;
public class Main{ 
	public static void main(String[] args) {
                double num, res;
                Scanner sc = new Scanner(System.in);

                System.out.print("Digite um número: ");
                num = sc.nextDouble();

                res = num % 6;
                System.out.printf("O resto da divisão de %.1f por 6 é %.1f",num, res);
	}
}