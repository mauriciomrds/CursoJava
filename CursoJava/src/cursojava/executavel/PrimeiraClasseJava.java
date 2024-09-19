package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
	 
      Aluno aluno1 = new Aluno();//joão
       aluno1.setNome("Joao da Silva");
       aluno1.setIdade(16);
       aluno1.setRegistroGeral("479.645.987.61");
       aluno1.setNumeroCpf("28.897.678.89");
       aluno1.setNomeMae("Maria da Penha");
       aluno1.setNomePai("Antonio Silva");
       aluno1.setDataMatricula("22/03/2023");
       aluno1.setNomeEscola("Colegio Talento");
       aluno1.setSerieMatriculado("778");
       aluno1.setNota1(10);
       aluno1.setNota2(5);
       aluno1.setNota3(5);
       aluno1.setNota4(8);
       
       System.out.println("===============================================================================");
       
       System.out.println("Nome do Aluno1: "+ aluno1.getNome());
       System.out.println("Idade do Aluno1: "+ aluno1.getIdade());
       System.out.println("RG do Aluno1: "+ aluno1.getRegistroGeral());
       System.out.println("CPF do Aluno1: "+ aluno1.getNumeroCpf());
       System.out.println("Nome da Mãe do Aluno1: "+ aluno1.getNomeMae());
       System.out.println("Nome do Pai do Aluno1: "+ aluno1.getNomePai());
       System.out.println("Data da Matricula do Aluno1: "+ aluno1.getDataMatricula());
       System.out.println("Nome do Colegio do Aluno1: "+ aluno1.getNomeEscola());
       System.out.println("Numero do registro do Aluno1: "+ aluno1.getSerieMatriculado());
       System.out.println("Nota do Aluno1: "+ aluno1.getMediaNota());
     //  System.out.println("Resultado Aluno1: "+ (aluno1.getAlunoAprovado()?"Aprovado":"Reprovado"));
       System.out.println("Resultado 2: "+ aluno1.getAlunoAprovado2());
       
       System.out.println("===============================================================================");
      
      Aluno aluno2 = new Aluno();//pedro
      aluno2.setNome("Pedro Oliveira");
      aluno2.setIdade(16);
      aluno2.setRegistroGeral("879.649.987.61");
      aluno2.setNumeroCpf("328.897.678.89");
      aluno2.setNomeMae("Marina da Penha");
      aluno2.setNomePai("Joaquim Silva");
      aluno2.setDataMatricula("22/03/2023");
      aluno2.setNomeEscola("Colegio Talento");
      aluno2.setSerieMatriculado("779");
      aluno2.setNota1(6);
      aluno2.setNota2(4);
      aluno2.setNota3(8);
      aluno2.setNota4(5);
                      
      System.out.println("Nome do Aluno2: "+ aluno2.getNome());
      System.out.println("Idade do Aluno2: "+ aluno2.getIdade());
      System.out.println("RG do Aluno2: "+ aluno2.getRegistroGeral());
      System.out.println("CPF do Aluno2: "+ aluno2.getNumeroCpf());
      System.out.println("Nome da Mãe do Aluno2: "+ aluno2.getNomeMae());
      System.out.println("Nome do Pai do Aluno2: "+ aluno2.getNomePai());
      System.out.println("Data da Matricula do Aluno2: "+ aluno2.getDataMatricula());
      System.out.println("Nome do Colegio do Aluno2: "+ aluno2.getNomeEscola());
      System.out.println("Numero do registro do Aluno2: "+ aluno2.getSerieMatriculado());
      System.out.println("Nota do Aluno2: "+ aluno2.getMediaNota());
      //System.out.println("Resultado Aluno2: "+ (aluno2.getAlunoAprovado()?"Aprovado":"Reprovado"));
      System.out.println("Resultado 2: "+ aluno2.getAlunoAprovado2());
     
      System.out.println("===============================================================================");
      
      Aluno aluno3 = new Aluno();//alex
      aluno3.setNome("Alex Santos");
      aluno3.setIdade(16);
      aluno3.setRegistroGeral("79.749.987.68");
      aluno3.setNumeroCpf("32.896.678.80");
      aluno3.setNomeMae("Karina da Penha");
      aluno3.setNomePai("Fabio Silva");
      aluno3.setDataMatricula("22/03/2023");
      aluno3.setNomeEscola("Colegio Talento");
      aluno3.setSerieMatriculado("780");
      aluno3.setNota1(9);
      aluno3.setNota2(9);
      aluno3.setNota3(7);
      aluno3.setNota4(4);
            
      System.out.println("Nome do Aluno3: "+ aluno3.getNome());
      System.out.println("Idade do Aluno3: "+ aluno3.getIdade());
      System.out.println("RG do Aluno3: "+ aluno3.getRegistroGeral());
      System.out.println("CPF do Aluno3: "+ aluno3.getNumeroCpf());
      System.out.println("Nome da Mãe do Aluno3: "+ aluno3.getNomeMae());
      System.out.println("Nome do Pai do Aluno3: "+ aluno3.getNomePai());
      System.out.println("Data da Matricula do Aluno3: "+ aluno3.getDataMatricula());
      System.out.println("Nome do Colegio do Aluno3: "+ aluno3.getNomeEscola());
      System.out.println("Numero do registro do Aluno3: "+ aluno3.getSerieMatriculado());
      System.out.println("Nota do Aluno3: "+ aluno3.getMediaNota());
     // System.out.println("Resultado Aluno3: "+ (aluno3.getAlunoAprovado()?"Aprovado":"Reprovado"));
      System.out.println("Resultado 2: "+ aluno3.getAlunoAprovado2());
      
      System.out.println("===============================================================================");
      
      /*Aluno criado definido no constutor com um parametro nomePadrão*/
      Aluno aluno4 = new Aluno("Maria");
      
      /*Aluno criado definido no constutor com dois parametro nomePadrão e idadePadrão*/
      Aluno aluno5 = new Aluno("Paulo", 35);
      
	}

}
