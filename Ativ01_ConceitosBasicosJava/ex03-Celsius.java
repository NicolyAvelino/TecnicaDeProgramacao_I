// Objetivo: Faça  um programa  na  Linguagem Java que leia  uma  temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius. A formula de conversão é C <--(F -32) * (5/9), sendo f a temperatura em Fahrenheit e C a temperatura em Celsius.
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
                // declaração de variáveis
                double F, formula;

                // cria um objeto scanner
                Scanner sc = new Scanner(System.in);

                // Entrada de dados
                System.out.print("Digite a temperatura em graus Fahrenheit: ");
                F = sc.nextDouble();

                // cálculo da formúla C <--(F -32) * (5/9)
                formula = (F - 32) * 5/9;

                // saida de dados
                System.out.printf("A conversão de %.1f°F para grau Celsius é %.1f°C",F,formula);
	}
}