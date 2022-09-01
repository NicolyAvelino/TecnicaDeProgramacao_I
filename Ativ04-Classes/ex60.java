// Objetivo:  No exercício anterior(ex59) crie 2 método
public class Aluno{
    // criação da classe
    // declarando dos atributos
    String RA, nome, end, curso;

    // declarando primeiro método
    public String consultarEnd() {
        System.out.printf("Endereço do aluno %s.",end);
    }

    // declarando segundo método
    public String consultarCurso() {
        System.out.printf("O aluno está matriculado no curso: %s.",curso);
    }
}

// Instanciar
public class Main{
    public static void main(String[] args){
        Aluno aln = new Aluno();

        aln.RA = "12345678909";
        aln.nome = "Maria da Silva";
        aln.end = "Rua Eldorado";
        aln.curso = "DSM";

        System.out.printf("Número do RA: %s\nNome:\n",aln.RA,aln.nome);
    }
}