package br.senai.sp.jandira.repository;

import br.senai.sp.jandira.model.Fabricante;

public class FabricanteRepository {
	
	private Fabricante[] fabricantes;
	
	public FabricanteRepository() {
		fabricantes = new Fabricante[4];
	}
	
	public FabricanteRepository(int quantidadeDeFabricantes) {
		fabricantes = new Fabricante[quantidadeDeFabricantes];
	}
	
	public void gravar (Fabricante fabricante, int posicao) {
		fabricantes[posicao] = fabricante;
		
	}
	
	public Fabricante listarFabricantes(int posicao) {
		return fabricantes[posicao];
	}
	
	public Fabricante[] listarTodos() {
		return fabricantes;
	}
	
	

}
