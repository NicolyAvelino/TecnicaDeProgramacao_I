// Objetivo: Fazer um programa para ler os valores da largura e altura de um retângulo. Em seguida, mostrar a tela o valor da sua área, perímetro e diagonal. Usar uma classe como diagrama abaixo:
// Retangulo
// + largura: double
// + altura: double
// + area() : double
// + perimetro(): double
// + diagonal(): double
// Fórmulas:
// Área do retângulo A = b * h
// Perímetro do retângulo 2 * (b + h)
// Diagonal d = raiz a² + b²
public class Retangulo{
    // declarando os atributos
    double largura;
    double altura;

    // criando o método area()
    public double area(){
        return largura * altura;
    }
    // criando o método perimetro()
    public double perimetro(){
        return 2 * (largura + altura);
    }
    // criando o método diagonal()
    public double diagonal(){
        return Math.sqrt(Math.pow(altura,2) + Math.pow(largura,2));
    }
}
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        // declarando scanner e retangulo
        Scanner sc = new Scanner(System.in);
        Retangulo rt = new Retangulo();

        // entrada de dados
        System.out.print("Digite um valor para a altura: ");
        double alt = sc.nextDouble();

        System.out.print("Digite um valor para a largura: ");
        double larg = sc.nextDouble();
        
        rt.altura = alt;
        rt.largura = larg;

        rt.area();
        rt.perimetro();
        rt.diagonal();

        // saida de dados
        System.out.printf("AREA = %.2f \nPERIMETRO = %.2f \nDIAGONAL = %.2f",rt.area(),rt.perimetro(),rt.diagonal());

    }
}