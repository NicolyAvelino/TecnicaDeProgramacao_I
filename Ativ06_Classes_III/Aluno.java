// Questao 68
public class Aluno{
    // declarando atributos
    private String nome, matricula;
    private double nota1, nota2, notaReavaliacao;

    // Construtor Aluno
    public Aluno(){

    }
    public Aluno(String nome, String matricula, double nota1, double nota2, double notaReavaliacao){
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaReavaliacao = notaReavaliacao;
    }
  
    // Get Nome
    public String getNome(){
        return nome;
    }
    // Set nome
    public void setNome(String nome){
        this.nome = nome;
    }
    // Get Matricula
    public String getMatricula(){
        return matricula;
    }
    // Set Matricula
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    // Get Nota1
    public double getNota1(){
        return nota1;
    }
    // Set Nota1
    public void setNota1(double nota1){
        this.nota1 = nota1;
    }
    // Get Nota2
    public double getNota2(){
        return nota2;
    }
    // Set Nota2
    public void setNota2(double nota2){
        this.nota2 = nota2;
    }
    // Get notaReavaliacao
    public double getNotaReavaliacao(){
        return notaReavaliacao;
    }
    // Set notaReavaliacao
    public void setNotaReavaliacao(double notaReavaliacao){
        this.notaReavaliacao = notaReavaliacao;
    }

    // metodo para mostrar os dados
    public String toString(){
        System.out.printf("Nome: %s\nMatrícula: %s\nNota1: %.2f \nNota2: %.2f \nMédia Final: %.2f.",getNome(),getMatricula(),getNota1(),getNota2(),calcularMediaFinal());
    }
   
    // metodo para calcular media
    public double calcularMedia(){
       return (nota1 + nota2)/2;        
    }

    // metodo para calcular media final 
    public double calcularMediaFinal(){
        if(calcularMedia() >= 6){
            return calcularMedia();
        } else{
            return (calcularMedia() + notaReavaliacao)/2;
        }
    }
}
// classe main 
public class Main{
    public static void main(String[] args){
        // instanciar classe aluno e passar valores por parametro
        Aluno aln = new Aluno("Nicoly","12345",6.5,8.2,6);

        aln.toString();
    }
}