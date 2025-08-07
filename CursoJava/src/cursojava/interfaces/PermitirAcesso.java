package cursojava.interfaces;


//Essa interface será o nosso contrato de autenticação
public interface PermitirAcesso {

	
//	public boolean autenticar(); //Apenas declaração do método
	public boolean autenticar(String login, String senha);//Construtor com parametro 
	
	public boolean autenticar();//Construtor sem parametro
}
