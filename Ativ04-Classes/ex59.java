// Objetivo: Fazer um programa para ler os dados de um Aluno:
// • RA;
// • Nome;
// • Endereço;
// • Curso.
// Em seguida, mostrar a tela todos os atributos. Utilize classe
public class Aluno{
    // criação da classe
    // declarando dos atributos
    private int RA;
    private String nome;
    private String end;
    private String curso;
}

// Instanciar
public class Main{
    public static void main(Strin[] args){
        Aluno aln = new Aluno();

        aln.RA = 12345678909;
        aln.nome = "Maria da Silva";
        aln.end = "Rua Eldorado, nº23";
        aln.curso = "DSM";

        System.out.printf("Número do RA: %d\nNome: %s\nEndereço: %s\n Curso: %s",aln.RA,aln.nome, aln.end, aln.curso);
    }
}