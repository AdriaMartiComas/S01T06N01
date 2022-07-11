package exercici1;


public class NoGenericMethods {
	private Cat cat1;
	private Cat cat2;
	private Cat cat3;
	

	public NoGenericMethods(Cat cat1, Cat cat2, Cat cat3) {
		
		this.cat1 = cat1;
		this.cat2 = cat2;
		this.cat3 = cat3;
	}
	public Cat getCat1() {
		return cat1;
	}
	public void setCat1(Cat cat1) {
		this.cat1 = cat1;
	}
	public Cat getCat2() {
		return cat2;
	}
	public void setCat2(Cat cat2) {
		this.cat2 = cat2;
	}
	public Cat getCat3() {
		return cat3;
	}
	public void setCat3(Cat cat3) {
		this.cat3 = cat3;
	}
	@Override
	public String toString() {
		return "NoGenericMethods [cat1=" + cat1 + ", cat2=" + cat2 + ", cat3=" + cat3 + "]";
	}
	
	
	
	
	

}
/*
 * 
 * - Exercici 1 Crea una classe anomenada NoGenericMethods que emmagatzemi tres
 * objectes del mateix tipus, juntament amb els mètodes per a emmagatzemar i
 * extreure aquests objectes i un constructor per a inicialitzar els tres.
 * Comprova que els arguments es poden posar en qualsevol posició en la crida al
 * constructor.
 * 
 * - Exercici 2 Crea una classe anomenada Persona amb els atributs nom, cognom i
 * edat. Després crea una classe anomenada GenericMethods amb un mètode genèric
 * que accepti tres arguments de tipus genèric. Aquest mètode només ha
 * d’imprimir per pantalla els arguments que ha rebut. Al main() de la classe
 * principal, crida el mètode genèric amb diferents tipus de paràmetres.
 * 
 * Exemple: un objecte de la classe Persona, un String i un tipus primitiu.
 * 
 * D’aquesta manera has comprovat que se li pot passar qualsevol tipus de
 * paràmetre i en qualsevol ordre.
 */