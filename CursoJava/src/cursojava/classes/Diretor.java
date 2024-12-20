package cursojava.classes;

//Classe (filha) Diretor herdando da classe (Pai) Pessoa
public class Diretor extends Pessoa{
	
	//Atributos da classe Diretor
	private String registroEducacao;
	private int tempoDirecao;
	private String titulacao;
	
	
	
	public String getRegistroEducacao() {
		return registroEducacao;
	}
	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}
	public int getTempoDirecao() {
		return tempoDirecao;
	}
	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	@Override //toString para facilitar a impress�o dos atributos da classe Diretor
	public String toString() {
		return "Diretor [registroEducacao=" + registroEducacao + ", tempoDirecao=" + tempoDirecao + ", titulacao="
				+ titulacao + ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
				+ ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae
				+ ", nomePai=" + nomePai + "]";
	}
	@Override
	//Metodo salario sub escrito da classe pai Pessoa
	public double salario() {
		
		return 5000.00;
	}
	
	
	
	
	
}
