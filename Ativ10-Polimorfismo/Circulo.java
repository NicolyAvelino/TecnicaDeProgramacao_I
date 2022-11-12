package Figura;
public class Circulo extends Figura{
    private double raio;

    public Circulo(String cor, double raio){
        super(cor);
        this.raio = raio;
    }

    // Métodos get e set de raio
    public void setRaio(double raio){
        this.raio = raio;
    }
    public double getRaio(){
        return raio;
    }

    // metodo area
    @Override
    public double area(){
        return Math.PI * raio * raio;
    }

    // metodo diametro
    public double getDiametro(){
        return 2 * raio;
    }

    // metodo toString
    @Override
    public String toString(){
        return "Circulo \nRaio: " + raio + "\tÁrea: " + area() + "\tDiametro: " + getDiametro() + "\tCor: " + getCor();
    }
}