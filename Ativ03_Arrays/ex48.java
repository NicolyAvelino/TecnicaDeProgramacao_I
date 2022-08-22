//Objetivo:  Criar uma coleção “A” na linguagem Java com 10 elementos
// – Inserir os elementos de 1 a 10 na coleção
// – Criar uma outra coleção B que conterá o elemento da coleção A
// multiplicado por 2
// – Mostrar as duas coleções
// Obs. Não efetuar a leitura de 10 elemento

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        // declarar array
        int A[] = new int[10];
        int B[] = A;

		// cria um objeto scanner
		Scanner sc = new Scanner(System.in);

        // declarar variável i
        int i = 0;

        // fazendo a entrada de dados coleção A
        System.out.printf("Entrada de Dados \n");
        while(i<A.length){
            A[i++] = sc.nextInt(); 
        }
        // saida de dados usando for coleção A
        System.out.printf("Coleção A: ");
        for(i=0; i < A.length; i++){
            System.out.printf("%d ", A[i]);
        }	
        // colecao B
        System.out.printf("\nColeção B: ");
        for(i=0; i < B.length; i++){
            System.out.printf("%d ", A[i]*2);
        }	    
	}
}