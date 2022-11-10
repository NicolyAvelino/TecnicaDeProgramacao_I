public class Retangulo extends Figura{
    private double lado1, lado2;

    // construtor 
    public Retangulo(double lado1, double lado2, String cor){
        this.lado1 = lado1;
        this.lado2 = lado2;
        super(cor);
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
    @Override
    public String toString(){
        return "Retângulo \nLado 1: " + lado1 + "\tLado 2: " + lado2 + "\tÁrea: " + area();
    }
}