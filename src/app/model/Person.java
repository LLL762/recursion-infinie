package app.model;

import java.util.ArrayList;
import java.util.List;

public class Person {

	private String nom;
	private String prenom;
	private List<Person> amis = new ArrayList<>();

	public Person(final String prenom, final String nom) {

		this.nom = nom;
		this.prenom = prenom;
	}

	/**
	 * toString autogénérée par défaut.
	 */
	@Override
	public String toString() {

		System.out.println("appel de toString pour : " + this.prenom);

		return "Person [nom=" + nom + ", prenom=" + prenom + ", amis=" + amis + "]";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(final String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(final String prenom) {
		this.prenom = prenom;
	}

	public List<Person> getAmis() {
		return amis;
	}

}
