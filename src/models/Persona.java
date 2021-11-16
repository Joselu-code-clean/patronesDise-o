package models;

public class Persona {
	
	private static Persona instance;
	private String nombre;
	
	private Persona(String nombre) {
		this.nombre = nombre;
	}
	
	public static Persona getInstance(String nombre) {
		 if (instance == null) {
	            instance = new Persona(nombre);
        }else {
        	 System.out.println("No se puede crear el objeto "+ nombre + " porque ya existe un objeto instanciado.");
        }
        return instance;
	}	

}
