package cursojava.classes;

import cursojava.interfaces.PermitirAcesso;

//Classe (filha) secretario herdando da classe (Pai) Pessoa
public class Secretario extends Pessoa implements PermitirAcesso{

	
	
	
	//Atributos da classe Secretario
	private String registro;
	private String nivelCargo;
	private String experiencia;
	
	private String login;
	private String senha;
	
	
	
	//Construtor com parametro
	public Secretario(String login, String senha) {
		this.login = login;
		this.senha = senha;
		
	}
	
	//Construto padrao
	public Secretario() {
		
	}
	
	
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getNivelCargo() {
		return nivelCargo;
	}
	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	@Override //toString para facilitar a impressão dos atributos da classe Secretario
	public String toString() {
		return "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia
				+ ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + "]";
	}
	@Override
	//Metodo salario sub escrito da classe pai Pessoa heranca @Override
	public double salario() {
		
		return 3000 * 0.9;
	}
	
	/*@Override //método do contrato de autenticação
	public boolean autenticar() {
		
		return login.equals("admin")&& senha.equals("admin");//Retorna true caso a senha seja admin senão false
	}*/
	
	@Override//Autenticar com dois parametros login e senha da classe PermitirAcesso
	public boolean autenticar(String login, String senha) {
		
	//	return login.equals("admin")&& senha.equals("admin");
		this.login = login;
		this.senha = senha;
		return autenticar();
	}
	@Override//Autenticar vazio padrao da classe PermitirAcesso
	public boolean autenticar() {
		
		return login.equals("admin")&& senha.equals("admin");
	}
	
/*	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	*/
	
	
	
	
}
