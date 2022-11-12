package Figura;
public class Quadrado extends Retangulo{
    // construtor
    public Quadrado(String cor, double lado){
        super(cor, lado, lado);
    }
    // metodo toString
    @Override
    public String toString(){
        return "Quadrado \nLado: " + getLado1() + "\tCor: " + getCor();
    }
}