// Faça um programa na Linguagem Java que efetue a apresentação do valor da conversão em real de um valor lido em dólar. O programa deve solicitar o valor da cotação do dólar e também a quantidade de dólares disponível com o usuário, para que seja apresentado o valor em moeda brasileira.]
import java.util.Scanner;
public class ex08-conversao{ 
	public static void main(String[] args) {
                double cota, qtDolar,conversao;
                Scanner sc = new Scanner(System.in);

                System.out.print("O valor da cotação do dólar: ");
                cota = sc.nextDouble();

                System.out.print("Quantidade de dólares disponível: ");
                qtDolar = sc.nextDouble();
                
                conversao = cota * qtDolar;

                System.out.printf("O valor da conversão de Dólar para real é %.2f reais.", conversao);
	}
}