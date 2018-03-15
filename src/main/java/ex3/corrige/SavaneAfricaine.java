package ex3.corrige;

public class SavaneAfricaine extends ZoneStandard{

	/** TAUX_NOURRITURE : le taux de nourriture pour chaque herbivore */
	public static final double TAUX_NOURRITURE = 10;
	/** NOM : Le nom de la zone qui sera affiché*/
	public static final String  NOM= "la savane africaine";
	
	@Override
	public double getTaux() {
		return TAUX_NOURRITURE;
	}
	
	@Override
	public String getNomZone() {
		return NOM;
	}

	@Override
	public boolean verifHabitat(Animal animal) {
		if(animal.getType().equals(CategorieType.MAMMIFERE) && 
				animal.getComportement().equals(CategorieComportement.HERBIVORE))
			return true;
		return false;
	}

	
}
