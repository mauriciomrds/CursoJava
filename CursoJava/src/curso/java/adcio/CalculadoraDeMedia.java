package curso.java.adcio;

import javax.swing.JOptionPane;

public class CalculadoraDeMedia {

	public static void main(String[]args) {
		
		String nota1 = JOptionPane.showInputDialog("Informe a primeira nota: ");
		String nota2 = JOptionPane.showInputDialog("Informe a segunda nota: ");
		String nota3 = JOptionPane.showInputDialog("Informe a teceira nota :");
		String nota4 = JOptionPane.showInputDialog("Informe a quarta nota: ");
		
		double dnota1 = Double.parseDouble(nota1);
		double dnota2 = Double.parseDouble(nota1);
		double dnota3 = Double.parseDouble(nota1);
		double dnota4 = Double.parseDouble(nota1);
		
		double media =(dnota1 + dnota2 + dnota3 + dnota4) / 4;
		
		//JOptionPane.showInternalMessageDialog(null," A sua média é: "+ media);
		
		if(media >=7) {
			JOptionPane.showInternalMessageDialog(null," Parabéns está aprovado! "+ media);
		}else if(media >=5 && media <=6.75) {
			JOptionPane.showInternalMessageDialog(null," Voçê vai para recuperação! "+ media);
		}else {
			JOptionPane.showInternalMessageDialog(null," Voçê está reprovado! "+ media);
		}
	}
}
