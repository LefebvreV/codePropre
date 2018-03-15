package ex3.corrige;

public enum CategorieType {

	/**
	 * Catégorie de mammifere
	 */
	MAMMIFERE("Mammifere"),
	/**
	 * Catégorie de reptile
	 */
	REPTILE("Reptile"),
	/**
	 * Catégorie de poisson
	 */
	POISSON("Poisson");
	
	
	private String type;
	
	/**
	 * Constructeur
	 * @param type
	 */
	private CategorieType(String type){
		this.type = type;
	}
	
	/**
	 * Méthode pour récupérer le type d'un animal
	 * @return le type d'un animal (String)
	 */
	public String getType(){
		return type;
	}
}
