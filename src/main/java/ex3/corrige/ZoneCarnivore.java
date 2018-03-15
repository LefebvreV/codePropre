package ex3.corrige;

public class ZoneCarnivore extends ZoneStandard{

	/** TAUX_NOURRITURE : le taux de nourriture pour chaque carnivore */
	public static final double TAUX_NOURRITURE = 10;
	/** NOM : le nom de la zone qui sera affiché */
	public static final String  NOM= "la zone carnivore";
	
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
				animal.getComportement().equals(CategorieComportement.CARNIVORE))
			return true;
		return false;
	}

}
