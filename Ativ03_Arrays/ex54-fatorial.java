//Objetivo:  Criar um vetor A do tipo inteiro de 5 elementos
// – Solicitar os valores para o usuário e inserir no vetor A
// – Criar um vetor B do tipo inteiro
// – Ler o vetor A e para cada elemento lido calcular o fatorial e gravar
// no B
// – Após de todos os elementos do vetor A, mostrar os dois vetores
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        // declarar array e variavel
        int A[] = new int[5];
        int ft[] = new int[5];
        int i = 0;

		// cria um objeto scanner
		Scanner sc = new Scanner(System.in);
    
        // fazendo a entrada de dados vetor A
        System.out.printf("Digite os valores: \n");
        while(i<A.length){
            A[i++] = sc.nextInt(); 
        }
        
        // saida de dados usando for vetor A
        System.out.printf("\nValores inseridos: ");
        for(i=0; i < A.length; i++){
            System.out.printf("%d ", A[i]);
        }
		// realizando operação fatorial e fazendo a saída do vetor B
        System.out.printf("\nFatorial: ");
        for(i=0; i < ft.length; i++){
            for(ft[i] = 1; A[i] > 1; A[i]--){
                // calculo fatorial              
                ft[i] = ft[i] * A[i]; 
            }
            // saida de dados
            System.out.printf("%d ", ft[i]);
        }	        
	}
}