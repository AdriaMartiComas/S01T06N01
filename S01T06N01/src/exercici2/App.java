package exercici2;

public class App {

	public static void main(String[] args) {
		Persona persona1 = new Persona("Adrià", "Martí", 30);
		
		System.out.println(new GenericMethods(persona1, "Soc un String", 32));
		System.out.println(new GenericMethods("Soc un String", persona1 , 32));
		System.out.println(new GenericMethods(32, "souc un string", persona1));
	}

}
