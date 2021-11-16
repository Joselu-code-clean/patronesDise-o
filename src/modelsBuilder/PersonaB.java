package modelsBuilder;

public class PersonaB {

	private String nombre = "unknown";
	
	private String apellidos = "unknown";
	
	private byte edad = 0;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public byte getEdad() {
		return edad;
	}

	public void setEdad(byte edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "PersonaB [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "]";
	}

	
	
	
}
