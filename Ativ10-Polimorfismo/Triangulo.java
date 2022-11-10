public class Triangulo extends Figura{
    private double base, altura;

    // construtor
    public Triangulo(double base, double altura, String cor){
        this.base = base;
        this.altura = altura;
        super(cor);
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