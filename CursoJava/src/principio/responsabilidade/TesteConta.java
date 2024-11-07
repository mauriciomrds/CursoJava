package principio.responsabilidade;

public class TesteConta {

	        
	public static void main(String[]args) {
		
		//Criação do objeto ContaBancaria
		ContaBancaria bancaria = new ContaBancaria();
		bancaria.setDescricao("Conta bancaria do Mauricio");
		
		System.out.println(bancaria);
		
		bancaria.soma100Reais();
		bancaria.soma100Reais();
	 System.out.println(bancaria);
	 
	 bancaria.diminui100Reais();
	 bancaria.diminui100Reais();
	 bancaria.diminui100Reais();
	 System.out.println(bancaria);
	 
	 bancaria.depositoDinheiro(700);
	 System.out.println(bancaria);
	 
	 bancaria.sacarDinheiro(2500);
	 System.out.println(bancaria);
	 
	 bancaria.sacarDinheiro(4600);	
	 System.out.println(bancaria);
	}
}
