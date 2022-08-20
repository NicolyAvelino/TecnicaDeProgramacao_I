//Objetivo: Faça um programa na Linguagem Java que apresente os valores de conversão de graus Celsius em Fahrenheit, de 10 em 10 graus, iniciando a contagem em 10 graus Celsius e finalizando em 100 graus Celsius. O programa deve apresentar os valores das duas temperaturas.

public class Main {
	public static void main(String[] args) {
        // declaração de variáveis
        int c,f;
        c = 10;

        // usando while para repretição
        while(c<=100){
            // formula da conversao
            f = (9 * c + 160) / 5;
            
            // saida de dados      
            System.out.printf("%d°C => %d°F\n", c,f);
            
            // contador + 10 
            c += 10;
        }            
	}
}