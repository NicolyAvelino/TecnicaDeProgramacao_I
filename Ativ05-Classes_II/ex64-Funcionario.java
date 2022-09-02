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
    double salarioBruto, desconto,porcentagem;

    // declarando método salarioLiquido()
    public double salarioLiquido(){
        return salarioBruto - desconto;
    }
    // declarando método aumentarSalario(porcentagem: double)
    public double aumentarSalario(){
        return salarioBruto + (salarioBruto * (porcentagem/100));
    }
}

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        // declarando funcionario e scanner
        Funcionario fc = new Funcionario();
        Scanner sc = new Scanner(System.in);

        // entrada de dados
        System.out.print("Nome: ");
        String nm = sc.nextLine();
        fc.nome = nm;

        System.out.print("Salário Bruto: ");
        double sB = sc.nextDouble();
        fc.salarioBruto = sB;

        System.out.print("Desconto: ");
        double dct = sc.nextDouble();
        fc.desconto = dct;

        // fc.nome = "Joao Silva";
        // fc.salarioBruto = 5000.00;
        // fc.desconto = 1000.00;

        // saida de dados
        System.out.printf("Dados do Funcionário: %s, R$ %.2f\nSálario Liquido: %.2f",fc.nome,fc.salarioBruto,fc.salarioLiquido());

        // entrada de dados para aumentar salario
        System.out.print("\nDeseja aumentar o salário em qual porcentagem? ");
        double vlrPorcentagem = sc.nextDouble();
        fc.porcentagem = vlrPorcentagem;

        // saida de dados
        System.out.printf("Dados do Funcionário: %s, R$ %.2f",fc.nome,fc.aumentarSalario());        
    }
}