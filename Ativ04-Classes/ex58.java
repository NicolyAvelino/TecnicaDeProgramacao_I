// Objetivo: No exercício anterior crie 2 métodos
public class ContaCorrente{
    // criação da classe
    // declarando dos atributos
    int nr_Conta;
    String nm_Cliente;
    String nr_CPF;
    double saldo;

    // criação do metodo depositar
    public void deposito(double valorDepositar){
        saldo += valorDepositar;
    }
    // criação do metodo saque do tipo boolean
    public boolean saque(double qtSacar){
        // tem saldo na conta
        if(saldo >= qtSacar){
            saldo -= qtSacar;
            return true;
        } else{ 
            return false;
        }
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
        cc.deposito(200);
        cc.saque(300);

        // saida de dados
        System.out.printf("Realizado o depósito de R$ %.2f. Seu saldo é R$ %.2f.",cc.deposito,cc.saldo);
        System.out.printf("Realizado o saque de R$ %.2f. Seu saldo é R$ %.2f.",cc.saque, cc.saldo);
        System.out.printf("Número da Conta: %d\nNome Cliente: %s\nNúmero CPF: %s\nSaldo: %.2f",cc.nr_Conta,cc.nm_Cliente,cc.nr_CPF,cc.saldo);
       
    }
}