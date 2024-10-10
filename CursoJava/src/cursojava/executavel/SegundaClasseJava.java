package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class SegundaClasseJava {

	public static void main(String[] args) {
		
		List<Aluno>alunos = new ArrayList<Aluno>();
		
		   for(int qtd = 1; qtd <=2; qtd ++) {
		
		String nome = JOptionPane.showInputDialog("Informe o nome do aluno: "+ qtd + " ?");
		/*String idade = JOptionPane.showInputDialog("Informe  idade do aluno: ");
		String dataNascimento = JOptionPane.showInputDialog("Informe a data nascimento: ");
		String rg = JOptionPane.showInputDialog("Informe  rg do aluno: ");
		String cpf = JOptionPane.showInputDialog("Informe o cpf do aluno: ");
		String mae = JOptionPane.showInputDialog("Informe o nome da mãe do aluno: ");
		String pai = JOptionPane.showInputDialog("Informe o nome do pai do aluno:");
		String data = JOptionPane.showInputDialog("Informe a data da matricula: ");
		String escola = JOptionPane.showInputDialog("Informe o nome da escola: ");
		String serie = JOptionPane.showInputDialog("Informe a serie do aluno: ");*/
		
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
	     /*  aluno1.setIdade(Integer.valueOf(idade));
	       aluno1.setDataNascimento(dataNascimento);
	       aluno1.setRegistroGeral(rg);
	       aluno1.setNumeroCpf(cpf);
	       aluno1.setNomeMae(mae);
	       aluno1.setNomePai(pai);
	       aluno1.setDataMatricula(data);
	       aluno1.setNomeEscola(escola);
	       aluno1.setSerieMatriculado(serie);*/
	       
	       
	       for(int pos = 1 ; pos <= 4 ; pos ++) {
	    	   
	    	   String nomeDisciplina = JOptionPane.showInputDialog(" Nome da disciplina "+pos+"?" );
	    	   String notaDisciplina = JOptionPane.showInputDialog(" Nota da disciplina "+pos+"?" );
	    	   
	    	   Disciplina disciplina = new Disciplina();
	    	   disciplina.setDisciplina(nomeDisciplina);
	    	   disciplina.setNota(Double.valueOf(notaDisciplina));
	    	   
	    	   aluno1.getDisciplinas().add(disciplina);
	    	   
	       }
	       int escolha = JOptionPane.showConfirmDialog(null," Deseja remover alguma disciplina ? ");
	       
	       if(escolha == 0) {//Opção Sim é igual a 0
	    	   
	    	   
	    	   int continuarRemovendo = 0;
	    	   int posicao = 1;
	    	      	   
	    	   while(continuarRemovendo == 0) {
	    	   String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina 1, 2, 3, 4 ?");
	    	   aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
	    	   posicao ++;
	    	   continuarRemovendo = JOptionPane.showConfirmDialog(null,"Deseja continuar removendo?" );
	    	   }
	       }
	       
	       alunos.add(aluno1);
	       
	   }  
		   for (Aluno aluno : alunos) {
			   
			   //Metodo toString
	           System.out.println(aluno);
	           System.out.println("Nota do Aluno1: "+ aluno.getMediaNota());
		       System.out.println("Resultado: "+ aluno.getAlunoAprovado2());
		     System.out.println("===============================================================================");
		}
	       
	       
	         
	     
          
		
		
		
	}

}
