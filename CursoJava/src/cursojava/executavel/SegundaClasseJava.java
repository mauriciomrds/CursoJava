package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

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
		
	/*	String disciplina1 =JOptionPane.showInputDialog("Disciplina1");
		String nota1 = JOptionPane.showInputDialog("Nota1");
		
		String disciplina2 =JOptionPane.showInputDialog("Disciplina2");
		String nota2 = JOptionPane.showInputDialog("Nota2");
		
		String disciplina3 =JOptionPane.showInputDialog("Disciplina3");
		String nota3 = JOptionPane.showInputDialog("Nota3 ");
		
		String disciplina4 =JOptionPane.showInputDialog("Disciplina4");
		String nota4 = JOptionPane.showInputDialog("Nota4 ");
		*/
		
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
	       
	       
	       for(int pos = 1 ; pos <= 4 ; pos ++) {
	    	   
	    	   String nomeDisciplina = JOptionPane.showInputDialog(" Nome da disciplina "+pos+"?" );
	    	   String notaDisciplina = JOptionPane.showInputDialog(" Nota da disciplina "+pos+"?" );
	    	   
	    	   Disciplina disciplina = new Disciplina();
	    	   disciplina.setDisciplina(nomeDisciplina);
	    	   disciplina.setNota(Double.valueOf(notaDisciplina));
	    	   
	    	   aluno1.getDisciplinas().add(disciplina);
	    	   
	       }
	       
	       
	      /* System.out.println("Nome do Aluno1: "+ aluno1.getNome());
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
	       System.out.println("Resultado: "+ aluno1.getAlunoAprovado2());*/
	       
	       
	       
	       
	       //System.out.println("===============================================================================");
	         
	      //Metodo toString
           System.out.println(aluno1);
           System.out.println("Nota do Aluno1: "+ aluno1.getMediaNota());
	       System.out.println("Resultado: "+ aluno1.getAlunoAprovado2());
          
		
		
		
	}

}
