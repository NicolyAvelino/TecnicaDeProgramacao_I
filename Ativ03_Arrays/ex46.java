//Objetivo: Criar uma coleção na linguagem Java com 10 elementos
// – Inserir os elementos de 1 a 10 no vetor
// – Após a inserção, somente após a inserção mostrar o vetor.
// Obs. Não efetuar a leitura de 10 elementos

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        // declarar array
        int colecao[] = new int[10];

		// cria um objeto scanner
		Scanner sc = new Scanner(System.in);

        // declarar variável i
        int i = 0;

        // fazendo a entrada de dados 
        System.out.printf("Entrada de Dados \n");
        while(i<colecao.length){
            colecao[i++] = sc.nextInt(); 
        }
        // saida de dados usando for
        System.out.printf("Valores inseridos: ");
        for(i=0; i < colecao.length; i++){
            System.out.printf("%d ", colecao[i]);
        }	    
	}
}