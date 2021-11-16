package builderEveris;

import builderEveris.Persona;

public class main {
	public static void main(String[] args) {
		PersonaBuilder personabuilder = new PersonaBuilder();
		
		Persona persona = personabuilder.nombre("Rocio").apellido("Rubio").build();
		
		System.out.println(persona.getNombre());
	}
}
