package Figura;
public class Triangulo extends Figura{
    private double base, altura;

    // construtor
    public Triangulo(String cor, double base, double altura){
        super(cor);
        this.base = base;
        this.altura = altura;
    }

    // Métodos get e set de base
    public void setBase(double base){
        this.base = base;
    }
    public double getBase(){
        return base;
    }

    // Métodos get e set de altura
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getAltura(){
        return altura;
    }

    // metodo área
    @Override
    public double area(){
        return (base * altura) / 2 ;
    }
    // metodo toString
    @Override
    public String toString(){
        return "Triângulo \nBase: " + base + "\tAltura: " + altura + "\tÁrea: " + area() + "\tCor: " + getCor();
    }
}