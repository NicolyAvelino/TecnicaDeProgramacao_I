// Objetivo: Faça um programa na Linguagem Java que leia uma temperatura em graus  Celsius  e  apresentá-la  convertida  em  graus  Fahrenheit. A fórmula de conversão é F <--(9 * C + 160) /5, sendo f a temperatura em Fahrenheit e C a temperatura em Celsius.
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
                // declaração de variáveis
                double c, f;
                
                // cria um objeto scanner
                Scanner sc = new Scanner(System.in);

                // receber temperatura
                System.out.print("Digite a temperatura em graus Celsius: ");
                c = sc.nextDouble();
                
                // formula da conversao
                f = (9 * c + 160) / 5;

                // saida de dados      
                System.out.printf("A conversão de %.1f °C para Fahrenheit é de %.1f °F", c,f);
	}
}
