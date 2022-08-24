//Objetivo:  Criar um vetor A do tipo inteiro de 5 elementos
// – Solicitar os valores para o usuário e inserir no vetor A
// – Criar um vetor B do tipo inteiro
// – Ler o vetor A e para cada elemento lido calcular o fatorial e gravar
// no B
// – Após de todos os elementos do vetor A, mostrar os dois vetores
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        // declarar array
        int A[] = new int[5];
        int B[] = A;
        int ft;

		// cria um objeto scanner
		Scanner sc = new Scanner(System.in);

        // declarar variável i
        int i = 0;

        // fazendo a entrada de dados vetor A
        System.out.printf("Entrada de Dados \n");
        while(i<A.length){
            A[i++] = sc.nextInt(); 
        }
        ft = B;
		// realizando operação fatorial
        // while( > 1){
        //     ft = ft * (num - 1);
		// 	num--;
        // }
        // saida de dados usando for vetor A
        System.out.printf("Coleção A: ");
        for(i=0; i < A.length; i++){
            System.out.printf("%d ", A[i]);
        }	
        // Fatorial
        System.out.printf("\nFatorial: ");
        for(i=0; i < B.length; i++){
            ft = ft * (B[i] - 1);
            System.out.printf("%d ", ft);
        }	    
	}
}