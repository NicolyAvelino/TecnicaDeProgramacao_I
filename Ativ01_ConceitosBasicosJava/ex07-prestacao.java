// Objetivo: Faça  um programa  na  Linguagem Javapara  efetuar  o  cálculo  e  a apresentação  do  valor  de uma  prestação  em  atraso,  utilizando  a fórmula  PRESTAÇÃO  <--VALOR  +  (VALOR  *  (TAXA/100)  * TEMPO).
import java.util.Scanner;
public class Main{ 
	public static void main(String[] args) {
        // declaração de variáveis
        double vlr,taxa,prest;
        int tmp;
              
        // cria um objeto scanner
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o valor: ");
        vlr = sc.nextDouble();

        // Entrada de dados      
        System.out.print("Digite a taxa(%): ");
        taxa = sc.nextDouble();

        // Entrada de dados
        System.out.print("Digite o tempo em atraso: ");
        tmp = sc.nextInt();

        // cálculo da formúla
        prest = vlr + (vlr * (taxa/100) * tmp);
        
        // saida de dados
        System.out.printf("O valor da prestação em atraso é %.2f reais.", prest);
	}
}