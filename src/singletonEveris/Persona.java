package singletonEveris;

public class Persona {
	private String nombre;
	private static Persona person;

	private Persona(String nombre) {
		this.nombre = nombre;
		System.out.println("Nombre: " + this.nombre);
	}

	public static Persona getSingletonInstance(String nombre) {
		if (person == null){
			person = new Persona(nombre);
		}
		else{
			System.out.println("No se ha popdido crear "+ nombre + " porque ya existe.");
		}

		return person;
	}
}
