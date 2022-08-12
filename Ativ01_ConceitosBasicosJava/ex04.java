// Faça um programa na Linguagem Java para calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula: VOLUME <--3.14159 * RAIO2 * ALTURA.
public class ex04 {
	public static void main(String[] args) {       
       double raio = 5;
       double altura = 60;
       double pi = 3.14159;
       
       double volume = pi * (raio * raio) * altura;
       
       System.out.println("O valor do volume é : "+ volume);
	}
}