// Faça  um programa  na  Linguagem Javapara  efetuar  o  cálculo  e  a apresentação  do  valor  de uma  prestação  em  atraso,  utilizando  a fórmula  PRESTAÇÃO  <--VALOR  +  (VALOR  *  (TAXA/100)  * TEMPO).
public class ex07{ 
	public static void main(String[] args) {
    
       float valor = 400;
       double taxa = 1.5;
       float tempo = 22;
       
       double prestacao = valor + (valor * (taxa/100) * tempo);
       System.out.println("O valor de uma prestação em atraso é: "+ prestacao);
	}
}