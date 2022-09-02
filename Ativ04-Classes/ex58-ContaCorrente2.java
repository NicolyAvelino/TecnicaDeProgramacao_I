// Objetivo: No exercício anterior(ex57) crie 2 métodos
public class ContaCorrente{
    // criação da classe
    // declarando dos atributos
    int nr_Conta;
    String nm_Cliente;
    String nr_CPF;
    double saldo;

    // criação do metodo depositar
    public void depositar(double valorDepositar){
        saldo += valorDepositar;
    }
    // criação do metodo sacar do tipo boolean
    public void sacar(double qtSacar){
        saldo -= qtSacar;
    }
}

// Instanciar na Main
public class Main{
    public static void main(String[] args){
        ContaCorrente cc = new ContaCorrente();

        // entrada de dados
        cc.nr_Conta = 1234;
        cc.nm_Cliente = "Maria da Silva";
        cc.nr_CPF = "87654323499";
        cc.saldo = 2000;
        
        // valores metodos 
        cc.depositar(200);
        cc.sacar(300);

        // saida de dados
        System.out.printf("Número da Conta: %d\nNome Cliente: %s\nNúmero CPF: %s\nSaldo: %.2f",cc.nr_Conta,cc.nm_Cliente,cc.nr_CPF,cc.saldo);
       
    }
}