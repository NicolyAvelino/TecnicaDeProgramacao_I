// Objetivo: Faça  um programa na Linguagem Java que leia  a  idade  de  uma pessoa expressa em ano, mês e dia e mostre-as em dias.
import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class Main{
    public static void main(String[] args){
        // declaração de variáveis
        String data; 

        // cria um objeto scanner
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite a data do seu nascimento (dia/mes/ano): ");
        data = sc.nextLine();

        // transforma em array
        String[] dtSep = data.split("/"); 

        // passa os valores para formato de data
        LocalDate dtIn = LocalDate.of(Integer.parseInt(dtSep[2]), Integer.parseInt(dtSep[1]), Integer.parseInt(dtSep[0]));

        // pega a data de hoje
        LocalDate dtHoje = LocalDate.now();

        // cria variavel de dias tipo long e calcula a diferenca entre as datas
        long qtDias = ChronoUnit.DAYS.between(dtIn,dtHoje);

        // saida de dados
        System.out.printf("A quantidade de tempo você já viveu em dias é: %d.", qtDias);
    }
}
// Forma correta
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int ano, mes, dia, dias;

        Scanner sc = new Scanner(System.in);
        // entrada de dados
        System.out.print("Digite quantos anos você tem: ");
        ano = sc.NextInt();
        System.out.print("Digite quantos mes(es) você tem: ");
        mes = sc.nextInt();
        System.out.print("Digite quantos dia(s) você tem: ");
        dia = sc.nextInt();
        
        // processamento
        dias = (ano * 360) + (mes * 30) + dia;

        // saida de dados 
        System.out.println("Você tem: "+dias);
    }
}
// Forma contrária
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        // criacao das variaveis
        int ano, mes, dias; 

        Scanner sc = new Scanner(System.in);
        // entrada de dados
        System.out.print("Digite sua idade em dias: ");
        dias = sc.nextInt();

        // processamento
        ano = dias / 360;
        dias = dias % 360;
        mes = dias / 30;
        dias = dias % 30;

        // saida de dados
        System.out.println("Você tem " + ano + " ano(s) " + mes + "mes(es) " + dias + " dias.");
    }
}