// 67. Criar uma classe para representar uma entidade que representa uma
// Conta Corrente em um sistema bancário. A conta corrente deve ter os
// seguintes atributos (todos privados):
// • Nome do Correntista
// • Sexo
// • Idade
// • Numero da Conta
// • Flag indicando se é conta conjunta
// • Saldo
// Criar os seguintes métodos na classe Conta:
// • Saque: Recebe como parâmetro o valor. Verifica o saldo da
// conta, e se tiver saldo disponível, diminui do saldo o valor
// sacado.
// • Saldo: não recebe parâmetros. Deve imprimir um cabeçalho
// com o nome do correntista, numero da conta, indicação se é
// conta conjunta ou não, e o saldo em conta.
// • Deposito: Recebe como parâmetro o valor depositado na
// conta.
// • Aumenta o saldo da conta de acordo com o valor depositado.

public class ContaCorrente{
    // declarando atributos
    private String nome, nr_Conta, sexo, conjunta;
    private int idade;
    private double saldo;

    // Get Nome
    public String getNome(){
        return nome;
    }
    // Set nome
    public void setNome(String nome){
        this.nome = nome;
    }
    // Get Numero da conta
    public String getNrConta(){
        return nr_Conta;
    }
    // set Numero da conta
    public void setNrConta(String nr_Conta){
        this.nr_Conta = nr_Conta;
    }
    // Get sexo do usuario
    public String getSexo(){
        return sexo;
    }
    // Set sexo do usuario
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    // Get saldo do usuario
    public double getSaldo(){
        return saldo;
    }
    // Set saldo do usuario
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    // Get conta conjunta do usuario
    public String getConjunta(){
        return conjunta;
    }
    // Set conta conjunta do usuario
    public void setConjunta(String conjunta){
        this.conjunta = conjunta;
    }
    
    // método sacar 
    public boolean sacar(double valor){
        if(saldo > valor){
            saldo = saldo - valor;
            return true;
        } else{
            return false;
        }
    }
    // método ver saldo atual na conta
    public void verSaldo(){
        System.out.println("Saldo Atual R$ " + getSaldo());
    }
    // método depositar na conta
    public double depositar(double vlrDep){
        return saldo = saldo + vlrDep;
    }
}
// • Criar uma classe chamada TestaConta, que deve possuir um método main
public class TestaConta{
    public static void main(String[] args){
        // instanciando a classe ContaCorrente
        ContaCorrente conta1 = new ContaCorrente();
        ContaCorrente conta2 = new ContaCorrente();
        ContaCorrente conta3 = new ContaCorrente();

        // entrada de dados conta 1
        conta1.nome = "Fernando";
        conta1.nr_Conta = "1234";
        conta1.conjunta = "Nao";
        conta1.saldo = 1500.00;
        conta1.sexo = "Masculino";
        conta1.idade = 29;

        // entrada de dados conta 2
        conta2.nome = "Maria";
        conta2.nr_Conta = "5321";
        conta2.conjunta = "Sim";
        conta2.saldo = 530.31;
        conta2.sexo = "Feminino";
        conta2.idade = 45;

        // entrada de dados conta 3
        conta3.nome = "Joao";
        conta3.nr_Conta = "9621";
        conta3.conjunta = "Sim";
        conta3.saldo = 4325.12;
        conta3.sexo = "Masculino";
        conta3.idade = 54;

        // saida de dados conta 1
        System.out.printf("Nome: %s\nNum Conta: %s \nConjunta? %s \nSaldo: R$ %.2f \nSexo: %s \nIdade: %d\n",conta1.nome,conta1.nr_Conta,conta1.conjunta,conta1.saldo,conta1.sexo,conta1.idade);

        // saida de dados conta 2
        System.out.printf("\nNome: %s\nNum Conta: %s \nConjunta? %s \nSaldo: R$ %.2f \nSexo: %s \nIdade: %d\n",conta2.nome,conta2.nr_Conta,conta2.conjunta,conta2.saldo,conta2.sexo,conta2.idade);

        // saida de dados conta 3
        System.out.printf("\nNome: %s\nNum Conta: %s \nConjunta? %s \nSaldo: R$ %.2f \nSexo: %s \nIdade: %d",conta3.nome,conta3.nr_Conta,conta3.conjunta,conta3.saldo,conta3.sexo,conta3.idade);
    }
}