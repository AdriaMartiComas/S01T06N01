package exercici1;

public class App {

	public static void main(String[] args) {

		Cat cat1 = new Cat("Minut");
		Cat cat2 = new Cat("Hippie");
		Cat cat3 = new Cat("Sambal");

		NoGenericMethods ngm = new NoGenericMethods(cat3, cat1, cat2);
		
		System.out.println(ngm);
	}

}
