package br.senai.sp.jandira.model;

public class Jogo {

	private String titulo;
	private Fabricante fabricante;
	private Console console;
	private String valorEstimado;
	private String jogo;
	private String observacoes;

	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public Console getConsole() {
		return console;
	}

	public void setConsole(Console console) {
		this.console = console;
	}

	public String getValorEstimado() {
		return valorEstimado;
	}

	public void setValorEstimado(String valorEstimado) {
		this.valorEstimado = valorEstimado;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

}
