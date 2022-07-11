package exercici2;

public class GenericMethods<T, S, V> {
	T ob1;
	S ob2;
	V ob3;
	
	public GenericMethods(T ob1, S ob2, V ob3) {
		this.ob1 = ob1;
		this.ob2 = ob2;
		this.ob3 = ob3;
	}

	@Override
	public String toString() {
		return "GenericMethods [ob1=" + ob1 + ", ob2=" + ob2 + ", ob3=" + ob3 + "]";
	}
	
	
	
	

}

/* - Exercici 2 Crea una classe anomenada Persona amb els atributs nom, cognom i
* edat. Després crea una classe anomenada GenericMethods amb un mètode genèric
* que accepti tres arguments de tipus genèric. Aquest mètode només ha
* d’imprimir per pantalla els arguments que ha rebut. 
* 
* Al main() de la classe
* principal, crida el mètode genèric amb diferents tipus de paràmetres.
* 
* Exemple: un objecte de la classe Persona, un String i un tipus primitiu.
* 
* D’aquesta manera has comprovat que se li pot passar qualsevol tipus de
* paràmetre i en qualsevol ordre.
*/