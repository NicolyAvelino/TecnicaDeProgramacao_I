// Faça  um programa  na  Linguagem Javaque  leia  uma  temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius. 
// A formula de conversão é C <--(F -32) * (5/9), sendo f a temperatura em Fahrenheit e C a temperatura em Celsius.
public class ex02 {
	public static void main(String[] args) {
        // C <--(F -32) * (5/9)
        float F = 180;
        float formula;
        
        formula = (F - 32) * (5 / 9);
        
        System.out.println("A conversão de " + F + "°F para grau Celsius é " + formula + "°C");
	}
}
