package app;

import app.model.Person;

public class Main {

	public static void main(String[] args) {

		Person bob = new Person("Bob", "Sagan");
		Person rebecca = new Person("Rebecca", "Dalvares");

		bob.toString(); // Fonctionne bob n'a pas d'amis.

		System.out.println("---------------------------------------------------");

		bob.getAmis().add(rebecca);

		bob.toString(); // Fonctionne rebecca n'a pas d'amis.

		System.out.println("---------------------------------------------------");

		rebecca.getAmis().add(bob);

		bob.toString(); // Ne fonctionne pas : bob.toString() appel rebecca.toString() qui rappel
						// bob.toString() ect..

	}

}
