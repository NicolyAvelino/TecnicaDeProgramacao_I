// Objetivo: Fazer um procedimento para receber as notas da primeira e da segunda prova de cinco alunos. Armazenar as notas da primeira e da segunda prova em vetores distintos. Calcular e escrever a média de cada aluno.
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        // declarar 
        double nota1[] = new double[5];
        double nota2[] = new double[5];
        double media;

		// cria um objeto scanner
		Scanner sc = new Scanner(System.in);

        // declarar variável i
        int i = 0;

        // fazendo a entrada de dados nota 1
        System.out.printf("Entrada de Dados nota 1: \n");
        while(i<nota1.length){
            nota1[i++] = sc.nextDouble(); 
        }
        
        // fazendo a entrada de dados nota 2
        System.out.printf("Entrada de Dados nota 2:\n");
        while(i<nota2.length){
            nota2[i++] = sc.nextDouble(); 
        }
        media = (nota1 + nota2)/2;
        // saida de dados usando for coleção A
        System.out.printf("Coleção A: ");
        for(i=0; i < A.length; i++){
            System.out.printf("%d ", A[i]);
        }	
            
	}
}