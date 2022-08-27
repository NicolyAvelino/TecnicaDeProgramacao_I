// Objetivo:  No exercício anterior crie 2 método
public class Aluno{
    // criação da classe
    // declarando dos atributos
    private int RA;
    private String nome;
    private String end;
    private String curso;

    // declarando primeiro método
    public void pegarEnd(){
        return end;
    }

    // declarando segundo método
    public void nmCurso(){
        return curso;
    }
}

// Instanciar
public class Main{
    public static void main(Strin[] args){
        Aluno aln = new Aluno();

        aln.RA = 12345678909;
        aln.nome = "Maria da Silva";
        aln.pegarEnd("Rua Eldorado");
        aln.nmCurso("DSM");

        System.out.printf("Número do RA: %d\nNome: %s\nEndereço: %s\n Curso: %s",aln.RA,aln.nome, aln.pegarEnd(), aln.nmCurso());
    }
}