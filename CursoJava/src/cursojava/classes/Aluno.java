package cursojava.classes;
/* classe que representa objeto Aluno*/
public class Aluno {

 private String nome;
 private int idade;
 private String registroGeral;
 private String numeroCpf;
 private String nomeMae;
 private String nomePai;
 private String dataMatricula;
 private String nomeEscola;
 private String serieMatriculado;
 
 private double nota1;
 private double nota2;
 private double nota3;
 private double nota4;
 
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
		return "Aluno est� aprovado!";	
		}else if(media>=5 && media<=6.75){
		return	"Aluno de recupera��o";
		}else {
		return "Aluno est� reprovado!";	
		}
}
}
