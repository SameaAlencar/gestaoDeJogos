package br.senai.sp.jandira.repository;

import br.senai.sp.jandira.model.Fabricante;

public class FabricanteRepository {

	Fabricante[] fabricante;

	public FabricanteRepository() {
		  this.fabricante = new Fabricante[4];
	      fabricante[0] = new Fabricante ("X-box", "Washington", "Microsoft", "2001");
          fabricante[1] = new Fabricante ("PlayStation", "Tóquio", "Sony Interactive Entertainment", "1994" ); 
          fabricante[2] = new Fabricante ("Nitendo Switch", "Quioto", "NITENDO", "1889");
          fabricante[3] = new Fabricante ("Mega drive", "Japão", "SEGA", "1988");
			 }

	public Fabricante[] getArray() {
		
		return this.fabricante;
		
	}
	
}


