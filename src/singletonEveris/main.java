package singletonEveris;

import singletonEveris.Persona;

public class main {
	
	public static void main(String[] args) {
		
		String nombrepersona1="Rocio";
		
		Persona.getSingletonInstance(nombrepersona1);
		
		String nombrepersona2="Fran";
		
		Persona.getSingletonInstance(nombrepersona2);
	}
}
