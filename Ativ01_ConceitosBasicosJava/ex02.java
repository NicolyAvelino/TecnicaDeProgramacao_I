// Faça um programa na Linguagem Java que leia uma temperatura em graus  Celsius  e  apresentá-la  convertida  em  graus  Fahrenheit. 
// A fórmula de conversão é F <--(9 * C + 160) /5, sendo f a temperatura em Fahrenheit e C a temperatura em Celsius.
public class ex02 {
	public static void main(String[] args) {
       // (9 * C + 160) /5
       int c = 40;
       float formula;
       
       formula = (9 * c + 160) / 5;
       
       System.out.println("A conversão de " + c + "°C para Fahrenheit é de " + formula + "°F");
	}
}
