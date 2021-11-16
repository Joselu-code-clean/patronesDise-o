package modelsBuilder;

import models.Persona;

public class BuilderPersona implements Builder{

	private BuilderPersona persona;
	
	private String nombre;
	
	private String apellidos;
	
	private byte edad;
	
	public BuilderPersona conNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}
	
	public BuilderPersona conApellidos(String apellidos) {
		this.apellidos = apellidos;
		return this;
	}
	
	public BuilderPersona conEdad(byte edad) {
		this.edad = edad;
		return this;
	}


	@Override
	public PersonaB build() {
		PersonaB persona = new PersonaB();
		persona.setNombre(this.nombre);
		persona.setApellidos(this.apellidos);
		persona.setEdad(this.edad);
		return persona;
	}
	
	
	

}
