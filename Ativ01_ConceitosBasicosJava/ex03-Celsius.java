// Faça  um programa  na  Linguagem Javaque  leia  uma  temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius. 
// A formula de conversão é C <--(F -32) * (5/9), sendo f a temperatura em Fahrenheit e C a temperatura em Celsius.
import java.util.Scanner;
public class ex03-Celsius {
	public static void main(String[] args) {
              double F, formula;
              Scanner sc = new Scanner(System.in);
              System.out.print("Digite a temperatura em graus Fahrenheit: ");
              F = sc.nextDouble();
              // C <--(F -32) * (5/9)
              formula = (F - 32) * 5/9;
              System.out.printf("A conversão de %.1f°F para grau Celsius é %.3f°C",F,formula);
	}
}