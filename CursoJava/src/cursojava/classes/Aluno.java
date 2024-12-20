package cursojava.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import cursojava.constantes.StatusAluno;

/* classe que representa objeto Aluno*/ // Heran�a- classe(filha)Aluno vai herdar da classe (Pai) extends Pessoa
public class Aluno extends Pessoa {

	//atributos de Aluno
 private String dataMatricula;
 private String nomeEscola;
 private String serieMatriculado;
 
 
 
  private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

  
public List<Disciplina> getDisciplinas() {
	return disciplinas;
}
public void setDisciplinas(List<Disciplina> disciplinas) {
	this.disciplinas = disciplinas;
}
//Construtor default
  public Aluno() {

}
 //Construtor com um parametro nome definido 
 public Aluno (String nomePadrao) {
 nome = nomePadrao;
 }
 //Construtor com dois parametros definidos  nome e idade
 public Aluno (String nomePadrao, int idadePadrao) {
	 nome = nomePadrao;
	 idade = idadePadrao;
 }
 
 //Metodos  Setter Getter
 //Setter � para adicionar e receber dados do atributo
 //Getter e para resgatar ou retornar os dados atributos
 
 //Recebe dados
 public void setNome(String nome) {
 this.nome = nome;
}
 //Retorna os dados
 public String getNome() {
		return nome;
 }
public int getIdade() {
	return idade;
}
public void setIdade(int idade) {
	this.idade = idade;
}

public String getDataNascimento() {
	return dataNascimento;
}
public void setDataNascimento(String dataNascimento) {
	this.dataNascimento = dataNascimento;
}
public String getRegistroGeral() {
	return registroGeral;
}
public void setRegistroGeral(String registroGeral) {
	this.registroGeral = registroGeral;
}
public String getNumeroCpf() {
	return numeroCpf;
}
public void setNumeroCpf(String numeroCpf) {
	this.numeroCpf = numeroCpf;
}
public String getNomeMae() {
	return nomeMae;
}
public void setNomeMae(String nomeMae) {
	this.nomeMae = nomeMae;
}
public String getNomePai() {
	return nomePai;
}
public void setNomePai(String nomePai) {
	this.nomePai = nomePai;
}
public String getDataMatricula() {
	return dataMatricula;
}
public void setDataMatricula(String dataMatricula) {
	this.dataMatricula = dataMatricula;
}
public String getNomeEscola() {
	return nomeEscola;
}
public void setNomeEscola(String nomeEscola) {
	this.nomeEscola = nomeEscola;
}
public String getSerieMatriculado() {
	return serieMatriculado;
}
public void setSerieMatriculado(String serieMatriculado) {
	this.serieMatriculado = serieMatriculado;
}

/*Metodo para calcular nota do aluno*/
public double getMediaNota() {
	
	double somaNotas = 0;
	for (Disciplina disciplina : disciplinas) {
		somaNotas += disciplina.getNota();
	}
		return somaNotas /disciplinas.size();	
}

/*Metodo para retorna se aluno est� aprovado true ou false*/
public boolean getAlunoAprovado() {
	double media =this.getMediaNota();
	if(media >= 7) {
	return true;	
	}else{
	return false;	
	}
}	
/*Metodo retornando AlunoAprovado em String*/
	public String getAlunoAprovado2() {
		double media =this.getMediaNota();
		if(media >= 7) {
		return StatusAluno.APROVADO;	
		}else if(media>=5 && media<=6.75){
		return	StatusAluno.RECUPERACAO;
		}else {
		return StatusAluno.REPROVADO;	
		}
		
}
	
		


	@Override
	public int hashCode() {
		return Objects.hash(nome, numeroCpf);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(numeroCpf, other.numeroCpf);
	}
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + ", disciplinas=" + disciplinas + "]";
	}
	
	@Override 
	//Pode subscrever metodo
	//metodo pessoaMaiorIdade que foi criado na classe (pai Pessoa) que pode ser recuperado e outra classe
	public boolean pessoaMaiorIdade() {
		
		return idade >= 21;
	}
		public String msgMaiorIdade() {
			return this.pessoaMaiorIdade() ? "Obaa, aluno � maior de idade" :"Ixi, aluno � menor de idade";
			
		}
		@Override
		//Metodo salario sub escrito da classe pai Pessoa   
		public double salario() {
			
			return 1900.00;
		}
		
	}
	

	

