package teste;

import java.util.List;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.GregorianCalendar;

import br.com.feiradafruta.hibernate.HibernateUtil;
import br.com.feiradafruta.modelo.Empresa;
import br.com.feiradafruta.modelo.Produto;

public class ParaCasa {

	public static void main(String[] args) {
		
		/*
		 * 
		 * Exercicio 1
		 * 
		 * 
		 * salvar varios produtos no Banco, cada produto deverá ter cod., preço,
		 * data de validade diferentes; Fazer manualmente e com FOR
		 * 
		 * 
		 * Exercicio 2
		 * 
		 * Buscar todos os produtos do BD e exibir na tela
		 * 
		 * 
		 * Exercicio 3
		 * 
		 * Excluir todos os produtos sem utilizar o id;
		 */

		exercicio1();
      //exercicio2();
	  //exercicio3();
		exercicio4();
	

	}

	public static void exercicio1() {

		for (int i = 0; i < 10; i++) {
			Produto budega = new Produto();
			budega.setCodigo("AABB00" + i);
			budega.setNome("budega" + i);
			budega.setPreco(new BigDecimal(0.99 + i));
			budega.setDataValidade(new GregorianCalendar(2014, 0, i + 1));

			HibernateUtil.salvarOuAtualizar(budega);
		}
	}
/*	
	public static void exercicio2() {
		
		List porcarias = HibernateUtil.listar(new Produto());
		
		for(Object objeto:porcarias){
			
			Produto p = (Produto) objeto;
			
			System.out.print(p.getCodigo()+" - ");
			System.out.print(p.getNome()+" - ");
			System.out.println(NumberFormat.getCurrencyInstance().format(p.getPreco()) + " - ");
			System.out.println("-----------------------------------------------");
		}
	}
	
	public static void exercicio3(){
		
		List porcarias = HibernateUtil.listar(new Produto());
		
		for(Object objeto:porcarias){
			
			Produto p = (Produto) objeto;
			
			HibernateUtil.deletar(p);
		}
		

		
	}
	*/
	
	public static void exercicio4(){
		
		for(int j=0; j<10;j++){
			
			Empresa marca = new Empresa();
			marca.setCodEmpresa("AF"+j);
			marca.setNome("Empresa"+j);
			
			HibernateUtil.salvarOuAtualizar(marca);
		}
		
	}
}