// Faça um programa na Linguagem Java para efetuar a leitura de um número inteiro e apresentar o resultado do quadrado desse número
import java.util.Scanner;
public class ex10-quadrado{ 
	public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        num = sc.nextInt();
        System.out.printf("O quadrado do número %d é %d.",num, num * num);	}
}