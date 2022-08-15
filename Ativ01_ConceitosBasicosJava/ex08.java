// Faça um programa na Linguagem Javaque efetue a apresentação do valor da conversão em real de um valor lido em dólar. O programa deve solicitar o valor da cotação do dólar e também a quantidade de dólares disponível com o usuário, para que seja apresentado o valor em moeda brasileira.]
public class ex08{ 
	public static void main(String[] args) {
        double cota = 5.09;
        float qtDolar = 9;
        double conversao = cota * qtDolar;

        System.out.println("O valor da conversão em real é R$: "+ conversao);
	}
}