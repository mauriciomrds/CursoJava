package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

//classe para imprimir dados do aluno, diretor e secretario
public class TestandoClassesFilhas {
	
	public static void main(String[] args) {
		
		
		Aluno aluno = new Aluno();
		aluno.setNome("Mauricio Reis");
		aluno.setNomeMae("Ingra�ia Reis");
		aluno.setIdade(20);		
		
		Diretor diretor = new Diretor();
		diretor.setNome("Paulo Antonio");
		diretor.setTempoDirecao(10);
		diretor.setTitulacao("Diretor");
		diretor.setIdade(50);
		
		Secretario secretario = new Secretario();
		secretario.setNome(" Maria");
		secretario.setRegistro("555");
		secretario.setNivelCargo("Secretr�ria II");
		secretario.setExperiencia(" 5 anos");
		secretario.setIdade(40);
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
	System.out.println(aluno.pessoaMaiorIdade()+ " - " + aluno.msgMaiorIdade());
	System.out.println(diretor.pessoaMaiorIdade());
	System.out.println(secretario.pessoaMaiorIdade());
	
// Se tentar estanciar o objeto Pessoa o java n�o vai deixar acessar o objeto direto, pois est�  no padr�o abstract 
// exemplo: Pessoa pessoa = new Pessoa();
	
	System.out.println("Sal�rio Aluno: "+ aluno.salario());
	System.out.println("Sal�rio Diretor: "+ diretor.salario());
	System.out.println("Sal�rio Secretario: "+ secretario.salario());

   //teste para retornar aluno, diretor e secret�rio, pois todos s�o pessoas isso � poliformismo
	teste(aluno);
	teste(diretor);
	teste(secretario);
	
	//Polimorfismos � extens�o das outras classe, Aluno � uma pessoa, Secret�rio � uma pessoa e Diretor � uma pessoa
	Pessoa pessoa = new Aluno();
	pessoa = secretario;
}
	
	//teste chamando pessoa  e tamb�m invocando o metodo abstrato salario da classe Pai Pessoa
	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa � demais: "+ pessoa.getNome()+
				" e o sal�rio � de: "+ pessoa.salario());
	}
}