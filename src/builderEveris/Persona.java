package builderEveris;

public class Persona {
	private String nombre;
	private String apellidos;
	private static Persona person;

	
	public Persona() {
		
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

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	
	
}
