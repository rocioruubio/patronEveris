package builderEveris;

public class PersonaBuilder implements IBuilder {
	private String nombre;
	private static Persona person;
	

	public PersonaBuilder(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public Persona build() {
		Persona persona = new Persona();
		persona.setNombre(this.nombre);
		return persona;
	}
}
