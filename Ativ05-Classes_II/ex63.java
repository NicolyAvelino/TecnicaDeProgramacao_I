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
    double largura=3.00;
    double altura=4.00;

    // criando o método area()
    public void area(){
        return largura * altura;
    }
    // criando o método perimetro()
    public void perimetro(){
        return 2 * (largura + altura);
    }
    // criando o método diagonal()
    public void diagonal(){
        return Math.sqrt(Math.pow(altura,2) + Math.pow(largura,2));
    }
}

public class Main{
    public static void main(String[] args){
        Retangulo rt = new Retangulo();
        // entrada de dados
        
        rt.area();
        rt.perimetro();
        rt.diagonal();

        // saida de dados
        System.out.print("AREA = %.2f \nPERIMETRO = %.2f \nDIAGONAL = %.2f",rt.area(),rt.perimetro(),rt.diagonal());

    }
}