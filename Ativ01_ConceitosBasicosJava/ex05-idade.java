// Faça  um programa na Linguagem Java que leia  a  idade  de  uma pessoa expressa em ano, mês e dia e mostre-as em dias.
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        // declaração de variáveis
        int ano, mes, dia, qtDias;

        // cria um objeto scanner
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o dia em que nasceu: ");
        dia = sc.nextInt();

        // Entrada de dados
        System.out.print("Digite o mês em que nasceu: ");
        mes = sc.nextInt();

        // Entrada de dados
        System.out.print("Digite o ano em que nasceu: ");
        ano = sc.nextInt();

        // cálculo da formúla  
        qtDias = (ano * 365) + (mes * 30) + dia;

        // saida de dados
        System.out.printf("A quantidades tempo você já viveu em dias: %d.", qtDias);
	}
}