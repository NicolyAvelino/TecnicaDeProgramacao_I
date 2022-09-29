// 72. Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano (primeiro trimestre vale 30 e o segundo e o terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no ano. Dizer também se o aluno está aprovado ou não e, em caso negativo, quantos pontos faltam para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Aluno para resolver este problema.
//  para o exercício acima utilizar:
// Construtor
// Encapsulamento
// Sobrecarga
public class Aluno{
    // declarando os atributos da classe
    private String nome;
    private double n1, n2, n3;

    // construtor Aluno
    public Aluno(String nome, double n1, double n2, double n3){
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    // get e set do Atributo nome
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    // get e set do Atributo n1(nota 1)
    public double getN1(){
        return n1;
    }
    public void setN1(double n1){
        this.n1 = n1;
    }

    // get e set do Atributo n2(nota 2)
    public double getN2(){
        return n2;
    }
    public void setN2(double n2){
        this.n2 = n2;
    }

    // get e set do Atributo n3(nota 3)
    public double getN3(){
        return n3;
    }
    public void setN3(double n3){
        this.n3 = n3;
    }

    // metodo para calcular media
    public double calcularMedia(){
        return n1 + n2 + n3;
    }

    // metodo para retornar se o aluno foi APROVADO( que é 60% da nota)
    public double calcularMediaFinal(){
        if(calcularMedia() >= 60){
            return calcularMedia();
        } else {
            return 60.00 - calcularMedia();
        }
    }

    // saida de dados to String
    public String toString(){
         if(calcularMedia() >= 60){
           return "NOTA FINAL = " + calcularMedia() + "\nAPROVADO"; 
        } else {
            return "\nNOTA FINAL = " + calcularMedia() + "\nREPROVADO \nFALTARAM " + calcularMediaFinal() + " PONTOS"; 
        }
        
    }
}

public class Main{
    public static void main(String[] args){
        // instanciar classes aluno e passar valores por parametro
        Aluno aln = new Aluno("João Pedro",27.00,31.00,32.00);
        
        Aluno aln2 = new Aluno("João Pedro",17.00,20.00,15.00);

        // saida de dados
        System.out.println(aln.toString());

        System.out.println(aln2.toString());
    }
}