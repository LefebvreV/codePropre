package ex3.corrige;

import java.util.ArrayList;
import java.util.List;

import ex3.corrige.Aquarium;
import ex3.corrige.FermeReptile;
import ex3.corrige.SavaneAfricaine;
import ex3.corrige.ZoneCarnivore;

public class Zoo {

	/** nom : Le nom du zoo */
	private String nom;
	private List<ZoneStandard> zones = new ArrayList<ZoneStandard>();
	
	/**
	 * Constructeur
	 * @param nom
	 */
	public Zoo(String nom){
		this.nom = nom;
		zones.add( new SavaneAfricaine());
		zones.add( new ZoneCarnivore());
		zones.add( new FermeReptile());
		zones.add( new Aquarium());
		
	}
	
	/** 
	 * TODO A modifier en addAnimal quand méthode fini et fonctionnel
	 */
	public void addAnimal(String nomAnimal, CategorieType typeAnimal, CategorieComportement comportement){
		Animal animalAjouter = new Animal(nomAnimal, typeAnimal, comportement);
		for (ZoneStandard zone : zones){
			if(zone.verifHabitat(animalAjouter))
				zone.addAnimal(animalAjouter);
		}
	}
	
	/**
	 *  Affiche la liste des animaux selon leur zone
	 */
	public void afficherListeAnimaux(){
		for (ZoneStandard zone : zones){
			zone.afficherAnimaux();;
		}
	}
	
	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
