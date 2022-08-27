// Objetivo: No exercício anterior crie 2 métodos
public class Main{
    // criação da classe
    // declarando dos atributos
    private int nr_Conta;
    private String nm_Cliente;
    private int nr_CPF;
    private double saldo;

    // criação do metodo depositar
    public void valor(double valorDepositar){
        saldo += valorDepositar;
    }
    // criação do metodo saque do tipo boolean
    boolean saque(double qtSacar){
        // tem saldo na conta
        if(saldo >= qtSacar){
            saldo -= qtSacar;
            return true;
        } else{ 
            return false 
        }
    }
}


// Instanciar
public class Main{
    public static void main(Strin[] args){
        ContaCorrente cc = new ContaCorrente();

        cc.nr_Conta = 1234;
        cc.nm_Cliente = "Maria da Silva";
        cc.nr_CPF = 87654323499;
        cc.saldo = 2000;
        cc.saque(20);
        cc.valor(200);

        System.out.printf("Número da Conta: %f\nNome Cliente: %s\nNúmero CPF: %d\n Saldo: %f",cc.nr_Conta,cc.nm_Cliente,cc.nr_CPF,cc.saldo);
       
    }
}