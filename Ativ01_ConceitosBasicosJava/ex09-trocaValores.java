// Faça um programa na Linguagem Java para ler dois valores inteiros para as variáveis A e B e efetuar a troca dos valores de forma que a variável A passe a possuir o valor da variável B e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados.
import java.util.Scanner;
public class Main{ 
	public static void main(String[] args) {
        // declaração de variáveis
        int n1,n2,aux;

        // cria um objeto scanner
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o 1º número: ");
        n1 = sc.nextInt();

        // Entrada de dados
        System.out.print("Digite o 2º número: ");
        n2 = sc.nextInt();

        // cálculo
        aux = n1;
        n1 = n2;
        n2 = aux;

        // saida de dados
        System.out.printf("Valores %d e %d.",n1,n2);	
    }
}