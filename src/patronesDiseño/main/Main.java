package patronesDiseño.main;

import models.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona1 = Persona.getInstance("Baldomero Moya");
        Persona persona2 = Persona.getInstance("Julio Invarato");
        
        // Comprobamos que tiene la referencia de la primera instancia y la segunda no es una nueva instancia.
        System.out.println(persona1);
        System.out.println(persona2);   
	}

}
