package curso.java.jdev;
import javax.swing.JOptionPane;

public class EntradaDeDados {

	public static void main(String[]args) {
		
String carros =	JOptionPane.showInputDialog("Informe a quantidade de carro");
String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas");

double carroNumero = Double.parseDouble(carros);
double pessoaNumero = Double.parseDouble(pessoas);

int divisao = (int)(carroNumero /pessoaNumero);
double resto = carroNumero % pessoaNumero;

JOptionPane.showInternalMessageDialog(null, "Divisão para pessoas deu: "+ divisao + " carro e sobrou: "+ resto + " carros");		
		
	}
	
	
}
