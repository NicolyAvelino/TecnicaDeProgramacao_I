//Objetivo:  Criar uma coleção “A” na linguagem Java com 10 elementos
// – Inserir os elementos de 1 a 10 na coleção
// – Criar uma outra coleção B que conterá o elemento da coleção A
// multiplicado por 2
// – Mostrar as duas coleções
// Obs. Não efetuar a leitura de 10 elemento

import java.util.Random;
public class Main {
	public static void main(String[] args) {
        // declarar array
        int A[] = new int[10];
        int B[] = A;

		// numeros aleatorios
        Random gr = new Random();

        // fazendo a entrada de dados coleção A
        for(int i = 0; i < A.length; i++){
            // 26 é ate o valor onde é para pegar os números aleatórios
            A[i] = gr.nextInt(26); 
        }
        
        // saida de dados usando for coleção A
        System.out.printf("Coleção A: ");
        for(int i=0; i < A.length; i++){
            // saida de dados
            System.out.printf("%d ", A[i]);
        }	

        // colecao B (elementos coleção A multiplicado por 2)
        System.out.printf("\nColeção B: ");
        for(int i=0; i < B.length; i++){
            // saida de dados
            System.out.printf("%d ", A[i]*2);
        }	    
	}
}