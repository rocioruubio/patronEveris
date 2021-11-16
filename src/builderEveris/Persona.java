package builderEveris;

public class Persona {
	private String nombre;
	private static Persona person;

	
	public Persona() {
		
	}
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public static Persona getPerson() {
		return person;
	}
	public static void setPerson(Persona person) {
		Persona.person = person;
	}

	
}
