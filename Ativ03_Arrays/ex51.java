// Objetivo: Fazer um procedimento para receber as notas da primeira e da segunda prova de cinco alunos. Armazenar as notas da primeira e da segunda prova em vetores distintos. Calcular e escrever a média de cada aluno.
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        // declarar 
        double nota1[] = new double[3];
        double nota2[] = new double[3];
        double media;

		// cria um objeto scanner
		Scanner sc = new Scanner(System.in);

        // declarar variável i
        int i = 0;

        // fazendo a entrada de dados nota 1
        System.out.printf("Entrada de dados da nota 1º prova: \n");
        while(i<nota1.length){
            nota1[i++] = sc.nextDouble(); 
        }
        
        int c = 0;
        // fazendo a entrada de dados nota 2
        System.out.printf("Entrada de dados da nota 2º prova: \n");
        while(c<nota2.length){
            nota2[i++] = sc.nextDouble(); 
        }

        // saida de dados usando for coleção A
        // System.out.printf("Coleção A: ");
        for(i=0; i < 3; i++){
            media = (nota1[i] + nota2[i])/2;
            System.out.printf("A média do aluno %d: %.2f.\n",i,media);
        }	
            
	}
}