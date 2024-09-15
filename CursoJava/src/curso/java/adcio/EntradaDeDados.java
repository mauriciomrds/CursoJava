
package curso.java.adcio;

import javax.swing.JOptionPane;

public class EntradaDeDados {

	public static void main(String[]args) {
		
String carros =	JOptionPane.showInputDialog("Informe a quantidade de carro");
String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas");

double carroNumero = Double.parseDouble(carros);
double pessoaNumero = Double.parseDouble(pessoas);

int divisao = (int)(carroNumero /pessoaNumero);
double resto = carroNumero % pessoaNumero;


int resposta =JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão?");

if(resposta == 0) {
	JOptionPane.showInternalMessageDialog(null, "Divisão para pessoas deu: "+ divisao);
}

resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o Resto da divisão?");

if(resposta == 0) {
	JOptionPane.showInternalMessageDialog(null, "O resto da divisão é:" + resto);
}


//JOptionPane.showInternalMessageDialog(null, "Divisão para pessoas deu: "+ divisao + " carro e sobrou: "+ resto + " carros");		
		
	}
	
	
}
