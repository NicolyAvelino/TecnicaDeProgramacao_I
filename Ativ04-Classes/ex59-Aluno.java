// Objetivo: Fazer um programa para ler os dados de um Aluno:
// • RA;
// • Nome;
// • Endereço;
// • Curso.
// Em seguida, mostrar a tela todos os atributos. Utilize classe
public class Aluno{
    // criação da classe
    // declarando dos atributos
    String RA;
    String nome;
    String end;
    String curso;
}

// Instanciar
public class Main{
    public static void main(String[] args){
        Aluno aln = new Aluno();

        aln.RA = "12345678909";
        aln.nome = "Maria da Silva";
        aln.end = "Rua Eldorado, nº23";
        aln.curso = "DSM";

        // saida de dados
        System.out.printf("Nº do RA: %s\nNome: %s\nEndereço: %s\nCurso: %s",aln.RA,aln.nome, aln.end, aln.curso);
    }
}