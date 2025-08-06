package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

//Realmente e somente receber alguem que tem o contrato da interface PermitirAcesso  e chamar autenticação
public class FuncaoAutenticacao {

	
	private PermitirAcesso permitirAcesso;
	
	//public boolean autenticarAcesso(PermitirAcesso acesso) {
	//	return acesso.autenticar();
	
	public boolean autenticar() {
		return permitirAcesso.autenticar();
			
	}
	//Amarrar mais o acesso
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}
}
