// Objetivo: Faça um programa na Linguagem Java que efetue a leitura de cinco números inteiros e identificar o maior e o menor valor. Não execute a ordenação de valores.

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// declaração de variáveis
		int num, maior, menor;

		// cria um objeto scanner
		Scanner sc = new Scanner(System.in);
 
		// receber valor 1 do usuario
        System.out.print("Digite o 1º número: ");
		num = sc.nextInt();

        maior = num;
        menor = num;   

        // realizando operação usando for
        for(int i=2; i<11;i++){
            // receber valores do usuario
            System.out.printf("Digite o %dº número: ",i);
            num = sc.nextInt();
            
            // usando if para condição de maior e menor
            if(num > maior){
                maior = num;
            } else if(num < menor){
                menor = num;
            }
        }
		// saida de dados
	    System.out.printf("O maior número é: %d.\nO menor número é: %d.",maior,menor);
	}
}