public abstract class Figura{
    private String cor;

    // construtor 
    public Figura(String cor){
        this.cor = cor;
    }

    public abstract double area();

    // criando os métodos get e set de cor
    public void setCor(String cor){
        this.cor = cor;
    }
    public String getCor(){
        return cor;
    }
    @Override
    public String toString(){
        return "Figura \nCor" + cor;
    }
}