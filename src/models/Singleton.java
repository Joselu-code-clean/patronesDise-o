package models;

public class Singleton {
	
	private static Singleton instance;
	
	private static Persona persona;
	private String nombre;
	
	private Singleton() {
	}

	public static Singleton getInstance(String nombre) {
	   if (instance == null) {
	            instance = new Singleton();
	            persona = new Persona(nombre);
	            
	   }else {
	   	 System.out.println("No se puede una nueva instancia, ya hay una instancia creada.");
	   }
	   return instance;
	}	

}
