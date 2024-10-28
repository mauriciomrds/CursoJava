package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;

public class SegundaClasseJava {

	public static void main(String[] args) {
		
		//Criação lista alunos
		List<Aluno>alunos = new ArrayList<Aluno>();
		
		//Criação de nova lista de alunos APROVADO, REPROVADO E RECUPERAÇÃO
		List<Aluno>alunosAprovados = new ArrayList<Aluno>();
		List<Aluno>alunosRecuperacao = new ArrayList<Aluno>();
		List<Aluno>alunosReprovados = new ArrayList<Aluno>();
		
		//lista for por quantidade de alunos
		   for(int qtd = 1; qtd <=5; qtd ++) {
			   
		
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
	       
	       
	       for(int pos = 1 ; pos <= 1 ; pos ++) {
	    	   
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
	       
	       
	       //Adicionando aluno
	       alunos.add(aluno1);
	       
		   } 
		   //Pecorrendo lista de alunos
		/*   for (Aluno aluno : alunos) {
			   
			
			   //Procurando um aluno e calculando a média
			   if(aluno.getNome().equalsIgnoreCase("mauricio")){
				   //Pecorrendo lista de aluno e removendo
				   alunos.remove(aluno);
				   break;
			   
			   }else {
			   //Metodo toString
	           System.out.println(aluno);
	           System.out.println("Nota do Aluno1: "+ aluno.getMediaNota());
		       System.out.println("Resultado: "+ aluno.getAlunoAprovado2());
		     System.out.println("===============================================================================");
		     // break;
			   }
		}
	       
	    for (Aluno aluno : alunos) {
			System.out.println(" Alunos que sobraram na lista");
			System.out.println(aluno.getNome());
			System.out.println("Suas matérias:");
			
			
			for (Disciplina disciplina : aluno.getDisciplinas()) {
				System.out.println(disciplina.getDisciplina());		
		}  
	      */
		 
		   // Lista para pecorre por posicao alunos
/*	    for(int pos =0 ; pos < alunos.size(); pos++) {
	    	
	    	 Aluno aluno = alunos.get(pos);
	    	 
	    	 //Substituição de um objeto dentro da lista
	    	 if(aluno.getNome().equalsIgnoreCase("Mauricio")){
	    		 
	    		 Aluno trocar = new Aluno();
	    		 trocar.setNome("aluno trocado");
	    		 
	    		 Disciplina disciplina = new Disciplina();
	    		 disciplina.setDisciplina("Matematica");
	    		 disciplina.setNota(9);
	    		 
	    		 
	    		 trocar.getDisciplinas().add(disciplina);
	    		 
	    		 alunos.set(pos, trocar);
	    		 
	    		 aluno = alunos.get(pos);
	    	 }
	    			 
	    	
	    			 
	    	 System.out.println("Aluno = "+ aluno.getNome());
	    	 System.out.println("Media aluno = "+ aluno.getMediaNota());
	    	 System.out.println("Resultado = "+ aluno.getAlunoAprovado2());
	    	 System.out.println("--------------------------------------------------------");
	    	 
          
		// Lista para pecorre disciplina aluno
	 /*   for (Disciplina disc : aluno.getDisciplinas()) {
	     System.out.println("Materia = "+ disc.getDisciplina() +" Nota "+disc.getNota());
	        
	     	     }*/
	     
	     
	     //Lista para pecorrer por posiçao de disciplina é a mesma coisa do for disciplina aluno
	 /*    for(int posd = 0; posd < aluno.getDisciplinas().size() ; posd++ ) {
	    	 Disciplina disc =aluno.getDisciplinas().get(posd);
	    	 System.out.println("Materia = "+ disc.getDisciplina() +" Nota "+disc.getNota());
	    	
	     }
		
	}
*/         
		   //For para pecorre lista de alunos e separando por lista
		   for(Aluno aluno : alunos) {
			   
			   // Se aluno for aprovado será adicionado na lista alunosAprovados
			   if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				   
				   alunosAprovados.add(aluno);
				   }
			   //Senão se aluno ficar de recuperação será adicionado na lista alunosRecuperação
			   else if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				   
				   alunosRecuperacao.add(aluno);
			   }
			   //Senão se aluno for reprovado será adicionado na lista alunosReprovado
			   else if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)){
				  alunosReprovados.add(aluno); 
				  
			   }
			   		   
				   
		   }
			   
		   System.out.println("----------------Lista dos alunos Aprovados-------------------------");
		   for(Aluno aluno : alunosAprovados) {
			   
			   System.out.println("Resultado =  "+ aluno.getNome()+ " com média de = "+aluno.getMediaNota()+" "+ aluno.getAlunoAprovado2());
		   }
             
		   
		   System.out.println("----------------Lista dos alunos Reprovados------------------------");
		   for(Aluno aluno : alunosReprovados) {
			   
			   System.out.println("Resultado = "+ aluno.getNome()+ " com média de = "+aluno.getMediaNota()+" "+ aluno.getAlunoAprovado2());
		   }
		   
		   
		   System.out.println("----------------Lista dos alunos Recuperação-----------------------");
		   for(Aluno aluno : alunosRecuperacao) {
			   
			   System.out.println("Resultado  = "+ aluno.getNome() +" com média de = "+aluno.getMediaNota()+" "+ aluno.getAlunoAprovado2());
		   }
	}
}
