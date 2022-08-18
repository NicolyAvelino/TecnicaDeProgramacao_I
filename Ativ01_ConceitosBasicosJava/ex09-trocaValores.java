// Objetivo: Faça um programa na Linguagem Java para ler dois valores inteiros para as variáveis A e B e efetuar a troca dos valores de forma que a variável A passe a possuir o valor da variável B e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados.
import java.util.Scanner;
public class Main{ 
	public static void main(String[] args) {
        // declaração de variáveis
        int A,B,aux;

        // cria um objeto scanner
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o valor de A: ");
        A = sc.nextInt();

        // Entrada de dados
        System.out.print("Digite o valor de B: ");
        B = sc.nextInt();

        // cálculo usando a variavel auxiliar
        aux = A;
        A = B;
        B = aux;

        // saida de dados
        System.out.printf("Valores A = %d; B = %d.",A,B);	
    }
}