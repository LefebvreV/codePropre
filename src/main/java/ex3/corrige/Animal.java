package ex3.corrige;

public class Animal {

	private CategorieType type;
	private CategorieComportement comportement;
	private String nom;
	
	public Animal(String nom, CategorieType type, CategorieComportement comportement){
		this.type = type;
		this.comportement = comportement;
		this.nom = nom;
	}

	/**
	 * @return the type
	 */
	public CategorieType getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(CategorieType type) {
		this.type = type;
	}

	/**
	 * @return the comportement
	 */
	public CategorieComportement getComportement() {
		return comportement;
	}

	/**
	 * @param comportement the comportement to set
	 */
	public void setComportement(CategorieComportement comportement) {
		this.comportement = comportement;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
