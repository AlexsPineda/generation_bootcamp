package com.pokemon;

public class Main {

	public static void main(String[] args) {
//		Pokemon chikorita = new Pokemon(152,1,120,"chikorita", false);
//		
//		chikorita.atacar();
//		chikorita.comer();
//		chikorita.dormir();

		TipoPlanta chikorita2 = new TipoPlanta(152,1,120,"chikorita 2 ", false,1);
		
		chikorita2.dormir();
		chikorita2.envenenar();
		
		Chikorita chikorita3 = new Chikorita(152,1,120,"chikorita 3 ", false,1,8);
		chikorita3.dormir();
		chikorita3.envenenar();
		chikorita3.comer();
		chikorita3.latigo();
		
		Charmander charmander = new Charmander(152,1,120,"charmander ", false);
		charmander.araniar();
	
	}

}
