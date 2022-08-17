// O cardápio de uma lanchonete é o seguinte:
// Especificação Código Preço
// Cachorro quente 100 1,20
// Bauru simples 101 1,30
// Bauru com ovo 102 1,50
// Hambúrger 103 1,20
// Cheeseburguer 104 1,30
// Refrigerante 105 1,00
// Faça um programa na Linguagem Java que leia o código do item pedido, a
// quantidade e calcule o valor a ser pago por aquele lanche. Considere que a
// cada execução somente será calculado um item.

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// declaração de variável
		int cd, qt;
        double pagar, card;

		// cria um objeto scanner
		Scanner sc = new Scanner(System.in);
 
		// receber o codigo do usuario
        System.out.print("Digite o código do item pedido: ");
		cd = sc.nextInt();

        // receber a quantidade do usuario
        System.out.print("Digite a quantidade que deseja pedir: ");
		qt = sc.nextInt();

		// realizando operação
        card = {
            100: 1.20,
            102: 1.30,
            103: 1,20,
            104: 1,30,
            105: 1,00
        }
        
        // saida de dados
        System.out.printf("O número %d é ímpar.",n1);
        

	}
}

