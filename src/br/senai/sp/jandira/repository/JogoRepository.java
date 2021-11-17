package br.senai.sp.jandira.repository;

import br.senai.sp.jandira.model.Jogo;

public class JogoRepository {
	
	private Jogo[] jogos;
	
	public JogoRepository() {
		jogos = new Jogo[4];
	}
	
	public JogoRepository(int quantidadeDeJogos) {
		jogos = new Jogo [quantidadeDeJogos];
	}
	
	public void gravar (Jogo jogo, int posicao) {
		jogos [posicao] = jogo;
	}
	
	public Jogo listarJogos(int posicao) {
		return jogos [posicao];
		
	}
	
	public Jogo[] listarTodos() {
		return jogos;
	}

}
