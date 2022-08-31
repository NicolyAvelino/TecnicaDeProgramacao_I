// Objetivo:  No exercício anterior crie 2 método
public class Aluno{
    // criação da classe
    // declarando dos atributos
    String RA;
    String nome;
    String end;
    String curso;

    // declarando primeiro método
    public void consultarEnd(String endereco){
        return endereco;
    }

    // declarando segundo método
    public void consultarCurso(String nomeCurso){
        return nomeCurso;
    }
}

// Instanciar
public class Main{
    public static void main(String[] args){
        Aluno aln = new Aluno();

        aln.RA = "12345678909";
        aln.nome = "Maria da Silva";
        aln.consultarEnd("Rua Eldorado");
        aln.consultarCurso("DSM");

        System.out.printf("Número do RA: %s\nNome: %s\nEndereço: %s\n Curso: %s",aln.RA,aln.nome);
    }
}