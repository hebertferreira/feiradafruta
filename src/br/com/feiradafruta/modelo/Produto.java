package br.com.feiradafruta.modelo;

import java.math.BigDecimal;
import java.util.GregorianCalendar;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Produto {

	@Id
	@GeneratedValue
	private Integer id;
	
	private String codigo;
	private String nome;
	private BigDecimal preco;
	private GregorianCalendar dataValidade;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="codEmpresa")
	
	private Empresa fornecedor;

	
	public Empresa getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Empresa fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public GregorianCalendar getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(GregorianCalendar dataValidade) {
		this.dataValidade = dataValidade;
	}

}
