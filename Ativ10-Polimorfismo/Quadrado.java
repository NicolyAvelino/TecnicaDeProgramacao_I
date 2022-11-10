public class Quadrado extends Retangulo{
    // construtor
    public Quadrado(double lado, String cor){
        super(cor, lado1, lado2);
    }
    // metodo toString
    @Override
    public String toString(){
        return "Quadrado \nLado: " + getLado1() + "\tCor: " + getCor();
    }
}