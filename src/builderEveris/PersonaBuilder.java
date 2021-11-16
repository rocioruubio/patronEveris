package builderEveris;

public class PersonaBuilder implements IBuilder {
	private static Persona person = new Persona();

	public PersonaBuilder() {
	}
	
	public PersonaBuilder nombre(String nombre) {
		this.person.setNombre(nombre);
		return this;
	}
	
	public PersonaBuilder apellido(String apellidos) {
		this.person.setApellidos(apellidos);
		return this;
	}
	
	@Override
	public Persona build() {
		return person;
	}
}
