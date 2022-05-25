package com.pokemon;

public class Charmander extends Pokemon implements TipoFuego, TipoAgua {

	public Charmander(int id, int edad,int nivel,String nombre, boolean evolucion) {
		super(id,edad,nivel,nombre,evolucion);
	}
	@Override
	public void lanzaLlamas() {
		System.out.println("lanzaLlamas");
		
	}

	@Override
	public void araniar() {
		System.out.println(getNombre()+" arañar");
		
	}
	@Override
	public void saludo(String mensaje) {
		// TODO Auto-generated method stub
		
	}

}
