import java.util.ArrayList;
public class Main{
    public static void main(String[] args){

        ArrayList<Figura> fg = new ArrayList<Figura>();

        fg.add(new Retangulo("verde", 5, 5));
        fg.add(new Quadrado("azul", 7));
        fg.add(new Triangulo("vermelho", 4, 8));
        fg.add(new Circulo("roxo",6));
    }
}