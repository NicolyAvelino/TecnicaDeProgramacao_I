// Objetivo: Fazer um programa para ler os dados de uma conta corrente:
// • Número da Conta;
// • Nome do Cliente;
// • CPF;
// • Saldo Da conta.
// Em seguida, mostrar a tela todos os atributos. Utilize classe
public class ContaCorrente{
    // criação da classe
    // declarando dos atributos
    int nr_Conta;
    String nm_Cliente;
    String nr_CPF;
    double saldo;
}

// Instanciar
public class Main{
    public static void main(String[] args){
        ContaCorrente cc = new ContaCorrente();

        cc.nr_Conta = 1234;
        cc.nm_Cliente = "Maria da Silva";
        cc.nr_CPF = "87654323499";
        cc.saldo = 2000;

        System.out.printf("Número da Conta: %d\nNome Cliente: %s\nNúmero CPF: %s\nSaldo: %.2f",cc.nr_Conta,cc.nm_Cliente,cc.nr_CPF,cc.saldo);
    }
}