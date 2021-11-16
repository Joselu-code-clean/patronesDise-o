package patronesDiseño.main;

import models.Persona;
import models.Singleton;
import modelsBuilder.BuilderPersona;
import modelsBuilder.PersonaB;

public class Main {
	
	/* PATRON SINGLETON
	private static Singleton instancia1;
	private static Singleton instancia2;
	 */
	
	/*PATRON BUILDER*/
	private static BuilderPersona builder;
	
	
	public static void main(String[] args) {
        /* COMPROBACION SINGLETON
         * 
        // Comprobamos que tiene la referencia de la primera instancia y la segunda no es una nueva instancia.
        System.out.println(instancia1.getInstance("Baldomero Moya"));
        System.out.println(instancia2.getInstance("Julio Invarato"));  
        */ 
		
		/*COMPROBACION BUILDER*/
		builder = new BuilderPersona();
		
		PersonaB persona = builder.conNombre("Baldomero")
						.conApellidos("Montaraz")
						.build();
		
		System.out.println(persona.toString());
		
		
	}

}
