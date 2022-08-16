// Faça  um programa  na  Linguagem Javapara  efetuar  o  cálculo  e  a apresentação  do  valor  de uma  prestação  em  atraso,  utilizando  a fórmula  PRESTAÇÃO  <--VALOR  +  (VALOR  *  (TAXA/100)  * TEMPO).
import java.util.Scanner;
public class ex07-prestacao{ 
	public static void main(String[] args) {
       double vlr,taxa,tmp,prest;
       Scanner sc = new Scanner(System.in);
       System.out.print("Digite o valor: ");
       vlr = sc.nextDouble();
       
       System.out.print("Digite a taxa: ");
       taxa = sc.nextDouble();

       System.out.print("Digite o tempo em atraso: ");
       tmp = sc.nextDouble();

       prest = vlr + (vlr * (taxa/100) * tmp);
       System.out.printf("O valor da prestação em atraso é %.2f reais.", prest);
	}
}