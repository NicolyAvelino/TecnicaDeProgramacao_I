// Faça  um programa na Linguagem Java que leia  a  idade  de  uma pessoa expressa em ano, mês e dia e mostre-as em dias.
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
        System.out.printf("A quantidade de tempo você já viveu em dias: %d.", qtDias);
    }
}