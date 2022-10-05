// Criar um projeto Java chamado “Heranca_02”, que implemente todo o código necessário para a criação das classes abaixo:
public class Veiculo{
    private String placa;
    private int ano;

    public Veiculo(){

    }
    public Veiculo(String placa, int ano){
        this.placa = placa;
        this.ano = ano;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public void setAno(int ano){
        this.ano = ano;
    }
    public void setAno(String anoString){
        this.ano = anoString;
    }

    public String getPlaca(){
        return placa;
    }
    public int getAno(){
        return ano;
    }
    public void exibirDados(){

    }

}

public class Onibus extends Veiculo{
    private int assentos;

    public Onibus(String placa, int ano, int assentos){
        this.placa = placa;
        this.ano = ano;
        this.assentos = assentos;
    }
    public void setAssentos(int assentos){
        this.assentos = assentos;
    }
    public int getAssentos(){
        return assentos;
    }
    public void exibirDados(){

    }
}

public class Caminhao extends Veiculo{
    private int eixos;

    public Caminhao(String placa, int ano, int eixos){
        this.placa = placa;
        this.ano = ano;
        this.eixos = eixos;
    }
    public void setEixos(int eixos){
        this.eixos = eixos;
    }
    public int getEixos(){
        return eixos;
    }
    public void exibirDados(){
        
    }
}