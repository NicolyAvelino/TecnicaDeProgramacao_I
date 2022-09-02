// Objetivo:  No exercício anterior(ex59) crie 2 método
public class Aluno{
    // criação da classe
    // declarando dos atributos
    String RA, nome, end, curso;

    // declarando primeiro método
    public String consultarEnd() {
        // System.out.printf("Endereço do aluno %s.",end);
        return end;
    }

    // declarando segundo método
    public String consultarCurso() {
        // System.out.printf("O aluno está matriculado no curso: %s.",curso);
        return curso;
    }
}

// Instanciar
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        // declarando aluno e scanner
        Aluno aln = new Aluno();
        Scanner sc = new Scanner(System.in);

        // entrada de dados
        System.out.print("Ra: ");
        String nr_RA = sc.nextLine();
        aln.RA = nr_RA;

        System.out.print("Nome: ");
        String nm_Aluno = sc.nextLine();
        aln.nome = nm_Aluno;

        System.out.print("Endereço: ");
        String endereco = sc.nextLine();
        aln.end = endereco;

        System.out.print("Curso: ");
        String nm_Curso = sc.nextLine();
        aln.curso = nm_Curso;

        aln.consultarEnd();
        aln.consultarCurso();
        
        System.out.printf("\nNúmero do RA: %s\nNome:\nEndereço: \nNome do Curso: ",aln.RA,aln.nome,aln.consultarEnd(), aln.consultarCurso());
    }
}