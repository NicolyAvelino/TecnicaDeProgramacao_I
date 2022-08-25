//Objetivo: Criar uma coleção na linguagem Java com 10 elementos
// – Inserir os elementos de 1 a 10 no vetor
// – Após a inserção, somente após a inserção mostrar o vetor.
// Obs. Não efetuar a leitura de 10 elementos

import java.util.Random;
public class Main {
	public static void main(String[] args) {
        // declarar um vetor 
        int vet[] = new int[10];

        // numeros aleatorios
        Random gr = new Random();

        // fazendo a entrada de dados 
        for(int i = 0; i < vet.length; i++){
            // 26 é ate o valor onde é para pegar os números aleatórios
            vet[i] = gr.nextInt(26); 
        }

        // saida de dados usando for
        System.out.printf("Valores inseridos: ");
        for(int i=0; i < vet.length; i++){
            // saida de dados printf
            System.out.printf("%d ", vet[i]);
        }	    
	}
}