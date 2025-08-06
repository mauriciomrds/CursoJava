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
		aluno.setNomeMae("Ingraçia Reis");
		aluno.setIdade(20);		
		
		Diretor diretor = new Diretor();
		diretor.setNome("Paulo Antonio");
		diretor.setTempoDirecao(10);
		diretor.setTitulacao("Diretor");
		diretor.setIdade(50);
		
		Secretario secretario = new Secretario();
		secretario.setNome(" Maria");
		secretario.setRegistro("555");
		secretario.setNivelCargo("Secretrária II");
		secretario.setExperiencia(" 5 anos");
		secretario.setIdade(40);
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
	System.out.println(aluno.pessoaMaiorIdade()+ " - " + aluno.msgMaiorIdade());
	System.out.println(diretor.pessoaMaiorIdade());
	System.out.println(secretario.pessoaMaiorIdade());
	
// Se tentar estanciar o objeto Pessoa o java não vai deixar acessar o objeto direto, pois está  no padrão abstract 
// exemplo: Pessoa pessoa = new Pessoa();
	
	System.out.println("Salário Aluno: "+ aluno.salario());
	System.out.println("Salário Diretor: "+ diretor.salario());
	System.out.println("Salário Secretario: "+ secretario.salario());

   //teste para retornar aluno, diretor e secretário, pois todos são pessoas isso é poliformismo
	teste(aluno);
	teste(diretor);
	teste(secretario);
	
	//Polimorfismos é extensão das outras classe, Aluno é uma pessoa, Secretário é uma pessoa e Diretor é uma pessoa
	Pessoa pessoa = new Aluno();
	pessoa = secretario;
}
	
	//teste chamando pessoa  e também invocando o metodo abstrato salario da classe Pai Pessoa
	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa é demais: "+ pessoa.getNome()+
				" e o salário é de: "+ pessoa.salario());
	}
}