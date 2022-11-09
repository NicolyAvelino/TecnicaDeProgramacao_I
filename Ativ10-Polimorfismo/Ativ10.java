abstract class Figura{
    private String cor;

    // criando os métodos get e set de cor
    public void setCor(String cor){
        this.cor = cor;
    }
    public String getCor(){
        return cor;
    }
}

public class Retangulo extends Figura{
    private double lado1, lado2;

    // construtor 
    public Retangulo(double lado1, double lado2, String cor){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.cor = cor;
    }

    // Métodos get e set de lado1
    public void setLado1(double lado1){
        this.lado1 = lado1;
    }
    public double getLado1(){
        return lado1;
    }

    // Métodos get e set de lado2
    public void setLado2(double lado2){
        this.lado2 = lado2;
    }
    public double getLado2(){
        return lado2;
    }

    // metodo área
    public double area(){
        return lado1 * lado2;
    }
    // metodo toString
    @override
    public String toString(){
        return "Retângulo \nLado 1: " + lado1 + "Lado 2: " + lado2 + "\nÁrea do Retângulo: " + area();
    }
}

public class Quadrado extends Retangulo{
    public Quadrado(double lado, String cor){
        this.lado = lado;
        this.cor = cor
    }
    // metodo toString
    @override
    public String toString(){
        return "Lado: " + lado + "\tCor: " + cor;
    }
}

public class Triangulo extends Figura{
    private double base, altura;

    // construtor
    public Triangulo(double base, double altura, String cor){
        this.base = base;
        this.altura = altura;
        this.cor = cor;
    }

    // Métodos get e set de base
    public void setBase(double base){
        this.base = base;
    }
    public String getBase(){
        return base;
    }

    // Métodos get e set de altura
    public void setAltura(double altura){
        this.altura = altura;
    }
    public String getAltura(){
        return altura;
    }

    // metodo área
    public double area(){
        return (base * altura) / 2 ;
    }
    // metodo toString
    @override
    public String toString(){
        return "Triângulo \nBase: " + base + "Altura: " + altura + "\nÁrea do Triângulo: " + area();
    }
}

public class Circulo extends Figura{

}