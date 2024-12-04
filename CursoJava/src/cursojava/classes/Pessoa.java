package cursojava.classes;


//Classe pai ou super classe  ou classe master (atributos em comum em todos os objetos das classes filhas ou subclasse)
public abstract class Pessoa {

   //Atributos da classe pai Pessoa
	 protected String nome;
	 protected int idade;
	 protected String dataNascimento;
	 protected String registroGeral;
	 protected String numeroCpf;
	 protected String nomeMae;
	 protected String nomePai;
	 
	 //Metodo abstract salário criado na classe Pai em que todas as classe filha é obrigatório ter
	 public abstract double salario();
	 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	@Override 
	
	//toString para facilitar a impressão dos atributos da classe Pessoa
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", getNome()=" + getNome() + ", getIdade()=" + getIdade() + ", getDataNascimento()="
				+ getDataNascimento() + ", getRegistroGeral()=" + getRegistroGeral() + ", getNumeroCpf()="
				+ getNumeroCpf() + ", getNomeMae()=" + getNomeMae() + ", getNomePai()=" + getNomePai() + "]";
	}
	
	//metodo vai retornar true se for maior de 18  senão vai retorna false
	//metodo não obrigado a ter nas classes filhas
	public boolean pessoaMaiorIdade() {
		return idade >= 18;
	}
	 
}
