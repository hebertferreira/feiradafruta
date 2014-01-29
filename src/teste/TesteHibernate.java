package teste;

import java.util.List;

import br.com.feiradafruta.hibernate.HibernateUtil;
import br.com.feiradafruta.modelo.Pessoa;

public class TesteHibernate {

	public static void main(String[] args) {

		/*
		 * 
		 * Exercicio 1
		 * 
		 * Criar um registro da classe pessoa com nome = Hebert  e idade = 70 ;
		 * 
		 *  Exercicio 2
		 * 
		 *  Verificar no BD se o registro foi realmente salvo, ver o id desse registro e utilizar o hibernate para exlcui-lo ;
		 *  
		 *  Exercicio 3
		 * 
		 * Criar de uma vez só 3 registros no banco ( Pessoa 1, 2,3) (Renan, Hebert, Daniel)e idade ( 1000, 2000, 3000) ;
		 * Uma versão com 3 objetos e outra versão utilizando "for"
		 * 
		 * Exercicio 4
		 * 
		 * Listar todos esses registros e imprimir na tela.
		 * 
		 * TESTE GITHUB!!!
		 */
		
		
		exercicio1();
		exercicio2();
		exercicio3();
		exercicio4();

	}
	
	public static void exercicio1(){
		
		Pessoa corno = new Pessoa();
		
		corno.setNome("Hebert");
		corno.setIdade(70);
		
		HibernateUtil.salvarOuAtualizar(corno);
		
		
	}
	
	
	public static void exercicio2(){
		
		Pessoa corno = new Pessoa();
		
		corno.setId(2);
		
		//HibernateUtil.deletar(corno);
				
	}
	
	
	public static void exercicio3(){
		
		Pessoa corno = new Pessoa();
		corno.setNome("Renan");
		corno.setIdade(1000);
		
		Pessoa corno2 = new Pessoa();
		corno2.setNome("Hebert");
		corno2.setIdade(2000);
		
		Pessoa corno3 = new Pessoa();
		corno3.setNome("Daniel");
		corno3.setIdade(3000);
		
		HibernateUtil.salvarOuAtualizar(corno);
		HibernateUtil.salvarOuAtualizar(corno2);
		HibernateUtil.salvarOuAtualizar(corno3);
		
		//=== com for
		
		for(int i = 0;i<3;i++){
			
			Pessoa sbrebous = new Pessoa();
			sbrebous.setNome("nome igual a "+i);
			sbrebous.setIdade(i);
			
			HibernateUtil.salvarOuAtualizar(sbrebous);
			
		}
	}
	
	
	public static void exercicio4(){
		
		List pessoas = HibernateUtil.listar(new Pessoa());
		
		for(Object objeto:pessoas){
			
			Pessoa p = (Pessoa) objeto;
			
			System.out.print(p.getNome()+" ");
			System.out.println(p.getIdade());
		}
	}
	
}








