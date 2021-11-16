package modelsBuilder;

public class BuilderPersona implements Builder{

	private PersonaB persona = new PersonaB();
	
	
	public BuilderPersona conNombre(String nombre) {
		this.persona.setNombre(nombre);;
		return this;
	}
	
	public BuilderPersona conApellidos(String apellidos) {
		this.persona.setApellidos(apellidos);
		return this;
	}
	
	public BuilderPersona conEdad(byte edad) {
		this.persona.setEdad(edad);
		return this;
	}


	@Override
	public PersonaB build() {
		return this.persona;
	}
	
	
	

}
