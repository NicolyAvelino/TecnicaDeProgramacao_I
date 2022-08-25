// Objetivo: Fazer um procedimento para receber as notas da primeira e da segunda prova de cinco alunos. Armazenar as notas da primeira e da segunda prova em vetores distintos. Calcular e escrever a média de cada aluno.
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        // declarar vetores
        double nota1[] = new double[5];
        double nota2[] = new double[5];

		// cria um objeto scanner
		Scanner sc = new Scanner(System.in);

        // fazendo a entrada de dados nota 1
        System.out.printf("Entrada de dados da nota 1º prova: \n");
        for(int i = 0; i < nota1.length; i++){
            nota1[i] = sc.nextDouble(); 
        }
        
        // fazendo a entrada de dados nota 2
        System.out.printf("Entrada de dados da nota 2º prova: \n");
        for(int i = 0; i < nota2.length; i++){
            nota2[i] = sc.nextDouble(); 
        }

        // saida de dados com a media dos alunos  
        for(int i=0; i < nota1.length; i++){
            // coloquei o calculo diretamente no printf
            System.out.printf("A média do %dº aluno: %.2f.\n",i+1,(nota1[i] + nota2[i])/2);
        }	    
	}
}