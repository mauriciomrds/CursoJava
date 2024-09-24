package cursojava.classes;

import java.util.Objects;

/* classe que representa objeto Aluno*/
public class Aluno {

 private String nome;
 private int idade;
 private String dataNascimento;
 private String registroGeral;
 private String numeroCpf;
 private String nomeMae;
 private String nomePai;
 private String dataMatricula;
 private String nomeEscola;
 private String serieMatriculado;
 
 private double nota1;
 private String diciplina1;
 
 private double nota2;
 private String diciplina2;

 private double nota3;
 private String diciplina3;
 
 private double nota4;
 private String diciplina4;
 
 
 
public String getDiciplina1() {
	return diciplina1;
}
public void setDiciplina1(String diciplina1) {
	this.diciplina1 = diciplina1;
}
public String getDiciplina2() {
	return diciplina2;
}
public void setDiciplina2(String diciplina2) {
	this.diciplina2 = diciplina2;
}
public String getDiciplina3() {
	return diciplina3;
}
public void setDiciplina3(String diciplina3) {
	this.diciplina3 = diciplina3;
}
public String getDiciplina4() {
	return diciplina4;
}
public void setDiciplina4(String diciplina4) {
	this.diciplina4 = diciplina4;
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
 //Setter é para adicionar e receber dados do atributo
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

public double getNota1() {
	return nota1;
}
public void setNota1(double nota1) {
	this.nota1 = nota1;
}
public double getNota2() {
	return nota2;
}
public void setNota2(double nota2) {
	this.nota2 = nota2;
}
public double getNota3() {
	return nota3;
}
public void setNota3(double nota3) {
	this.nota3 = nota3;
}
public double getNota4() {
	return nota4;
}
public void setNota4(double nota4) {
	this.nota4 = nota4;
}
/*Metodo para calular nota do aluno*/
public double getMediaNota() {
	return (nota1 + nota2 + nota3 + nota4) / 4;
}
/*Metodo para retorna se aluno está aprovado true ou false*/
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
		return "Aluno está aprovado!";	
		}else if(media>=5 && media<=6.75){
		return	"Aluno de recuperação";
		}else {
		return "Aluno está reprovado!";	
		}
		
}
		
		
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + ", nota1=" + nota1 + ", diciplina1=" + diciplina1 + ", nota2=" + nota2
				+ ", diciplina2=" + diciplina2 + ", nota3=" + nota3 + ", diciplina3=" + diciplina3 + ", nota4=" + nota4
				+ ", diciplina4=" + diciplina4 + "]";
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
	

	}

