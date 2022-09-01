//Objetivo:  Fazer um programa para ler os dados de um funcionário (nome, salário Bruto e Desconto). Em seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada e mostrar novamente os dados do funcionário. Use a classe projetada abaixo:
// Funcionario
// + nome: String
// + salarioBruto: double
// + desconto: double
// + salarioLiquido(): double
// + aumentarSalario(porcentagem: double): void

public class Funcionario{
    // declarando os atributos
    String nome;
    double salarioBruto, desconto;

    // declarando método salarioLiquido()
    // public double salarioLiquido(){
    // }
    // declarando método aumentarSalario(porcentagem: double)
    public void aumentarSalario(double porcentagem){
        porcentagem = salarioBruto * (porcentagem/100);
    }
}

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Funcionario fc = new Funcionario();

        Scanner sc = new Scanner(System.in);

        // entrada de dados
        fc.nome = "Joao Silva";
        fc.salarioBruto = 5000.00;
        fc.desconto = 1000.00;

        // saida de dados
        System.out.printf("Nome: %s\nSalário Bruto: %.2f \nDesconto: %.2f \nDados do Funcionário: %s, R$ %.2f\n",fc.nome,fc.salarioBruto,fc.desconto,fc.nome,fc.salarioBruto);

        // entrada de dados para aumentar salario
        System.out.print("Deseja aumentar o salário em qual porcentagem? ");
        double vlrPorcentagem = sc.nextDouble();
        fc.aumentarSalario(vlrPorcentagem);

        // saida de dados
        System.out.printf("Dados do Funcionário: %s, R$ %.2f",fc.nome,fc.salarioBruto);        
    }
}