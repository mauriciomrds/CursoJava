
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


int resposta =JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divis�o?");

if(resposta == 0) {
	JOptionPane.showInternalMessageDialog(null, "Divis�o para pessoas deu: "+ divisao);
}

resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o Resto da divis�o?");

if(resposta == 0) {
	JOptionPane.showInternalMessageDialog(null, "O resto da divis�o �:" + resto);
}


//JOptionPane.showInternalMessageDialog(null, "Divis�o para pessoas deu: "+ divisao + " carro e sobrou: "+ resto + " carros");		
		
	}
	
	
}
