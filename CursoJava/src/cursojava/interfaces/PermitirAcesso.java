package cursojava.interfaces;


//Essa interface ser� o nosso contrato de autentica��o
public interface PermitirAcesso {

	
//	public boolean autenticar(); //Apenas declara��o do m�todo
	public boolean autenticar(String login, String senha);//Construtor com parametro 
	
	public boolean autenticar();//Construtor sem parametro
}
