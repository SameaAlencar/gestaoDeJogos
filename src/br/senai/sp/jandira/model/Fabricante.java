package br.senai.sp.jandira.model;

public class Fabricante {
	private String nome;
	private String cidade;
	private String empresa;
	private String anoDeFabricacao;

	public Fabricante(String nome, String pais, String empresa, String anoDeFabricacao) {
		this.nome = nome;
		this.cidade = cidade;
		this.empresa = empresa;
		this.anoDeFabricacao = anoDeFabricacao;
		}
	private String descricao;
	
	private Fabricante(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getAnoDeFabricacao() {
		return anoDeFabricacao;
	}

	public void setAnoDeFabricacao(String anoDeFabricacao) {
		this.anoDeFabricacao = anoDeFabricacao;
	}
	
	
	}
