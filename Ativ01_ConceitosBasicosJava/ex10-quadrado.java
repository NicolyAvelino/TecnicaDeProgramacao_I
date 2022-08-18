// Objetivo: Faça um programa na Linguagem Java para efetuar a leitura de um número inteiro e apresentar o resultado do quadrado desse número
import java.util.Scanner;
public class Main{ 
	public static void main(String[] args) {
                // declaração de variavel
                int num;

                // cria um objeto scanner
                Scanner sc = new Scanner(System.in);

                // Entrada de dados
                System.out.print("Digite um número: ");
                num = sc.nextInt();
                
                // saida de dados
                System.out.printf("O quadrado do número %d é %d.",num, num * num);	
        }
}