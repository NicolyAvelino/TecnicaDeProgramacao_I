// Objetivo: Fazer um programa para ler os dados de uma conta corrente:
// • Número da Conta;
// • Nome do Cliente;
// • CPF;
// • Saldo Da conta.
// Em seguida, mostrar a tela todos os atributos. Utilize classe
public class ContaCorrente{
    // criação da classe
    // declarando dos atributos
    private int nr_Conta;
    private String nm_Cliente;
    private int nr_CPF;
    private double saldo;
}

// Instanciar
public class Main{
    public static void main(Strin[] args){
        ContaCorrente cc = new ContaCorrente();

        cc.nr_Conta = 1234;
        cc.nm_Cliente = "Maria da Silva";
        cc.nr_CPF = 87654323499;
        cc.saldo = 2000;

        System.out.printf("Número da Conta: %f\nNome Cliente: %s\nNúmero CPF: %d\n Saldo: %f",cc.nr_Conta,cc.nm_Cliente,cc.nr_CPF,cc.saldo);
    }
}