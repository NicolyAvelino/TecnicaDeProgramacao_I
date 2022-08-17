// Faça um programa na Linguagem Java que leia quatros valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem dizendo que o aluno foi aprovado, se o valor da média escolar for maior ou igual a 7. Se o aluno não foi aprovado, indicar uma mensagem informando esta condição. Apresentar junto das mensagens o valor da média do aluno para qualquer condição.

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// declaração de variáveis
		double n1,n2, n3, n4,media;

		// cria um objeto scanner
		Scanner sc = new Scanner(System.in);

		// receber valor 1 do usuario
        System.out.print("Digite o valor da 1º nota: ");
		n1 = sc.nextDouble();

		// receber valor 2 do usuario
        System.out.print("Digite o valor da 2º nota: ");
        n2 = sc.nextDouble();

        // receber valor 3 do usuario
        System.out.print("Digite o valor da 3º nota: ");
        n3 = sc.nextDouble();

        // receber valor 4 do usuario
        System.out.print("Digite o valor da 4º nota: ");
        n4 = sc.nextDouble();
        
		// realizando operação
        media = (n1 + n2 + n3 + n4) / 4;

        if(media >= 7){
            // saida de dados
	        System.out.printf("Parabéns, você foi aprovado!\nSua média é: %.1f",media);
        } else{
            // saida de dados
	        System.out.printf("Infelizmente, você não foi aprovado!\nSua média é: %.1f",media);
        }
	}
}