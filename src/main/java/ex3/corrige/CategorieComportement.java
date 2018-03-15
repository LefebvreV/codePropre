package ex3.corrige;

public enum CategorieComportement {
	/**
	 * Type d'animaux carnivore
	 */
	CARNIVORE("Carnivore"),
	/**
	 * Type d'animaux herbivore
	 */
	HERBIVORE("Herbivore");
	
	
	private String type;
	
	/**
	 * Constructeur
	 * @param type
	 */
	private CategorieComportement(String type){
		this.type = type;
	}
	
	/**
	 * Méthode pour récupérer le type de comportement de l'animal
	 * @return le type de comportement (String)
	 */
	public String getType(){
		return type;
	}
	
}
