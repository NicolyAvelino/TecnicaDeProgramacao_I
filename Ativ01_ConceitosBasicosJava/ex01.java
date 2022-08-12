// Faça um  programa  na  Linguagem Java que  receba  2  números  e apresente a multiplicação dos dois números.
public class ex01 {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int multiplicacao;
		
		// receber valores do usuario
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor 1: "));
	    num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor 2: "));
        
	    multiplicacao = (num1 * num2);
	    
	    System.out.println("O valor da multiplicação é: "+ multiplicacao);
	}
}