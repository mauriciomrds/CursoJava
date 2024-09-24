package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class SegundaClasseJava {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Informe o nome do aluno: ");
		String idade = JOptionPane.showInputDialog("Informe  idade do aluno: ");
		String dataNascimento = JOptionPane.showInputDialog("Informe a data nascimento: ");
		String rg = JOptionPane.showInputDialog("Informe  rg do aluno: ");
		String cpf = JOptionPane.showInputDialog("Informe o cpf do aluno: ");
		String mae = JOptionPane.showInputDialog("Informe o nome da mãe do aluno: ");
		String pai = JOptionPane.showInputDialog("Informe o nome do pai do aluno:");
		String data = JOptionPane.showInputDialog("Informe a data da matricula: ");
		String escola = JOptionPane.showInputDialog("Informe o nome da escola: ");
		String serie = JOptionPane.showInputDialog("Informe a serie do aluno: ");
		
		String diciplina1 =JOptionPane.showInputDialog("Diciplina1");
		String nota1 = JOptionPane.showInputDialog("Nota1");
		
		String diciplina2 =JOptionPane.showInputDialog("Diciplina2");
		String nota2 = JOptionPane.showInputDialog("Nota2");
		
		String diciplina3 =JOptionPane.showInputDialog("Diciplina3");
		String nota3 = JOptionPane.showInputDialog("Nota3 ");
		
		String diciplina4 =JOptionPane.showInputDialog("Diciplina4");
		String nota4 = JOptionPane.showInputDialog("Nota4 ");
		
		
		Aluno aluno1 = new Aluno();
		
	   
		   
		   aluno1.setNome(nome);
	       aluno1.setIdade(Integer.valueOf(idade));
	       aluno1.setDataNascimento(dataNascimento);
	       aluno1.setRegistroGeral(rg);
	       aluno1.setNumeroCpf(cpf);
	       aluno1.setNomeMae(mae);
	       aluno1.setNomePai(pai);
	       aluno1.setDataMatricula(data);
	       aluno1.setNomeEscola(escola);
	       aluno1.setSerieMatriculado(serie);
	       
	       aluno1.setNota1(Double.parseDouble(nota1));
	       aluno1.setNota2(Double.parseDouble(nota2));
	       aluno1.setNota3(Double.parseDouble(nota3));
	       aluno1.setNota4(Double.parseDouble(nota4));
	       
	       aluno1.setDiciplina1(diciplina1);
	       aluno1.setDiciplina2(diciplina2);
	       aluno1.setDiciplina3(diciplina3);
	       aluno1.setDiciplina4(diciplina4);
	       
	       System.out.println("Nome do Aluno1: "+ aluno1.getNome());
	       System.out.println("Idade do Aluno1: "+ aluno1.getIdade());
	       System.out.println("Data de nascimento de Aluno1: "+ aluno1.getDataNascimento());
	       System.out.println("RG do Aluno1: "+ aluno1.getRegistroGeral());
	       System.out.println("CPF do Aluno1: "+ aluno1.getNumeroCpf());
	       System.out.println("Nome da Mãe do Aluno1: "+ aluno1.getNomeMae());
	       System.out.println("Nome do Pai do Aluno1: "+ aluno1.getNomePai());
	       System.out.println("Data da Matricula do Aluno1: "+ aluno1.getDataMatricula());
	       System.out.println("Nome do Colegio do Aluno1: "+ aluno1.getNomeEscola());
	       System.out.println("Numero do registro do Aluno1: "+ aluno1.getSerieMatriculado());
	       System.out.println("Nota do Aluno1: "+ aluno1.getMediaNota());
	       System.out.println("Resultado: "+ aluno1.getAlunoAprovado2());
	       
	       System.out.println("===============================================================================");
	         
	      //Metodo toString
           System.out.println(aluno1.toString());
           System.out.println("Nota do Aluno1: "+ aluno1.getMediaNota());
	       System.out.println("Resultado: "+ aluno1.getAlunoAprovado2());
          
		
		
		
	}

}
