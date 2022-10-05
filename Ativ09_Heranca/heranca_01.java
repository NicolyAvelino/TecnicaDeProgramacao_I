// Criar um projeto Java chamado “Heranca_01”, que implemente todo o código necessário para a criação das classes abaixo:

public class Funcionario{
    // declarando os atributos
    private String nome, cpf;
    private double salario;

    // declarando os metodos de Get e Set
    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    public double getSalario(){
        return salario;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setSalario(double salario){
        this.salario =  salario;
    }
}
public class Gerente extends Funcionario{
    // atributo
    private int senha;

    // metodo 
    public boolean autentica(int senha){
        if(this.senha == senha){
            return true;
        } else{
            return false;
        }
    }

}