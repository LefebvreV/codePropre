package ex3.corrige;

public class FermeReptile extends ZoneStandard{

	/** TAUX_NOURRITURE : le taux de nourriture pour chaque reptile */
	public static final double TAUX_NOURRITURE = 0.1;
	/** NOM : Le nom de la zone qui sera affiché*/
	public static final String  NOM= "la ferme a reptile";
	
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
		if(animal.getType().equals(CategorieType.REPTILE))
			return true;
		return false;
	}
}
