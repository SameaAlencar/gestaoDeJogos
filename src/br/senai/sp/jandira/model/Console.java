package br.senai.sp.jandira.model;

public enum Console {
     
	XBOX("X-box"),
    PLAYSTATION ("PlayStation"),
	NITENDOSWITCH("Nitendo Switch"),
	MEGADRIVE("Mega Drive");

	private String descricao;

	
    private Console(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	

}
