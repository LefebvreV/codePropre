package ex3.corrige;

public class Aquarium extends ZoneStandard{

	/** TAUX_NOURRITURE : le taux de nourriture pour chaque poisson */
	public static final double TAUX_NOURRITURE = 0.2;
	/** NOM : Le nom de la zone qui sera affiché*/
	public static final String  NOM= "l'aquarium";
 	
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
		if(animal.getType().equals(CategorieType.POISSON))
			return true;
		return false;
	}

}
